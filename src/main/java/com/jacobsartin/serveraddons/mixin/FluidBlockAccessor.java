package com.jacobsartin.serveraddons.mixin;

import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

//can't get this to work
@Mixin(FluidBlock.class)
public interface FluidBlockAccessor {
    //should access the fluid variable in FluidBlock to allow me to check if current fluid is lava
    @Accessor
    FlowableFluid getFluid();
}
