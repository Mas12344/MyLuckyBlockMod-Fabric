package com.Mas12344.main;

import com.Mas12344.main.armor_material.BlackInfusedNetherite;
import com.Mas12344.main.armor_material.RedInfusedNetherite;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    //Red rune variant
    public static final ArmorMaterial RED_INFUSED_NETHERITE_MATERIAL = new RedInfusedNetherite();
    public static final Item RED_INFUSED_NETHERITE_HELMET = new ArmorItem(RED_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RED_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(RED_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RED_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(RED_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RED_INFUSED_NETHERITE_BOOTS = new ArmorItem(RED_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //Black rune variant
    public static final ArmorMaterial BLACK_INFUSED_NETHERITE_MATERIAL = new BlackInfusedNetherite();
    public static final Item BLACK_INFUSED_NETHERITE_HELMET = new ArmorItem(BLACK_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BLACK_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(BLACK_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BLACK_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(BLACK_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BLACK_INFUSED_NETHERITE_BOOTS = new ArmorItem(BLACK_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register(){
        //Red rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_helmet"), RED_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_chestplate"), RED_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_leggings"), RED_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "red_infused_netherite_boots"), RED_INFUSED_NETHERITE_BOOTS);
        //Black rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "black_infused_netherite_helmet"), BLACK_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "black_infused_netherite_chestplate"), BLACK_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "black_infused_netherite_leggings"), BLACK_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "black_infused_netherite_boots"), BLACK_INFUSED_NETHERITE_BOOTS);
    }
}
