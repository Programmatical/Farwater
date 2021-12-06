package net.programmatical.farwater.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.programmatical.farwater.Farwater;
import net.programmatical.farwater.item.ModItemGroup;
import net.programmatical.farwater.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Farwater.MOD_ID);

    public static final RegistryObject<GlassBlock> REFINED_RADIANCE_BLOCK = registerBlock("refined_radiance_block",
            () -> new GlassBlock(AbstractBlock.Properties.of(Material.GLASS)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).strength(5f).noOcclusion().lightLevel((blockstate) -> 15).sound(SoundType.GLASS)));

    public static final RegistryObject<SandBlock> ASH_BLOCK = registerBlock("ash_block",
            () -> new SandBlock(2, AbstractBlock.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK)
                    .strength(0.3f, 0.3f).harvestTool(ToolType.SHOVEL).harvestLevel(-1)
                    .sound(SoundType.SAND)
            ));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.FARWATER_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
