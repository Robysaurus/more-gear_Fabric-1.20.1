package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.block.ModBlocks;
import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addDrop(ModBlocks.PHYSICSIUM_ORE, ModBlocks.PHYSICSIUM_ORE);
        addDrop(ModBlocks.PHYSICSIUM_BLOCK, ModBlocks.PHYSICSIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.TITANIUM_BLOCK, ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.TRIPHITE_ORE, oreDrops(ModBlocks.TRIPHITE_ORE, ModItems.RAW_TRIPHITE));
        addDrop(ModBlocks.REINFORCED_TRIPHITE_BLOCK, ModBlocks.REINFORCED_TRIPHITE_BLOCK);
        addDrop(ModBlocks.MYTHRIL_ORE, oreDrops(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL));
        addDrop(ModBlocks.MYTHRIL_BLOCK, ModBlocks.MYTHRIL_BLOCK);
        addDrop(ModBlocks.ANCIENT_ENDIUM, ModBlocks.ANCIENT_ENDIUM);
        addDrop(ModBlocks.ENDIUM_BLOCK, ModBlocks.ENDIUM_BLOCK);
        addDrop(ModBlocks.UNREFINED_PHENON_BLOCK, ModBlocks.UNREFINED_PHENON_BLOCK);
        addDrop(ModBlocks.PHENON_BLOCK, ModBlocks.PHENON_BLOCK);
        addDrop(ModBlocks.HYPHITE_ORE, oreDrops(ModBlocks.HYPHITE_ORE, ModItems.UNREFINED_HYPHITE));
        addDrop(ModBlocks.HYPHITE_BLOCK, ModBlocks.HYPHITE_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.SAPPHIRE_BLOCK, ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.RUBY_BLOCK, ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_ORE, ModItems.RAW_TOPAZ));
        addDrop(ModBlocks.TOPAZ_BLOCK, ModBlocks.TOPAZ_BLOCK);
        addDrop(ModBlocks.OPAL_ORE, oreDrops(ModBlocks.OPAL_ORE, ModItems.RAW_OPAL));
        addDrop(ModBlocks.OPAL_BLOCK, ModBlocks.OPAL_BLOCK);
    }
}
