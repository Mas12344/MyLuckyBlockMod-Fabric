package com.Mas12344.main.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

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
            float dmg = 0f;
            float hpToRegen = 0.1f * level * dmg;
            System.out.print("Damage: ");
            System.out.println(dmg);
            System.out.print("HP: ");
            System.out.println(hpToRegen);
            user.heal(hpToRegen);
        }
        super.onTargetDamaged(user, target, level);
    }
}
