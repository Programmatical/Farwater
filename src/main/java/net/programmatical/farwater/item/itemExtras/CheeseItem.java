package net.programmatical.farwater.item.itemExtras;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.programmatical.farwater.item.ModItems;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;


public class CheeseItem extends Item {

    public CheeseItem(Item.Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, World currentWorld, LivingEntity consumer) {
        if (consumer instanceof ServerPlayerEntity){
            ServerPlayerEntity player = (ServerPlayerEntity) consumer;
            for (int i = 0; i < player.inventory.getContainerSize(); i++){
                if ((player.inventory.getItem(i).getItem().getRegistryName().toString()).equals("farwater:cheese_sword")){
                    player.inventory.getItem(i).getItem().setDamage(player.inventory.getItem(i), getDamage(player.inventory.getItem(i))-16);
                }
            }
        }
        return super.finishUsingItem(stack, currentWorld, consumer);
    }
}
