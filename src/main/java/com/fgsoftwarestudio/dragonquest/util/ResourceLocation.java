package com.fgsoftwarestudio.dragonquest.util;

import static com.fgsoftwarestudio.dragonquest.Reference.MOD_ID;

public class ResourceLocation {
    public static net.minecraft.util.ResourceLocation location(String name){
        return new net.minecraft.util.ResourceLocation(MOD_ID, name);
    }
}
