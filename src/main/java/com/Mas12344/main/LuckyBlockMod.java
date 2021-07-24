package com.Mas12344.main;

import com.Mas12344.main.enchantments.OmnivampEnchant;
import com.Mas12344.main.items.RedRune;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.Mas12344.main.blocks.LuckyBlock;

public class LuckyBlockMod implements ModInitializer{

    public static final LuckyBlock Lucky_Block = new LuckyBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.25f));
    private static final Enchantment Omnivamp = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("lb_mod", "omnivamp"),
            new OmnivampEnchant()
    );
    public static final RedRune Red_Rune_Item = new RedRune(new FabricItemSettings().group(ItemGroup.MISC).maxCount(16));


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
        Registry.register(Registry.ITEM,
                new Identifier("lb_mod", "red_rune"),
                Red_Rune_Item
        );

        RegisterItems.register();
        /*
        ServerTickEvents.END_WORLD_TICK.register((world -> {
            for(PlayerEntity player: world.getPlayers()){
                for(ItemStack armorPiece: player.getArmorItems()){
                    if(armorPiece.)
                }
            }
        }));
        */

    }




}
