package com.Mas12344.main.blocks;


import com.Mas12344.main.RegisterItems;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtInt;
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
        switch (seed % 4) {
            case 0 -> {
                CatEntity opus = new CatEntity(EntityType.CAT, world);
                opus.setCatType(10);
                opus.setPosition(pos.getX() + 0.5d, pos.getY() + 0.5d, pos.getZ() + 0.5d);
                opus.setCustomName(new LiteralText("Opus"));
                world.spawnEntity(opus);

            }
            case 1 -> EntityType.SHEEP.spawn((ServerWorld) world, new NbtCompound(), new LiteralText("jeb_"), player, pos, SpawnReason.MOB_SUMMONED, true, false);
            case 2 -> {
                ItemStack rune_stack = randomRuneItem(seed);
                ItemEntity rune_entity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), rune_stack);
                world.spawnEntity(rune_entity);
            }
            default -> world.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 5F, Explosion.DestructionType.BREAK);
        }
    }

    private ItemStack randomRuneItem(int seed){
        ImmutableList.Builder<ItemStack> builder = ImmutableList.builder();
        builder.add(RegisterItems.Black_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.Blue_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.Green_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.Orange_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.Purple_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.Red_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.White_Rune_Item.getDefaultStack());
        builder.add(RegisterItems.Yellow_Rune_Item.getDefaultStack());

        ImmutableList<ItemStack> list = builder.build();
        return list.get(seed % list.size());

    }

}
