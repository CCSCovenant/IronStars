package com.xekr.ironstars.entity;
import com.xekr.ironstars.assembleUtil.Assembler;
import net.minecraft.*;
import net.minecraft.client.model.EntityModel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SpaceShip extends Entity {
    private Logger logger = LogManager.getLogger();
    public SpaceShip(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound) {

    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
