package com.Mas12344.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
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
            //player.sendMessage(new LiteralText(String.valueOf(los)), false);
            randomDrop(los, world, pos, state, player);
        }


    }

    private void randomDrop(int seed, World world, BlockPos pos, BlockState state, PlayerEntity player){
        switch (seed) {
            default -> world.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 5F, Explosion.DestructionType.BREAK);
        }
    }
}
