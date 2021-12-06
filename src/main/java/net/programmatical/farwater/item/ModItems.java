package net.programmatical.farwater.item;

import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.programmatical.farwater.Farwater;
import net.programmatical.farwater.block.ModBlocks;
import net.programmatical.farwater.fluid.ModFluids;
import net.programmatical.farwater.item.itemExtras.CheeseItem;
import net.programmatical.farwater.item.itemExtras.CheeseSword;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Farwater.MOD_ID);

    public static final RegistryObject<Item> MOLTEN_DEBRIS = ITEMS.register("molten_debris",
            () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroup.FARWATER_GROUP)));

    public static final RegistryObject<Item> CHROMATIC_MECHANISM = ITEMS.register("chromatic_mechanism",
            () -> new Item(new Item.Properties().tab(ModItemGroup.FARWATER_GROUP)));

    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<CheeseItem> CHEESE = ITEMS.register("cheese",
            () -> new CheeseItem(new Item.Properties().tab(ModItemGroup.FARWATER_GROUP).food(new Food.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<CheeseSword> CHEESE_SWORD = ITEMS.register("cheese_sword",
            () -> new CheeseSword(ToolMaterials.CHEESE,4, -2, new Item.Properties().tab(ModItemGroup.FARWATER_GROUP).defaultDurability(128).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> QUINTESSENCE_BUCKET = ITEMS.register("quintessence_bucket",
            () -> new BucketItem(() -> ModFluids.QUINTESSENCE_FLUID.get(), new Item.Properties().stacksTo(1).tab(ModItemGroup.FARWATER_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
