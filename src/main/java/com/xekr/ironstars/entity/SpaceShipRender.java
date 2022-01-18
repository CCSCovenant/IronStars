package com.xekr.ironstars.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class SpaceShipRender extends EntityRenderer<SpaceShip> {
    private SpaceShipModel model;
    protected SpaceShipRender(EntityRendererProvider.Context p_174008_) {
        super(p_174008_);
        model = new SpaceShipModel();
    }

    @Override
    public ResourceLocation getTextureLocation(SpaceShip pEntity) {
        return null;

    }
}
