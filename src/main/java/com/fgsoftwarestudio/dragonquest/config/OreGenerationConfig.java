package com.fgsoftwarestudio.dragonquest.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenerationConfig {
    public static ForgeConfigSpec.BooleanValue generate_overworld;
    public static ForgeConfigSpec.IntValue ore_chance;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Oregen Config");

        generate_overworld = server
                .comment("Decide if you want Tutorial Mod ores to spawn in the overworld")
                .define("oregen.generate_overworld", true);
        ore_chance = server
                .comment("Maximum number of ore veins that can spawn in one chunk.")
                .defineInRange("ore_chance", 10, 0, 20);
    }
}
