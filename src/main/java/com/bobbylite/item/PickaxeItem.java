package com.bobbylite.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class PickaxeItem extends MiningToolItem {
	public PickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
		super(material, BlockTags.PICKAXE_MINEABLE, attackDamage, attackSpeed, settings);
	}
}
