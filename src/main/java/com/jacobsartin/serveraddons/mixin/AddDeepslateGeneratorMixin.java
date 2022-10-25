package com.jacobsartin.serveraddons.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FluidBlock.class)
public class AddDeepslateGeneratorMixin{

    //injects at every return in receiveNeighborFluids() in the FluidBlock class
    @Inject(at = @At("RETURN"), method = "receiveNeighborFluids")
    private void addGen2(World world, BlockPos pos, BlockState state, CallbackInfoReturnable<Boolean> cir) {
        //checks if cobblestone so that it will only run at the right return statement
        if(world.getBlockState(pos).equals(Blocks.COBBLESTONE.getDefaultState()))
        {
            //checks if it should overwrite the cobblestone block based on the expected condition (block of netherite below the position
            if(world.getBlockState(pos.down()).isOf(Blocks.NETHERITE_BLOCK))
            {
                world.setBlockState(pos, Blocks.COBBLED_DEEPSLATE.getDefaultState());
            }
        }
    }
}