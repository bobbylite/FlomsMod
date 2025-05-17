package com.bobbylite;

import java.util.concurrent.CompletableFuture;

import com.bobbylite.item.ModItems;

import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class FabricDocsReferenceRecipeProvider extends FabricRecipeProvider {
	public FabricDocsReferenceRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {
			@Override
			public void generate() {
			    createShapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.DILDO_OF_DESTINY, 1) 
					.input(Items.DIRT)
					.criterion(hasItem(Items.DIRT), conditionsFromItem(Items.DIRT))
					.offerTo(exporter);
			}
		};
	}

	@Override
	public String getName() {
		return "FabricDocsReferenceRecipeProvider";
	}
}