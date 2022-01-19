package com.fgsoftwarestudio.dragonquest;

import com.fgsoftwarestudio.dragonquest.init.DragonquestItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DragonquestItemGroup extends ItemGroup {
    public DragonquestItemGroup()
    {
        super("dragon quest");
    }

    @Override
    @NotNull
    public ItemStack createIcon()
    {
        return new ItemStack(DragonquestItems.TEST_ITEM);
    }
}
