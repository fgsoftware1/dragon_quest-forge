package com.fgsoftwarestudio.dragonquest.registry;

import com.fgsoftwarestudio.dragonquest.Reference;
import com.fgsoftwarestudio.dragonquest.init.DragonquestItems;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.fgsoftwarestudio.dragonquest.Reference.*;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                DragonquestItems.TEST_ITEM = new Item(new Item.Properties().group(GROUP)).setRegistryName(location("test_item"))
        );

        LOGGER.info("Items registered.");
    }

    //@Deprecated
    private static ResourceLocation location(String name){
        return new ResourceLocation(MOD_ID, name);
    }
}
