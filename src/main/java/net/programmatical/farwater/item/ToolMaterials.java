package net.programmatical.farwater.item;

import java.util.function.Supplier;

import net.programmatical.farwater.item.ModItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ToolMaterials implements IItemTier {
    CHEESE(1, 2, 12.0f, -2.5f, 34, () -> Ingredient.of(ModItems.CHEESE_SWORD.get()));

    private final int Level, maxUses, enchantability;
    private final float speed, attackDamageBonus;
    private final LazyValue<Ingredient> repairMaterial;

    private ToolMaterials(int LevelIn, int maxUsesIn, float speedIn, float attackDamageBonusIn,
                          int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.Level = LevelIn;
        this.maxUses = maxUsesIn;
        this.speed = speedIn;
        this.attackDamageBonus = attackDamageBonusIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<Ingredient>(repairMaterialIn);
    }

    @Override
    public int getLevel() {
        return this.Level;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
