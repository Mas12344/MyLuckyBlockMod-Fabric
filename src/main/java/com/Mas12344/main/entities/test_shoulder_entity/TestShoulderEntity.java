package com.Mas12344.main.entities.test_shoulder_entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableShoulderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TestShoulderEntity  extends TameableShoulderEntity {
    public TestShoulderEntity(EntityType<? extends TameableShoulderEntity> entityType, World world){
        super(entityType, world);
    }



    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand){
        super.interactMob(player,hand);
        if(player.getMainHandStack().getItem() == Items.REDSTONE){
            if(!player.world.isClient()){
                this.setOwner(player);

                for(ServerPlayerEntity sep: getServer().getWorld(world.getRegistryKey()).getPlayers()){
                    if(player.getUuid() == sep.getUuid()){
                        this.mountOnto(sep);
                    }
                }

                return ActionResult.SUCCESS;

            }

        }
        return ActionResult.PASS;
    }
}
