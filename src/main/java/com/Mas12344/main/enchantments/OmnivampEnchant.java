package com.Mas12344.main.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

import java.util.Objects;

public class OmnivampEnchant extends Enchantment {

    public OmnivampEnchant() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            LivingEntity LE_target = (LivingEntity) target;

            float target_hp = LE_target.getMaxHealth();
            float dmg;
            float hpToRegen;
            try{
                dmg = LE_target.getDamageTracker().getMostRecentDamage().getDamage();
                hpToRegen = 0.07f * level * dmg;
            } catch (Exception e){
                dmg = target_hp / 5;
                hpToRegen = 0.4f * level * dmg;
            }

            user.heal(hpToRegen);
        }
        super.onTargetDamaged(user, target, level);
    }
}
