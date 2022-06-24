package com.fgsoftwarestudio.dragonquest;

<<<<<<< HEAD
import com.fgsoftwarestudio.dragonquest.config.Config;
import com.fgsoftwarestudio.dragonquest.world.gen.OreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
=======
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
>>>>>>> 7fda49ced04bb9c94482fc6c35450ea6586e3d4a

import static com.fgsoftwarestudio.dragonquest.Reference.LOGGER;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("dragonquest")
public class DragonquestMod {
    public DragonquestMod() {
<<<<<<< HEAD
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER, "tutorialmod-server.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT, "tutorialmod-client.toml");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientRegistries);

        Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("tutorialmod-client.toml").toString());
        Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("tutorialmod-server.toml").toString());

=======
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientRegistries);

>>>>>>> 7fda49ced04bb9c94482fc6c35450ea6586e3d4a
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
<<<<<<< HEAD
        OreGeneration.setupOreGeneration();
=======
>>>>>>> 7fda49ced04bb9c94482fc6c35450ea6586e3d4a
        LOGGER.info("SETUP");
    }

    private void ClientRegistries(final FMLClientSetupEvent event) {
        LOGGER.info("REGISTRY");
    }
}
