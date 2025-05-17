package com.bobbylite.item;

import com.bobbylite.FlomsMod;
import com.bobbylite.toolproperties.ToolProperties;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
        private static final ToolMaterial MODDED_GOLD = new 
                ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 1561, 12.0F, 9.0F, 22, ItemTags.GOLD_ORES);
        private static final ToolMaterial DILDO_OF_DESTINY_MATERIAL = MODDED_GOLD;

        public static final Item DILDO_OF_DESTINY = register("dildo_of_destiny",
                (settings) -> new PickaxeItem(DILDO_OF_DESTINY_MATERIAL, 
                                ToolProperties.HIGH_ATTACK_DAMAGE, 
                                ToolProperties.DEFAULT_ATTACK_SPEED, 
                                settings.fireproof().maxDamage(ToolProperties.UNBREAKABLE)
                        ),
                new Item.Settings());

        private static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FlomsMod.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
        }

        private static void addIngredients(FabricItemGroupEntries entries) {
        }

        private static void addToolMaterials(FabricItemGroupEntries entries) {
                entries.add(DILDO_OF_DESTINY);
        }

        public static void initialize() {
                FlomsMod.LOGGER.info(
                        "Registering Mod Items for {}", FlomsMod.MOD_ID
                );

                ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                        .register(ModItems::addIngredients);
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                        .register(ModItems::addToolMaterials);
        }
}

