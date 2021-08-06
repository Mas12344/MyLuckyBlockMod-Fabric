package com.Mas12344.main;

import com.Mas12344.main.entities.test_shoulder_entity.TestShoulderEntityModel;
import com.Mas12344.main.entities.test_shoulder_entity.TestShoulderEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class LuckyBlockModClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_TSE_LAYER = new EntityModelLayer(new Identifier("lb_mod", "test_shoulder_entity"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(LuckyBlockMod.TEST_SHOULDER_ENTITY, (context) ->{
            return new TestShoulderEntityRenderer(context);
        });
        EntityModelLayerRegistry.registerModelLayer(MODEL_TSE_LAYER, TestShoulderEntityModel::getTexturedModelData);
    }

}
