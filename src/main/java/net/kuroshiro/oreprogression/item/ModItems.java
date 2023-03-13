package net.kuroshiro.oreprogression.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.kuroshiro.oreprogression.OreProgression;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OreProgression.MOD_ID);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> QUALITY_COPPER_INGOT = ITEMS.register("quality_copper_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> QUALITY_IRON_INGOT = ITEMS.register("quality_iron_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> QUALITY_GOLD_INGOT = ITEMS.register("quality_gold_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> CRIMTANE_INGOT = ITEMS.register("crimtane_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));
    public static final RegistryObject<Item> DEMONITE_INGOT = ITEMS.register("demonite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));

    public static final RegistryObject<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TAB)));


    //TO-DO: ITEMS DE CADA ORE, Y SUS RESPECTIVOS LINGOTES!!
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
