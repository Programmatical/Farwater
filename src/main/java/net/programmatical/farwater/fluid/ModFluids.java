package net.programmatical.farwater.fluid;

import com.simibubi.create.repack.registrate.util.entry.FluidEntry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.programmatical.farwater.Farwater;
import net.programmatical.farwater.block.ModBlocks;
import net.programmatical.farwater.item.ModItems;
import net.programmatical.farwater.fluid.QuintessenceBlock;
import com.simibubi.create.foundation.data.CreateRegistrate;


public class ModFluids {

    public static final ResourceLocation QUINTESSENCE_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/quintessence");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Farwater.MOD_ID);

    public static final RegistryObject<FlowingFluid> QUINTESSENCE_FLUID = FLUIDS.register("quintessence_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.QUINTESSENCE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> QUINTESSENCE_FLOWING = FLUIDS.register("quintessence_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.QUINTESSENCE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties QUINTESSENCE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> QUINTESSENCE_FLUID.get(),
            () -> QUINTESSENCE_FLOWING.get(),
            FluidAttributes.builder(QUINTESSENCE_RL,QUINTESSENCE_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10).luminosity(12)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.QUINTESSENCE_BLOCK.get()).bucket(() -> ModItems.QUINTESSENCE_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> QUINTESSENCE_BLOCK = ModBlocks.BLOCKS.register("quintessence", () -> new QuintessenceBlock(QUINTESSENCE_FLUID));
    //I don't know Java and refuse to learn, don't tell me if there's a better way to do this
    public static final ResourceLocation ADZUKI_SHAKE_STILL_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/adzuki_milkshake_still");
    public static final ResourceLocation ADZUKI_SHAKE_FLOWING_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/adzuki_milkshake_flow");
    public static final ResourceLocation BANANA_SHAKE_STILL_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/banana_milkshake_still");
    public static final ResourceLocation BANANA_SHAKE_FLOWING_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/banana_milkshake_flow");
    public static final ResourceLocation CHOCOLATE_SHAKE_STILL_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/chocolate_milkshake_still");
    public static final ResourceLocation CHOCOLATE_SHAKE_FLOWING_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/chocolate_milkshake_flow");
    public static final ResourceLocation MINT_SHAKE_STILL_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/mint_milkshake_still");
    public static final ResourceLocation MINT_SHAKE_FLOWING_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/mint_milkshake_flow");
    public static final ResourceLocation STRAWBERRY_SHAKE_STILL_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/strawberry_milkshake_still");
    public static final ResourceLocation STRAWBERRY_SHAKE_FLOWING_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/strawberry_milkshake_flow");
    public static final ResourceLocation VANILLA_SHAKE_STILL_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/vanilla_milkshake_still");
    public static final ResourceLocation VANILLA_SHAKE_FLOWING_RL = new ResourceLocation(Farwater.MOD_ID, "fluid/vanilla_milkshake_flow");

    public static final RegistryObject<FlowingFluid> ADZUKI_SHAKE_FLUID = FLUIDS.register("adzuki_shake_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.ADZUKI_SHAKE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ADZUKI_SHAKE_FLOWING = FLUIDS.register("adzuki_shake_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.ADZUKI_SHAKE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ADZUKI_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> ADZUKI_SHAKE_FLUID.get(),
            () -> ADZUKI_SHAKE_FLOWING.get(),
            FluidAttributes.builder(ADZUKI_SHAKE_STILL_RL,ADZUKI_SHAKE_FLOWING_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.ADZUKI_SHAKE_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> ADZUKI_SHAKE_BLOCK = ModBlocks.BLOCKS.register("adzuki_shake", () -> new FlowingFluidBlock(() -> ModFluids.ADZUKI_SHAKE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> BANANA_SHAKE_FLUID = FLUIDS.register("banana_shake_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.BANANA_SHAKE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BANANA_SHAKE_FLOWING = FLUIDS.register("banana_shake_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.BANANA_SHAKE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BANANA_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> BANANA_SHAKE_FLUID.get(),
            () -> BANANA_SHAKE_FLOWING.get(),
            FluidAttributes.builder(BANANA_SHAKE_STILL_RL,BANANA_SHAKE_FLOWING_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.BANANA_SHAKE_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> BANANA_SHAKE_BLOCK = ModBlocks.BLOCKS.register("banana_shake", () -> new FlowingFluidBlock(() -> ModFluids.BANANA_SHAKE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> CHOCOLATE_SHAKE_FLUID = FLUIDS.register("chocolate_shake_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.CHOCOLATE_SHAKE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> CHOCOLATE_SHAKE_FLOWING = FLUIDS.register("chocolate_shake_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.CHOCOLATE_SHAKE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CHOCOLATE_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CHOCOLATE_SHAKE_FLUID.get(),
            () -> CHOCOLATE_SHAKE_FLOWING.get(),
            FluidAttributes.builder(CHOCOLATE_SHAKE_STILL_RL,CHOCOLATE_SHAKE_FLOWING_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.CHOCOLATE_SHAKE_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> CHOCOLATE_SHAKE_BLOCK = ModBlocks.BLOCKS.register("chocolate_shake", () -> new FlowingFluidBlock(() -> ModFluids.CHOCOLATE_SHAKE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> MINT_SHAKE_FLUID = FLUIDS.register("mint_shake_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.MINT_SHAKE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MINT_SHAKE_FLOWING = FLUIDS.register("mint_shake_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MINT_SHAKE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MINT_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MINT_SHAKE_FLUID.get(),
            () -> MINT_SHAKE_FLOWING.get(),
            FluidAttributes.builder(MINT_SHAKE_STILL_RL,MINT_SHAKE_FLOWING_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.MINT_SHAKE_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> MINT_SHAKE_BLOCK = ModBlocks.BLOCKS.register("mint_shake", () -> new FlowingFluidBlock(() -> ModFluids.MINT_SHAKE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> STRAWBERRY_SHAKE_FLUID = FLUIDS.register("strawberry_shake_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.STRAWBERRY_SHAKE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> STRAWBERRY_SHAKE_FLOWING = FLUIDS.register("strawberry_shake_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.STRAWBERRY_SHAKE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties STRAWBERRY_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> STRAWBERRY_SHAKE_FLUID.get(),
            () -> STRAWBERRY_SHAKE_FLOWING.get(),
            FluidAttributes.builder(STRAWBERRY_SHAKE_STILL_RL,STRAWBERRY_SHAKE_FLOWING_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.STRAWBERRY_SHAKE_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> STRAWBERRY_SHAKE_BLOCK = ModBlocks.BLOCKS.register("strawberry_shake", () -> new FlowingFluidBlock(() -> ModFluids.STRAWBERRY_SHAKE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> VANILLA_SHAKE_FLUID = FLUIDS.register("vanilla_shake_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.VANILLA_SHAKE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> VANILLA_SHAKE_FLOWING = FLUIDS.register("vanilla_shake_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.VANILLA_SHAKE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties VANILLA_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> VANILLA_SHAKE_FLUID.get(),
            () -> VANILLA_SHAKE_FLOWING.get(),
            FluidAttributes.builder(VANILLA_SHAKE_STILL_RL,VANILLA_SHAKE_FLOWING_RL).density(500).color(0x00ffffff).viscosity(20).temperature(10)).slopeFindDistance(2).levelDecreasePerBlock(1).block(() -> ModFluids.VANILLA_SHAKE_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> VANILLA_SHAKE_BLOCK = ModBlocks.BLOCKS.register("vanilla_shake", () -> new FlowingFluidBlock(() -> ModFluids.VANILLA_SHAKE_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100f).noDrops()));


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

    private static class NoColorFluidAttributes extends FluidAttributes {

        protected NoColorFluidAttributes(Builder builder, Fluid fluid) {
            super(builder, fluid);
        }

        @Override
        public int getColor(IBlockDisplayReader world, BlockPos pos) {
            return 0x00ffffff;
        }

    }

}
