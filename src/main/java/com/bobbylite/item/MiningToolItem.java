package com.bobbylite.item;

import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class MiningToolItem extends Item {
	public MiningToolItem(ToolMaterial material, TagKey<Block> effectiveBlocks, float attackDamage, float attackSpeed, Item.Settings settings) {
		super(material.applyToolSettings(settings, effectiveBlocks, attackDamage, attackSpeed, attackSpeed));
	}

	@Override
	public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		stack.damage(2, attacker, EquipmentSlot.MAINHAND);
	}
}
