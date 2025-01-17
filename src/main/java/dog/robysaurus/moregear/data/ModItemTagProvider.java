package dog.robysaurus.moregear.data;

import dog.robysaurus.moregear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //Tools
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PHYSICSIUM_SWORD)
                .add(ModItems.PHYSICS)
                .add(ModItems.TITANIUM_SWORD)
                .add(ModItems.REINFORCED_TRIPHITE_SWORD)
                .add(ModItems.MYTHRIL_SWORD)
                .add(ModItems.ENDIUM_SWORD)
                .add(ModItems.PHENON_SWORD)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.TOPAZ_SWORD)
                .add(ModItems.OPAL_SWORD)
                .add(ModItems.HYPHITE_SWORD)
                .add(ModItems.ECHO_SWORD)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.COPPER_SWORD);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PHYSICSIUM_AXE)
                .add(ModItems.TITANIUM_AXE)
                .add(ModItems.REINFORCED_TRIPHITE_AXE)
                .add(ModItems.MYTHRIL_AXE)
                .add(ModItems.ENDIUM_AXE)
                .add(ModItems.PHENON_AXE)
                .add(ModItems.SAPPHIRE_AXE)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.TOPAZ_AXE)
                .add(ModItems.OPAL_AXE)
                .add(ModItems.HYPHITE_AXE)
                .add(ModItems.ECHO_AXE)
                .add(ModItems.EMERALD_AXE)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.COPPER_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PHYSICSIUM_PICKAXE)
                .add(ModItems.TITANIUM_PICKAXE)
                .add(ModItems.REINFORCED_TRIPHITE_PICKAXE)
                .add(ModItems.MYTHRIL_PICKAXE)
                .add(ModItems.ENDIUM_PICKAXE)
                .add(ModItems.PHENON_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.TOPAZ_PICKAXE)
                .add(ModItems.OPAL_PICKAXE)
                .add(ModItems.HYPHITE_PICKAXE)
                .add(ModItems.ECHO_PICKAXE)
                .add(ModItems.EMERALD_PICKAXE)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.COPPER_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PHYSICSIUM_SHOVEL)
                .add(ModItems.TITANIUM_SHOVEL)
                .add(ModItems.REINFORCED_TRIPHITE_SHOVEL)
                .add(ModItems.MYTHRIL_SHOVEL)
                .add(ModItems.ENDIUM_SHOVEL)
                .add(ModItems.PHENON_SHOVEL)
                .add(ModItems.SAPPHIRE_SHOVEL)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.TOPAZ_SHOVEL)
                .add(ModItems.OPAL_SHOVEL)
                .add(ModItems.HYPHITE_SHOVEL)
                .add(ModItems.ECHO_SHOVEL)
                .add(ModItems.EMERALD_SHOVEL)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.COPPER_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PHYSICSIUM_HOE)
                .add(ModItems.TITANIUM_HOE)
                .add(ModItems.REINFORCED_TRIPHITE_HOE)
                .add(ModItems.MYTHRIL_HOE)
                .add(ModItems.ENDIUM_HOE)
                .add(ModItems.PHENON_HOE)
                .add(ModItems.SAPPHIRE_HOE)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.TOPAZ_HOE)
                .add(ModItems.OPAL_HOE)
                .add(ModItems.HYPHITE_HOE)
                .add(ModItems.ECHO_HOE)
                .add(ModItems.EMERALD_HOE)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.COPPER_HOE);
        //Armor
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.PHYSICSIUM_CHESTPLATE)
                .add(ModItems.PHYSICSIUM_ELYTRA_CHESTPLATE)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.REINFORCED_TRIPHITE_CHESTPLATE)
                .add(ModItems.MYTHRIL_CHESTPLATE)
                .add(ModItems.ENDIUM_CHESTPLATE)
                .add(ModItems.PHENON_CHESTPLATE)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.TOPAZ_CHESTPLATE)
                .add(ModItems.OPAL_CHESTPLATE)
                .add(ModItems.HYPHITE_CHESTPLATE)
                .add(ModItems.ECHO_CHESTPLATE)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.COPPER_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.PHYSICSIUM_BOOTS)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.REINFORCED_TRIPHITE_BOOTS)
                .add(ModItems.MYTHRIL_BOOTS)
                .add(ModItems.ENDIUM_BOOTS)
                .add(ModItems.PHENON_BOOTS)
                .add(ModItems.SAPPHIRE_BOOTS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.TOPAZ_BOOTS)
                .add(ModItems.OPAL_BOOTS)
                .add(ModItems.HYPHITE_BOOTS)
                .add(ModItems.ECHO_BOOTS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.AMETHYST_BOOTS)
                .add(ModItems.COPPER_BOOTS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.PHYSICSIUM_HELMET)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.REINFORCED_TRIPHITE_HELMET)
                .add(ModItems.MYTHRIL_HELMET)
                .add(ModItems.ENDIUM_HELMET)
                .add(ModItems.PHENON_HELMET)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.TOPAZ_HELMET)
                .add(ModItems.OPAL_HELMET)
                .add(ModItems.HYPHITE_HELMET)
                .add(ModItems.ECHO_HELMET)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.COPPER_HELMET);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.PHYSICSIUM_LEGGINGS)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.REINFORCED_TRIPHITE_LEGGINGS)
                .add(ModItems.MYTHRIL_LEGGINGS)
                .add(ModItems.ENDIUM_LEGGINGS)
                .add(ModItems.PHENON_LEGGINGS)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.TOPAZ_LEGGINGS)
                .add(ModItems.OPAL_LEGGINGS)
                .add(ModItems.HYPHITE_LEGGINGS)
                .add(ModItems.ECHO_LEGGINGS)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.COPPER_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PHYSICSIUM_HELMET, ModItems.PHYSICSIUM_CHESTPLATE, ModItems.PHYSICSIUM_ELYTRA_CHESTPLATE, ModItems.PHYSICSIUM_LEGGINGS, ModItems.PHYSICSIUM_BOOTS)
                .add(ModItems.TITANIUM_HELMET, ModItems.TITANIUM_CHESTPLATE, ModItems.TITANIUM_LEGGINGS, ModItems.TITANIUM_BOOTS)
                .add(ModItems.REINFORCED_TRIPHITE_HELMET, ModItems.REINFORCED_TRIPHITE_CHESTPLATE, ModItems.REINFORCED_TRIPHITE_LEGGINGS, ModItems.REINFORCED_TRIPHITE_BOOTS)
                .add(ModItems.MYTHRIL_HELMET, ModItems.MYTHRIL_CHESTPLATE, ModItems.MYTHRIL_LEGGINGS, ModItems.MYTHRIL_BOOTS)
                .add(ModItems.ENDIUM_HELMET, ModItems.ENDIUM_CHESTPLATE, ModItems.ENDIUM_LEGGINGS, ModItems.ENDIUM_BOOTS)
                .add(ModItems.PHENON_HELMET, ModItems.PHENON_CHESTPLATE, ModItems.PHENON_LEGGINGS, ModItems.PHENON_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS)
                .add(ModItems.TOPAZ_HELMET, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ_BOOTS)
                .add(ModItems.OPAL_HELMET, ModItems.OPAL_CHESTPLATE, ModItems.OPAL_LEGGINGS, ModItems.OPAL_BOOTS)
                .add(ModItems.HYPHITE_HELMET, ModItems.HYPHITE_CHESTPLATE, ModItems.HYPHITE_LEGGINGS, ModItems.HYPHITE_BOOTS)
                .add(ModItems.ECHO_HELMET, ModItems.ECHO_CHESTPLATE, ModItems.ECHO_LEGGINGS, ModItems.ECHO_BOOTS)
                .add(ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS)
                .add(ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS)
                .add(ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS);
    }
}
