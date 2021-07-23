package com.Mas12344.main;

import com.Mas12344.main.armor_material.InfusedNetherite;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public static final ArmorMaterial INFUSED_NETHERITE_MATERIAL = new InfusedNetherite();
    public static final Item INFUSED_NETHERITE_HELMET = new ArmorItem(INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item INFUSED_NETHERITE_LEGGINGS = new ArmorItem(INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item INFUSED_NETHERITE_BOOTS = new ArmorItem(INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register(){
        //Red rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_helmet"), INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_chestplate"), INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_leggings"), INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_boots"), INFUSED_NETHERITE_BOOTS);
    }
}
