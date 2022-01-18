package com.xekr.ironstars.assembleUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.checkerframework.checker.units.qual.A;

public class Assembler {
    static Assembler assembler;
    public Assembler(){

    }
    public static Assembler getAssember(){
        if (assembler==null){
            assembler = new Assembler();
        }
        return assembler;
    }
    public static void getModel(BlockPos CenterPos,Level world){

    }
}
