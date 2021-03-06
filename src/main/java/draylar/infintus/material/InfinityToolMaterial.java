package draylar.infintus.material;

import draylar.infintus.registry.InfintusItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class InfinityToolMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 100;
    }

    @Override
    public float getAttackDamage() {
        return 499;
    }

    @Override
    public int getMiningLevel() {
        return 100;
    }

    @Override
    public int getEnchantability() {
        return 100000;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(InfintusItems.MANIFEST_INFINITY);
    }
}
