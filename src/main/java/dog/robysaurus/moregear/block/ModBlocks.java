package dog.robysaurus.moregear.block;

import dog.robysaurus.moregear.MoreGear;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block PHYSICSIUM_BLOCK = registerBlock("physicsiumblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).instrument(NoteBlockInstrument.DIDGERIDOO).requiresTool().strength(50f,2000f).sounds(BlockSoundGroup.METAL).slipperiness(0.9f).luminance(15)), Rarity.EPIC, true);
    public static final Block PHYSICSIUM_ORE = registerBlock("physicsiumore",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool().strength(45f,2000f).sounds(BlockSoundGroup.ANCIENT_DEBRIS).luminance(15)), Rarity.RARE, true);
    public static final Block TITANIUM_BLOCK = registerBlock("titaniumblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresTool().strength(45f,1500f).sounds(BlockSoundGroup.METAL).slipperiness(0.95f)), Rarity.RARE, true);
    public static final Block TITANIUM_ORE = registerBlock("titaniumore",
            new ExperienceDroppingBlock(UniformIntProvider.create(20,20), FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool().strength(35f,1200f).sounds(BlockSoundGroup.DEEPSLATE)), Rarity.UNCOMMON, true);
    public static final Block REINFORCED_TRIPHITE_BLOCK = registerBlock("reinforcedtriphiteblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresTool().strength(42f,1300f).sounds(BlockSoundGroup.METAL)), Rarity.UNCOMMON, true);
    public static final Block TRIPHITE_ORE = registerBlock("triphiteore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16,19), FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool().strength(35f,1100f).sounds(BlockSoundGroup.DEEPSLATE)), Rarity.UNCOMMON, true);
    public static final Block MYTHRIL_BLOCK = registerBlock("mythrilblock",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresTool().strength(39f,1150f).sounds(BlockSoundGroup.METAL)), Rarity.UNCOMMON, true);
    public static final Block MYTHRIL_ORE = registerBlock("mythrilore",
            new ExperienceDroppingBlock(UniformIntProvider.create(12,17), FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool().strength(30f,1050f).sounds(BlockSoundGroup.DEEPSLATE)), Rarity.UNCOMMON, true);
    public static final Block ENDIUM_BLOCK = registerBlock("endiumblock",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().strength(36f,1050f).sounds(BlockSoundGroup.METAL)), Rarity.UNCOMMON, true);
    public static final Block ANCIENT_ENDIUM = registerBlock("ancientendium",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).requiresTool().strength(27.5f,950f)), Rarity.UNCOMMON, true);
    public static final Block PHENON_BLOCK = registerBlock("phenonblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(34f,975f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, true);
    public static final Block UNREFINED_PHENON_BLOCK = registerBlock("unrefinedphenonblock",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).requiresTool().strength(25f,850f)), Rarity.COMMON, true);
    public static final Block HYPHITE_BLOCK = registerBlock("hyphiteblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(32.5f,925f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block HYPHITE_ORE = registerBlock("hyphiteore",
            new ExperienceDroppingBlock(UniformIntProvider.create(6,12), FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool().strength(22.5f,775f)), Rarity.COMMON, false);
    public static final Block TOPAZ_BLOCK = registerBlock("topazblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block TOPAZ_ORE = registerBlock("topazore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10), FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool().strength(20f,750f)), Rarity.COMMON, false);
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphireblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block SAPPHIRE_ORE = registerBlock("sapphireore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10), FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool().strength(20f,750f)), Rarity.COMMON, false);
    public static final Block RUBY_BLOCK = registerBlock("rubyblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, true);
    public static final Block RUBY_ORE = registerBlock("rubyore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10), FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool().strength(20f,750f)), Rarity.COMMON, true);
    public static final Block OPAL_BLOCK = registerBlock("opalblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().strength(30f,900f).sounds(BlockSoundGroup.METAL)), Rarity.COMMON, false);
    public static final Block OPAL_ORE = registerBlock("opalore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10), FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().strength(20f,750f)), Rarity.COMMON, false);
    private static Block registerBlock(String name, Block block, Rarity rarity, boolean fireproof){
        registerBlockItem(name, block, rarity, fireproof);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreGear.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, Rarity rarity, boolean fireproof){
        if(fireproof) {
            return Registry.register(Registries.ITEM, Identifier.of(MoreGear.MOD_ID, name),
                    new BlockItem(block, new Item.Settings().rarity(rarity).fireproof()));
        }
        return Registry.register(Registries.ITEM, Identifier.of(MoreGear.MOD_ID, name),
                new BlockItem(block, new Item.Settings().rarity(rarity)));
    }
    public static void registerModBlocks(){
        MoreGear.LOGGER.info("Registering Mod Blocks for "+MoreGear.MOD_ID);
    }
}
