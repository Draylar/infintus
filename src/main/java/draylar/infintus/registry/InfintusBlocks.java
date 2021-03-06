package draylar.infintus.registry;

import draylar.infintus.Infintus;
import draylar.infintus.block.InfinityForgeBlock;
import draylar.infintus.block.SingularityCompressorBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InfintusBlocks {

    public static final Block SINGULARITY_COMPRESSOR = register(
            "singularity_compressor",
            new SingularityCompressorBlock(FabricBlockSettings.of(Material.METAL)));

    public static final Block INFINITY_FORGE = register(
            "infinity_forge",
            new InfinityForgeBlock(FabricBlockSettings.of(Material.METAL)));

    public static final Block INFINITY_SINGULARITY_BLOCK = register(
            "infinity_singularity_block",
            new Block(FabricBlockSettings.of(Material.METAL)), new Item.Settings().group(Infintus.MAIN_GROUP));


    private static Block register(String name, Block item) {
        return Registry.register(Registry.BLOCK, new Identifier(Infintus.MODID, name), item);
    }

    private static Block register(String name, Block item, Item.Settings settings) {
        Block block = Registry.register(Registry.BLOCK, new Identifier(Infintus.MODID, name), item);
        Registry.register(Registry.ITEM, new Identifier(Infintus.MODID, name), new BlockItem(block, settings));
        return block;
    }

    public static void init() {
        // NO-OP
    }

    private InfintusBlocks() {
        // NO-OP
    }
}
