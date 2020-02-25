package draylar.infintus.material;

import draylar.infintus.registry.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UltimateToolMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 10000;
    }

    @Override
    public float getMiningSpeed() {
        return 30;
    }

    @Override
    public float getAttackDamage() {
        return 49;
    }

    @Override
    public int getMiningLevel() {
        return 10;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.INFINITY_SINGULARITY);
    }
}
