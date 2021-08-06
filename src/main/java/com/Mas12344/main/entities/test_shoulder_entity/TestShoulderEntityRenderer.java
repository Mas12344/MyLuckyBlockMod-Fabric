package com.Mas12344.main.entities.test_shoulder_entity;

import com.Mas12344.main.LuckyBlockModClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TestShoulderEntityRenderer extends MobEntityRenderer<TestShoulderEntity, TestShoulderEntityModel> {
    public TestShoulderEntityRenderer(EntityRendererFactory.Context context ){
        super(context, new TestShoulderEntityModel(context.getPart(LuckyBlockModClient.MODEL_TSE_LAYER)),0.75f);
    }

    @Override
    public Identifier getTexture(TestShoulderEntity entity){
        return new Identifier("lb_mod", "textures/entity/test_shoulder_entity/cube.png");
    }

}
