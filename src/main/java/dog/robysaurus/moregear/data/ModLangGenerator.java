package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.block.ModBlocks;
import dog.robysaurus.moregear.entity.ModEntities;
import dog.robysaurus.moregear.event.KeyInputHandler;
import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.PHYSICSIUM, "Physicsium Ingot");
        translationBuilder.add(ModItems.PHYSICSIUM_NUGGET, "Physicsium Nugget");
        translationBuilder.add(ModItems.TITANIUM, "Titanium Ingot");
        translationBuilder.add(ModItems.RAW_TITANIUM, "Raw Titanium");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE, "Reinforced Triphite");
        translationBuilder.add(ModItems.RAW_TRIPHITE, "Raw Triphite");
        translationBuilder.add(ModItems.MYTHRIL, "Mythril Ingot");
        translationBuilder.add(ModItems.RAW_MYTHRIL, "Raw Mythril");
        translationBuilder.add(ModItems.ENDIUM, "Endium Ingot");
        translationBuilder.add(ModItems.ENDIUM_SCRAP, "Endium Scrap");
        translationBuilder.add(ModItems.PHENON, "Phenon Ingot");
        translationBuilder.add(ModItems.PHENON_SCRAP, "Phenon Scrap");
        translationBuilder.add(ModItems.HYPHITE, "Refined Hyphite");
        translationBuilder.add(ModItems.UNREFINED_HYPHITE, "Unrefined Hyphite");
        translationBuilder.add(ModItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(ModItems.RAW_SAPPHIRE, "Raw Sapphire");
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.RAW_RUBY, "Raw Ruby");
        translationBuilder.add(ModItems.TOPAZ, "Topaz");
        translationBuilder.add(ModItems.RAW_TOPAZ, "Raw Topaz");
        translationBuilder.add(ModItems.OPAL, "Opal");
        translationBuilder.add(ModItems.RAW_OPAL, "Raw Opal");
        translationBuilder.add(ModItems.PHYSICSIUM_HELMET, "Physicsium Helmet");
        translationBuilder.add(ModItems.PHYSICSIUM_CHESTPLATE, "Physicsium Chestplate");
        translationBuilder.add(ModItems.PHYSICSIUM_LEGGINGS, "Physicsium Leggings");
        translationBuilder.add(ModItems.PHYSICSIUM_BOOTS, "Physicsium Boots");
        translationBuilder.add(ModItems.PHYSICSIUM_SWORD, "Physicsium Sword");
        translationBuilder.add(ModItems.PHYSICSIUM_AXE, "Physicsium Axe");
        translationBuilder.add(ModItems.PHYSICSIUM_PICKAXE, "Physicsium Pickaxe");
        translationBuilder.add(ModItems.PHYSICSIUM_SHOVEL, "Physicsium Shovel");
        translationBuilder.add(ModItems.PHYSICSIUM_HOE, "Physicsium Hoe");
        translationBuilder.add(ModItems.PHYSICSIUM_SHIELD, "Physicsium Shield");
        translationBuilder.add(ModItems.TITANIUM_HELMET, "Titanium Helmet");
        translationBuilder.add(ModItems.TITANIUM_CHESTPLATE, "Titanium Chestplate");
        translationBuilder.add(ModItems.TITANIUM_LEGGINGS, "Titanium Leggings");
        translationBuilder.add(ModItems.TITANIUM_BOOTS, "Titanium Boots");
        translationBuilder.add(ModItems.TITANIUM_SWORD, "Titanium Sword");
        translationBuilder.add(ModItems.TITANIUM_AXE, "Titanium Axe");
        translationBuilder.add(ModItems.TITANIUM_PICKAXE, "Titanium Pickaxe");
        translationBuilder.add(ModItems.TITANIUM_SHOVEL, "Titanium Shovel");
        translationBuilder.add(ModItems.TITANIUM_HOE, "Titanium Hoe");
        translationBuilder.add(ModItems.TITANIUM_SHIELD, "Titanium Shield");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_HELMET, "Reinforced Triphite Helmet");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_CHESTPLATE, "Reinforced Triphite Chestplate");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_LEGGINGS, "Reinforced Triphite Leggings");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_BOOTS, "Reinforced Triphite Boots");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_SWORD, "Reinforced Triphite Sword");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_AXE, "Reinforced Triphite Axe");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_PICKAXE, "Reinforced Triphite Pickaxe");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_SHOVEL, "Reinforced Triphite Shovel");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_HOE, "Reinforced Triphite Hoe");
        translationBuilder.add(ModItems.REINFORCED_TRIPHITE_SHIELD, "Reinforced Triphite Shield");
        translationBuilder.add(ModItems.MYTHRIL_HELMET, "Mythril Helmet");
        translationBuilder.add(ModItems.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        translationBuilder.add(ModItems.MYTHRIL_LEGGINGS, "Mythril Leggings");
        translationBuilder.add(ModItems.MYTHRIL_BOOTS, "Mythril Boots");
        translationBuilder.add(ModItems.MYTHRIL_SWORD, "Mythril Sword");
        translationBuilder.add(ModItems.MYTHRIL_AXE, "Mythril Axe");
        translationBuilder.add(ModItems.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        translationBuilder.add(ModItems.MYTHRIL_SHOVEL, "Mythril Shovel");
        translationBuilder.add(ModItems.MYTHRIL_HOE, "Mythril Hoe");
        translationBuilder.add(ModItems.MYTHRIL_SHIELD, "Mythril Shield");
        translationBuilder.add(ModItems.ENDIUM_HELMET, "Endium Helmet");
        translationBuilder.add(ModItems.ENDIUM_CHESTPLATE, "Endium Chestplate");
        translationBuilder.add(ModItems.ENDIUM_LEGGINGS, "Endium Leggings");
        translationBuilder.add(ModItems.ENDIUM_BOOTS, "Endium Boots");
        translationBuilder.add(ModItems.ENDIUM_SWORD, "Endium Sword");
        translationBuilder.add(ModItems.ENDIUM_AXE, "Endium Axe");
        translationBuilder.add(ModItems.ENDIUM_PICKAXE, "Endium Pickaxe");
        translationBuilder.add(ModItems.ENDIUM_SHOVEL, "Endium Shovel");
        translationBuilder.add(ModItems.ENDIUM_HOE, "Endium Hoe");
        translationBuilder.add(ModItems.ENDIUM_SHIELD, "Endium Shield");
        translationBuilder.add(ModItems.PHENON_HELMET, "Phenon Helmet");
        translationBuilder.add(ModItems.PHENON_CHESTPLATE, "Phenon Chestplate");
        translationBuilder.add(ModItems.PHENON_LEGGINGS, "Phenon Leggings");
        translationBuilder.add(ModItems.PHENON_BOOTS, "Phenon Boots");
        translationBuilder.add(ModItems.PHENON_SWORD, "Phenon Sword");
        translationBuilder.add(ModItems.PHENON_AXE, "Phenon Axe");
        translationBuilder.add(ModItems.PHENON_PICKAXE, "Phenon Pickaxe");
        translationBuilder.add(ModItems.PHENON_SHOVEL, "Phenon Shovel");
        translationBuilder.add(ModItems.PHENON_HOE, "Phenon Hoe");
        translationBuilder.add(ModItems.PHENON_SHIELD, "Phenon Shield");
        translationBuilder.add(ModItems.HYPHITE_HELMET, "Hyphite Helmet");
        translationBuilder.add(ModItems.HYPHITE_CHESTPLATE, "Hyphite Chestplate");
        translationBuilder.add(ModItems.HYPHITE_LEGGINGS, "Hyphite Leggings");
        translationBuilder.add(ModItems.HYPHITE_BOOTS, "Hyphite Boots");
        translationBuilder.add(ModItems.HYPHITE_SWORD, "Hyphite Sword");
        translationBuilder.add(ModItems.HYPHITE_AXE, "Hyphite Axe");
        translationBuilder.add(ModItems.HYPHITE_PICKAXE, "Hyphite Pickaxe");
        translationBuilder.add(ModItems.HYPHITE_SHOVEL, "Hyphite Shovel");
        translationBuilder.add(ModItems.HYPHITE_HOE, "Hyphite Hoe");
        translationBuilder.add(ModItems.HYPHITE_SHIELD, "Hyphite Shield");
        translationBuilder.add(ModItems.SAPPHIRE_HELMET, "Sapphire Helmet");
        translationBuilder.add(ModItems.SAPPHIRE_CHESTPLATE, "Sapphire Chestplate");
        translationBuilder.add(ModItems.SAPPHIRE_LEGGINGS, "Sapphire Leggings");
        translationBuilder.add(ModItems.SAPPHIRE_BOOTS, "Sapphire Boots");
        translationBuilder.add(ModItems.SAPPHIRE_SWORD, "Sapphire Sword");
        translationBuilder.add(ModItems.SAPPHIRE_AXE, "Sapphire Axe");
        translationBuilder.add(ModItems.SAPPHIRE_PICKAXE, "Sapphire Pickaxe");
        translationBuilder.add(ModItems.SAPPHIRE_SHOVEL, "Sapphire Shovel");
        translationBuilder.add(ModItems.SAPPHIRE_HOE, "Sapphire Hoe");
        translationBuilder.add(ModItems.SAPPHIRE_SHIELD, "Sapphire Shield");
        translationBuilder.add(ModItems.RUBY_HELMET, "Ruby Helmet");
        translationBuilder.add(ModItems.RUBY_CHESTPLATE, "Ruby Chestplate");
        translationBuilder.add(ModItems.RUBY_LEGGINGS, "Ruby Leggings");
        translationBuilder.add(ModItems.RUBY_BOOTS, "Ruby Boots");
        translationBuilder.add(ModItems.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ModItems.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ModItems.RUBY_HOE, "Ruby Hoe");
        translationBuilder.add(ModItems.RUBY_SHIELD, "Ruby Shield");
        translationBuilder.add(ModItems.TOPAZ_HELMET, "Topaz Helmet");
        translationBuilder.add(ModItems.TOPAZ_CHESTPLATE, "Topaz Chestplate");
        translationBuilder.add(ModItems.TOPAZ_LEGGINGS, "Topaz Leggings");
        translationBuilder.add(ModItems.TOPAZ_BOOTS, "Topaz Boots");
        translationBuilder.add(ModItems.TOPAZ_SWORD, "Topaz Sword");
        translationBuilder.add(ModItems.TOPAZ_AXE, "Topaz Axe");
        translationBuilder.add(ModItems.TOPAZ_PICKAXE, "Topaz Pickaxe");
        translationBuilder.add(ModItems.TOPAZ_SHOVEL, "Topaz Shovel");
        translationBuilder.add(ModItems.TOPAZ_HOE, "Topaz Hoe");
        translationBuilder.add(ModItems.TOPAZ_SHIELD, "Topaz Shield");
        translationBuilder.add(ModItems.OPAL_HELMET, "Opal Helmet");
        translationBuilder.add(ModItems.OPAL_CHESTPLATE, "Opal Chestplate");
        translationBuilder.add(ModItems.OPAL_LEGGINGS, "Opal Leggings");
        translationBuilder.add(ModItems.OPAL_BOOTS, "Opal Boots");
        translationBuilder.add(ModItems.OPAL_SWORD, "Opal Sword");
        translationBuilder.add(ModItems.OPAL_AXE, "Opal Axe");
        translationBuilder.add(ModItems.OPAL_PICKAXE, "Opal Pickaxe");
        translationBuilder.add(ModItems.OPAL_SHOVEL, "Opal Shovel");
        translationBuilder.add(ModItems.OPAL_HOE, "Opal Hoe");
        translationBuilder.add(ModItems.OPAL_SHIELD, "Opal Shield");
        translationBuilder.add(ModItems.ECHO_HELMET, "Echo Helmet");
        translationBuilder.add(ModItems.ECHO_CHESTPLATE, "Echo Chestplate");
        translationBuilder.add(ModItems.ECHO_LEGGINGS, "Echo Leggings");
        translationBuilder.add(ModItems.ECHO_BOOTS, "Echo Boots");
        translationBuilder.add(ModItems.ECHO_SWORD, "Echo Sword");
        translationBuilder.add(ModItems.ECHO_AXE, "Echo Axe");
        translationBuilder.add(ModItems.ECHO_PICKAXE, "Echo Pickaxe");
        translationBuilder.add(ModItems.ECHO_SHOVEL, "Echo Shovel");
        translationBuilder.add(ModItems.ECHO_HOE, "Echo Hoe");
        translationBuilder.add(ModItems.ECHO_SHIELD, "Echo Shield");
        translationBuilder.add(ModItems.EMERALD_HELMET, "Emerald Helmet");
        translationBuilder.add(ModItems.EMERALD_CHESTPLATE, "Emerald Chestplate");
        translationBuilder.add(ModItems.EMERALD_LEGGINGS, "Emerald Leggings");
        translationBuilder.add(ModItems.EMERALD_BOOTS, "Emerald Boots");
        translationBuilder.add(ModItems.EMERALD_SWORD, "Emerald Sword");
        translationBuilder.add(ModItems.EMERALD_AXE, "Emerald Axe");
        translationBuilder.add(ModItems.EMERALD_PICKAXE, "Emerald Pickaxe");
        translationBuilder.add(ModItems.EMERALD_SHOVEL, "Emerald Shovel");
        translationBuilder.add(ModItems.EMERALD_HOE, "Emerald Hoe");
        translationBuilder.add(ModItems.EMERALD_SHIELD, "Emerald Shield");
        translationBuilder.add(ModItems.AMETHYST_HELMET, "Amethyst Helmet");
        translationBuilder.add(ModItems.AMETHYST_CHESTPLATE, "Amethyst Chestplate");
        translationBuilder.add(ModItems.AMETHYST_LEGGINGS, "Amethyst Leggings");
        translationBuilder.add(ModItems.AMETHYST_BOOTS, "Amethyst Boots");
        translationBuilder.add(ModItems.AMETHYST_SWORD, "Amethyst Sword");
        translationBuilder.add(ModItems.AMETHYST_AXE, "Amethyst Axe");
        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "Amethyst Pickaxe");
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "Amethyst Shovel");
        translationBuilder.add(ModItems.AMETHYST_HOE, "Amethyst Hoe");
        translationBuilder.add(ModItems.AMETHYST_SHIELD, "Amethyst Shield");
        translationBuilder.add(ModItems.COPPER_HELMET, "Copper Helmet");
        translationBuilder.add(ModItems.COPPER_CHESTPLATE, "Copper Chestplate");
        translationBuilder.add(ModItems.COPPER_LEGGINGS, "Copper Leggings");
        translationBuilder.add(ModItems.COPPER_BOOTS, "Copper Boots");
        translationBuilder.add(ModItems.COPPER_SWORD, "Copper Sword");
        translationBuilder.add(ModItems.COPPER_AXE, "Copper Axe");
        translationBuilder.add(ModItems.COPPER_PICKAXE, "Copper Pickaxe");
        translationBuilder.add(ModItems.COPPER_SHOVEL, "Copper Shovel");
        translationBuilder.add(ModItems.COPPER_HOE, "Copper Hoe");
        translationBuilder.add(ModItems.COPPER_SHIELD, "Copper Shield");
        translationBuilder.add(ModItems.PHYSICS, "§6§l§kPHYSICS§r");
        translationBuilder.add(ModItems.PHYSICSIUM_ELYTRA_CHESTPLATE, "Physicsium Elytra-Chestplate");
        //Upgrade Templates
        translationBuilder.add("item.moregear.elytrachestplateupgrade", "Physicsium Elytra-Chestplate Upgrade");
        translationBuilder.add("item.moregear.physicsiumupgrade", "Physicsium Upgrade");
        translationBuilder.add("item.moregear.titaniumupgrade", "Titanium Upgrade");
        translationBuilder.add("item.moregear.reinforcedtriphiteupgrade", "Reinforced Triphite Upgrade");
        translationBuilder.add("item.moregear.mythrilupgrade", "Mythril Upgrade");
        translationBuilder.add("item.moregear.endiumupgrade", "Endium Upgrade");
        translationBuilder.add("item.moregear.phenonupgrade", "Phenon Upgrade");
        translationBuilder.add("item.moregear.sapphireupgrade", "Sapphire Upgrade");
        translationBuilder.add("item.moregear.rubyupgrade", "Ruby Upgrade");
        translationBuilder.add("item.moregear.topazupgrade", "Topaz Upgrade");
        translationBuilder.add("item.moregear.opalupgrade", "Opal Upgrade");
        translationBuilder.add("item.moregear.hyphiteupgrade", "Hyphite Upgrade");
        //Spawn Egg
        translationBuilder.add(ModItems.SHRIKE_SPAWN_EGG, "Shrike Spawn Egg");
        //Blocks
        translationBuilder.add(ModBlocks.PHYSICSIUM_BLOCK, "Block of Physicsium");
        translationBuilder.add(ModBlocks.PHYSICSIUM_ORE, "Physicsium Ore");
        translationBuilder.add(ModBlocks.TITANIUM_BLOCK, "Block of Titanium");
        translationBuilder.add(ModBlocks.TITANIUM_ORE, "Titanium Ore");
        translationBuilder.add(ModBlocks.REINFORCED_TRIPHITE_BLOCK, "Block of Reinforced Triphite");
        translationBuilder.add(ModBlocks.TRIPHITE_ORE, "Triphite Ore");
        translationBuilder.add(ModBlocks.MYTHRIL_BLOCK, "Block of Mythril");
        translationBuilder.add(ModBlocks.MYTHRIL_ORE, "Mythril Ore");
        translationBuilder.add(ModBlocks.ENDIUM_BLOCK, "Block of Endium");
        translationBuilder.add(ModBlocks.ANCIENT_ENDIUM, "Ancient Endium");
        translationBuilder.add(ModBlocks.PHENON_BLOCK, "Block of Phenon");
        translationBuilder.add(ModBlocks.UNREFINED_PHENON_BLOCK, "Unrefined Phenon");
        translationBuilder.add(ModBlocks.HYPHITE_BLOCK, "Block of Hyphite");
        translationBuilder.add(ModBlocks.HYPHITE_ORE, "Hyphite Ore");
        translationBuilder.add(ModBlocks.SAPPHIRE_BLOCK, "Block of Sapphire");
        translationBuilder.add(ModBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Block of Ruby");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.TOPAZ_BLOCK, "Block of Topaz");
        translationBuilder.add(ModBlocks.TOPAZ_ORE, "Topaz Ore");
        translationBuilder.add(ModBlocks.OPAL_BLOCK, "Block of Opal");
        translationBuilder.add(ModBlocks.OPAL_ORE, "Opal Ore");
        //Keybinding Stuff
        translationBuilder.add(KeyInputHandler.LEVITATE_KEY, "Levitate Key");
        translationBuilder.add(KeyInputHandler.KEY_CATEGORY, "More Gear Keybindings");
        //Shrike
        translationBuilder.add(ModEntities.SHRIKE, "Shrike");
    }
}
