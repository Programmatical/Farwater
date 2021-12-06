package net.programmatical.farwater.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup FARWATER_GROUP = new ItemGroup("farwaterTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOLTEN_DEBRIS.get());
        }
    };
}
