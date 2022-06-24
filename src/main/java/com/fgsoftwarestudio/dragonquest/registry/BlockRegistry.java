package com.fgsoftwarestudio.dragonquest.registry;

import com.fgsoftwarestudio.dragonquest.init.DragonquestBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.fgsoftwarestudio.dragonquest.Reference.LOGGER;
import static com.fgsoftwarestudio.dragonquest.util.ResourceLocation.location;

public class BlockRegistry {
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll
                (
                        DragonquestBlocks.DRAGONSCALE_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).lightValue(5).sound(SoundType.METAL)).setRegistryName(location("dragonscale_ore"))
                );

        LOGGER.info("Blocks registered.");
    }
}
