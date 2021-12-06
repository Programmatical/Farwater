package net.programmatical.farwater.fluid;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


import java.util.function.Supplier;

public class QuintessenceBlock extends FlowingFluidBlock {

    public QuintessenceBlock(java.util.function.Supplier<? extends FlowingFluid> supplier) {
        super(supplier, AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100.0F, 100.0F).noDrops().lightLevel((blockstate) -> 8).speedFactor(0.90F));
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (this.receiveNeighborFluids(world, pos, state)) {
            world.getLiquidTicks().scheduleTick(pos, state.getFluidState().getType(), this.getFluid().getTickDelay(world));
        }
    }
    private boolean receiveNeighborFluids(World world, BlockPos pos, BlockState state) {
        boolean flag = false;

        for (Direction direction : Direction.values()) {
            if (direction != Direction.DOWN && world.getFluidState(pos.relative(direction)).is(FluidTags.LAVA)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            FluidState ifluidstate = world.getFluidState(pos);
            if (ifluidstate.isSource()) {

                world.setBlockAndUpdate(pos, Blocks.ANCIENT_DEBRIS.defaultBlockState());
                return false;
            }

            if (ifluidstate.getHeight(world, pos) >= 0.44444445F) {
                world.setBlockAndUpdate(pos, Blocks.ANCIENT_DEBRIS.defaultBlockState());
                return false;
            }
        }

        return true;
    }

}
