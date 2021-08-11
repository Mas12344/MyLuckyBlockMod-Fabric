package com.Mas12344.main;

import com.Mas12344.main.enchantments.OmnivampEnchant;
import com.Mas12344.main.enchantments.PullingEnchant;
import com.Mas12344.main.entities.test_shoulder_entity.TestShoulderEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class LuckyBlockMod implements ModInitializer{


    private static final Enchantment Omnivamp = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("lb_mod", "omnivamp"),
            new OmnivampEnchant()
    );

    private static final Enchantment PullingEnchant = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("lb_mod", "pulling"),
            new PullingEnchant()
    );

    public static final EntityType<TestShoulderEntity> TEST_SHOULDER_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("lb_mod", "test_shoulder_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TestShoulderEntity::new).dimensions(EntityDimensions.fixed(0.75f,0.75f)).build()
    );


    @Override
    public void onInitialize(){
        System.out.println("I'm feeling lucky!");
        RegisterItems.register();
        RegisterEventListeners.register();

        FabricDefaultAttributeRegistry.register(TEST_SHOULDER_ENTITY, TestShoulderEntity.createMobAttributes());

    }


}
