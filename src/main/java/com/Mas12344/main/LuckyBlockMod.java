package com.Mas12344.main;

import com.Mas12344.main.enchantments.OmnivampEnchant;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.Mas12344.main.blocks.LuckyBlock;

public class LuckyBlockMod implements ModInitializer{

    public static final LuckyBlock Lucky_Block = new LuckyBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1.0f));
    private static final Enchantment Omnivamp = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("lb_mod", "omnivamp"),
            new OmnivampEnchant()
    );


    @Override
    public void onInitialize(){
        System.out.println("I'm feeling lucky!");
        Registry.register(Registry.BLOCK,
                new Identifier("lb_mod", "lucky_block"),
                Lucky_Block
        );
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "lucky_block"),
                new BlockItem(Lucky_Block, new FabricItemSettings().group(ItemGroup.MISC))
        );


    }


}
