package draylar.infintus.registry;

import draylar.infintus.Infintus;
import draylar.infintus.entity.InfinityForgeBlockEntity;
import draylar.infintus.entity.SingularityCompressorBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InfintusEntities {

    public static final BlockEntityType<SingularityCompressorBlockEntity> SINGULARITY_COMPRESSOR = register(
            "singularity_compressor",
            BlockEntityType.Builder.create(SingularityCompressorBlockEntity::new, InfintusBlocks.SINGULARITY_COMPRESSOR).build(null));

    public static final BlockEntityType<InfinityForgeBlockEntity> INFINITY_FORGE = register(
            "infinity_forge",
            BlockEntityType.Builder.create(InfinityForgeBlockEntity::new, InfintusBlocks.INFINITY_FORGE).build(null));

    private static <T extends BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> be) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Infintus.MODID, name), be);
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> be) {
        return Registry.register(Registry.ENTITY_TYPE, new Identifier(Infintus.MODID, name), be);
    }

    public static void init() {
        // NO-OP
    }

    private InfintusEntities() {
        // NO-OP
    }
}
