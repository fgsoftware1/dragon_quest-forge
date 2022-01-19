package com.fgsoftwarestudio.dragonquest;

import net.minecraft.item.ItemGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);
    public static final String MOD_ID = "dragonquest";
    public static final ItemGroup GROUP = new DragonquestItemGroup();
}
