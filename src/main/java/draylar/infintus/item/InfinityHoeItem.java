package draylar.infintus.item;

import draylar.infintus.Infintus;
import draylar.infintus.registry.Materials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class InfinityHoeItem extends HoeItem {

    public InfinityHoeItem() {
        super(Materials.INFINITY_TOOL, -250, -2.4f, new Item.Settings().group(Infintus.MAIN_GROUP).maxCount(1));
    }
}
