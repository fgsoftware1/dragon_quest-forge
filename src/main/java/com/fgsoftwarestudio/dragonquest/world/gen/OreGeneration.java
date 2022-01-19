package com.fgsoftwarestudio.dragonquest.world.gen;

import com.fgsoftwarestudio.dragonquest.config.OreGenerationConfig;
import com.fgsoftwarestudio.dragonquest.init.DragonquestBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void setupOreGeneration()
    {
        if(OreGenerationConfig.generate_overworld.get())
        {
            for(Biome biome : ForgeRegistries.BIOMES)
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DragonquestBlocks.DRAGONSCALE_ORE.getDefaultState(), OreGenerationConfig.ore_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
            }
        }
    }
}
