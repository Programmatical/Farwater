package net.programmatical.farwater.item.itemExtras;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;


public class CheeseSword extends SwordItem {

    public CheeseSword(IItemTier tier, int int1, int int2, Properties properties) {
        super(tier, int1, int2, properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World worlder, List<ITextComponent> tooltip, ITooltipFlag flags) {
        super.appendHoverText(stack, worlder, tooltip, flags);
        if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
            tooltip.add(new TranslationTextComponent("tooltip.farwater.cheese_sword.lore1"));
            tooltip.add(new TranslationTextComponent("tooltip.farwater.cheese_sword.lore2"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.farwater.all.hold_shift"));
        }
    }
}
