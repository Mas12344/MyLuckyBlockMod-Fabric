package com.Mas12344.main;

import com.Mas12344.main.armor_material.*;
import com.Mas12344.main.blocks.LuckyBlock;
import com.Mas12344.main.items.Rune;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
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
    //Blue rune variant
    public static final ArmorMaterial BLUE_INFUSED_NETHERITE_MATERIAL = new BlueInfusedNetherite();
    public static final Item BLUE_INFUSED_NETHERITE_HELMET = new ArmorItem(BLUE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BLUE_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(BLUE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BLUE_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(BLUE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BLUE_INFUSED_NETHERITE_BOOTS = new ArmorItem(BLUE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //Green rune variant
    public static final ArmorMaterial GREEN_INFUSED_NETHERITE_MATERIAL = new GreenInfusedNetherite();
    public static final Item GREEN_INFUSED_NETHERITE_HELMET = new ArmorItem(GREEN_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item GREEN_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(GREEN_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item GREEN_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(GREEN_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item GREEN_INFUSED_NETHERITE_BOOTS = new ArmorItem(GREEN_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //Orange rune variant
    public static final ArmorMaterial ORANGE_INFUSED_NETHERITE_MATERIAL = new OrangeInfusedNetherite();
    public static final Item ORANGE_INFUSED_NETHERITE_HELMET = new ArmorItem(ORANGE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item ORANGE_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(ORANGE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item ORANGE_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(ORANGE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item ORANGE_INFUSED_NETHERITE_BOOTS = new ArmorItem(ORANGE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //Purple rune variant
    public static final ArmorMaterial PURPLE_INFUSED_NETHERITE_MATERIAL = new PurpleInfusedNetherite();
    public static final Item PURPLE_INFUSED_NETHERITE_HELMET = new ArmorItem(PURPLE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(PURPLE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(PURPLE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item PURPLE_INFUSED_NETHERITE_BOOTS = new ArmorItem(PURPLE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //Yellow rune variant
    public static final ArmorMaterial YELLOW_INFUSED_NETHERITE_MATERIAL = new YellowInfusedNetherite();
    public static final Item YELLOW_INFUSED_NETHERITE_HELMET = new ArmorItem(YELLOW_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item YELLOW_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(YELLOW_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item YELLOW_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(YELLOW_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item YELLOW_INFUSED_NETHERITE_BOOTS = new ArmorItem(YELLOW_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //White rune variant
    public static final ArmorMaterial WHITE_INFUSED_NETHERITE_MATERIAL = new WhiteInfusedNetherite();
    public static final Item WHITE_INFUSED_NETHERITE_HELMET = new ArmorItem(WHITE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item WHITE_INFUSED_NETHERITE_CHESTPLATE = new ArmorItem(WHITE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item WHITE_INFUSED_NETHERITE_LEGGINGS = new ArmorItem(WHITE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item WHITE_INFUSED_NETHERITE_BOOTS = new ArmorItem(WHITE_INFUSED_NETHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    //Runes
    public static final Rune Red_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune Green_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune Black_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune Blue_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune Orange_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune Purple_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune White_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));
    public static final Rune Yellow_Rune_Item = new Rune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));

    //Lucky Block
    public static final LuckyBlock Lucky_Block = new LuckyBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.25f));

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
        //Blue rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "blue_infused_netherite_helmet"), BLUE_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "blue_infused_netherite_chestplate"), BLUE_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "blue_infused_netherite_leggings"), BLUE_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "blue_infused_netherite_boots"), BLUE_INFUSED_NETHERITE_BOOTS);
        //Green rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "green_infused_netherite_helmet"), GREEN_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "green_infused_netherite_chestplate"), GREEN_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "green_infused_netherite_leggings"), GREEN_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "green_infused_netherite_boots"), GREEN_INFUSED_NETHERITE_BOOTS);
        //Orange rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "orange_infused_netherite_helmet"), ORANGE_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "orange_infused_netherite_chestplate"), ORANGE_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "orange_infused_netherite_leggings"), ORANGE_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "orange_infused_netherite_boots"), ORANGE_INFUSED_NETHERITE_BOOTS);
        //Purple rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "purple_infused_netherite_helmet"), PURPLE_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "purple_infused_netherite_chestplate"), PURPLE_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "purple_infused_netherite_leggings"), PURPLE_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "purple_infused_netherite_boots"), PURPLE_INFUSED_NETHERITE_BOOTS);
        //Yellow rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "yellow_infused_netherite_helmet"), YELLOW_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "yellow_infused_netherite_chestplate"), YELLOW_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "yellow_infused_netherite_leggings"), YELLOW_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "yellow_infused_netherite_boots"), YELLOW_INFUSED_NETHERITE_BOOTS);
        //White rune variant
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "white_infused_netherite_helmet"), WHITE_INFUSED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "white_infused_netherite_chestplate"), WHITE_INFUSED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "white_infused_netherite_leggings"), WHITE_INFUSED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("lb_mod", "white_infused_netherite_boots"), WHITE_INFUSED_NETHERITE_BOOTS);


        //Runes
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "lucky_block"),
                new BlockItem(Lucky_Block, new FabricItemSettings().group(ItemGroup.MISC))
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "red_rune"),
                Red_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "green_rune"),
                Green_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "black_rune"),
                Black_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "blue_rune"),
                Blue_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "orange_rune"),
                Orange_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "purple_rune"),
                Purple_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "white_rune"),
                White_Rune_Item
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "yellow_rune"),
                Yellow_Rune_Item
        );

        //Lucky block
        Registry.register(Registry.BLOCK,
                new Identifier("lb_mod", "lucky_block"),
                Lucky_Block
        );
    }
}
