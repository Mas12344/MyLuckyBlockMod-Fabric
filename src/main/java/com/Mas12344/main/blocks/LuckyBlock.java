package com.Mas12344.main.blocks;


import com.Mas12344.main.RegisterItems;
import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
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
        switch (8) {
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
            case 3 -> {
                for(int i = 0; i <= pos.getY(); i++){
                    world.breakBlock(pos.add(0, -i, 0), false);
                }
            }
            case 4 ->{
                //część wyposażenia z netherytu, z losowym enchantem
            }
            case 5 ->{
                //papuga co cały czas creepera robi
            }
            case 6 ->{
                //jabko co daje wszystkie mozliwe efekty
                ItemStack ugapple = RegisterItems.UGApple.getDefaultStack();
                ItemEntity ugapple_entity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), ugapple);
                world.spawnEntity(ugapple_entity);

            }
            case 7 ->{
                //deszcz potionow


            }
            case 8 ->{
                // wandering trader z fajnymi rzeczami

                WanderingTraderEntity wte = new WanderingTraderEntity(EntityType.WANDERING_TRADER, world);
                //TradeOfferList tol = new TradeOfferList();
                ItemStack emerald = new ItemStack(Items.EMERALD);
                ItemStack rune = randomRuneItem(seed);
                TradeOffer to = new TradeOffer(emerald, rune, 99999, 10, 5);
                //tol.add(to);


                //wte.setOffersFromServer(wte.getOffers().set(0, to));
                //wte.writeCustomDataToNbt(tol.toNbt());
                wte.setPosition(pos.getX(), pos.getY(), pos.getZ());
                world.spawnEntity(wte);

            }
            case 9 ->{
                player.setHealth(1);
            }
            case 10 ->{
                WitherEntity wither = new WitherEntity(EntityType.WITHER, world);
                wither.setHealth(seed % 300);
                wither.attack(player, 1);
                wither.setPosition(pos.getX(), pos.getY(), pos.getZ());
                world.spawnEntity(wither);
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
