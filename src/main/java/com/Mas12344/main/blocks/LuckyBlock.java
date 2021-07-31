package com.Mas12344.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;


import java.util.Random;

public class LuckyBlock extends Block {

    public LuckyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        if(!world.isClient){
            Random r = new Random();
            int los = r.nextInt(99);
            randomDrop(los, world, pos, state, player);
        }


    }

    private void randomDrop(int seed, World world, BlockPos pos, BlockState state, PlayerEntity player){
        switch (seed % 2) {
            case 0 -> EntityType.CAT.spawn((ServerWorld) world, new NbtCompound(), new LiteralText("Opus"), player, pos, SpawnReason.MOB_SUMMONED, true, false);
           // case 1 ->
            default -> world.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 5F, Explosion.DestructionType.BREAK);
        }
    }
}
