package com.Mas12344.main.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class PullingEnchant extends Enchantment {
    public PullingEnchant(){
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel(){
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level){
        super.onTargetDamaged(user, target, level);
        if(target instanceof LivingEntity){
            LivingEntity LE_target = (LivingEntity) target;
            Vec3d dir = user.getPos().subtract(LE_target.getPos());
            float mult = 0.1f * level;
            try {
                LE_target.addVelocity(dir.getX()*mult, 0, dir.getZ()*mult);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return !other.equals(Enchantments.KNOCKBACK);
    }
}
