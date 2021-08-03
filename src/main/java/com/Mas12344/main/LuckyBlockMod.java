package com.Mas12344.main;

import com.Mas12344.main.enchantments.OmnivampEnchant;
import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
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
    }


}
