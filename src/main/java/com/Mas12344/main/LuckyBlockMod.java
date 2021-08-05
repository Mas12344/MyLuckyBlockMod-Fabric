package com.Mas12344.main;

import com.Mas12344.main.enchantments.OmnivampEnchant;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class LuckyBlockMod implements ModInitializer{


    private static final Enchantment Omnivamp = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("lb_mod", "omnivamp"),
            new OmnivampEnchant()
    );


    @Override
    public void onInitialize(){
        System.out.println("I'm feeling lucky!");
        RegisterItems.register();

        ServerTickEvents.END_WORLD_TICK.register((world)->
        {
            for(PlayerEntity player: world.getPlayers()){
                int counter = 0;
                for(ItemStack armor: player.getArmorItems()){
                    if(armor.getItem() instanceof ArmorItem){
                        ArmorItem ai = (ArmorItem) armor.getItem();
                        if(ai.getMaterial() == RegisterItems.GREEN_INFUSED_NETHERITE_MATERIAL){
                            counter++;
                        }
                    }
                }

                if(counter > 0){
                    player.addStatusEffect(
                            new StatusEffectInstance(
                                    StatusEffects.HASTE,
                                    5,
                                    counter-1,
                                    true,
                                    false
                            )
                    );
                }

            }

        });


    }


}
