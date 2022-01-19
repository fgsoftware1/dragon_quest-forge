package com.fgsoftwarestudio.dragonquest;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.fgsoftwarestudio.dragonquest.Reference.LOGGER;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("dragonquest")
public class DragonquestMod {
    public DragonquestMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("SETUP");
    }

    private void ClientRegistries(final FMLClientSetupEvent event) {
        LOGGER.info("REGISTRY");
    }
}
