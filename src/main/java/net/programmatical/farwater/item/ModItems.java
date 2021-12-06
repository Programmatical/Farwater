package net.programmatical.farwater.item;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.programmatical.farwater.Farwater;
import net.programmatical.farwater.fluid.ModFluids;
import net.programmatical.farwater.item.ModItemGroup;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Farwater.MOD_ID);

    public static final RegistryObject<Item> MOLTEN_DEBRIS = ITEMS.register("molten_debris", () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroup.FARWATER_GROUP)));

    public static final RegistryObject<Item> QUINTESSENCE_BUCKET = ITEMS.register("quintessence_bucket", () -> new BucketItem(() -> ModFluids.QUINTESSENCE_FLUID.get(), new Item.Properties().stacksTo(1).tab(ModItemGroup.FARWATER_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
