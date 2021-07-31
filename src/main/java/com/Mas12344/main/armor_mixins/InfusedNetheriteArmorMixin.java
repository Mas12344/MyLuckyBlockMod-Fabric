package com.Mas12344.main.armor_mixins;

import com.Mas12344.main.RegisterItems;
import com.Mas12344.main.armor_material.InfusedNetherite;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.UUID;

@Mixin (ArmorItem.class)
public abstract class  InfusedNetheriteArmorMixin {
    @Shadow @Final private static UUID[] MODIFIERS;
    @Shadow @Final @Mutable private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    @Shadow @Final protected float knockbackResistance;

    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void constructor(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings, CallbackInfo ci){
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];
        if(InfusedNetherite.class.isAssignableFrom(material.getClass())){
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                    new EntityAttributeModifier(
                            uUID,
                            "Armor knockback resistance",
                            this.knockbackResistance,
                            EntityAttributeModifier.Operation.ADDITION
                    )
            );

            this.attributeModifiers = builder.build();
        }

        if(material == RegisterItems.RED_INFUSED_NETHERITE_MATERIAL){
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    EntityAttributes.GENERIC_MAX_HEALTH,
                    new EntityAttributeModifier(
                            uUID,
                            "Max Health",
                            5.0F,
                            EntityAttributeModifier.Operation.ADDITION
                    )
            );

            this.attributeModifiers = builder.build();
        }

        if(material == RegisterItems.BLACK_INFUSED_NETHERITE_MATERIAL){
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    EntityAttributes.GENERIC_ATTACK_DAMAGE,
                    new EntityAttributeModifier(
                            uUID,
                            "Movement Speed",
                            2.0F,
                            EntityAttributeModifier.Operation.ADDITION
                    )
            );
            this.attributeModifiers = builder.build();
        }

        if(material == RegisterItems.PURPLE_INFUSED_NETHERITE_MATERIAL){
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    EntityAttributes.GENERIC_ATTACK_SPEED,
                    new EntityAttributeModifier(
                            uUID,
                            "Attack Speed",
                            1.1F,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL
                    )
            );
            this.attributeModifiers = builder.build();
        }
    }
}
