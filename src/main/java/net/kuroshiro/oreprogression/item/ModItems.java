package net.kuroshiro.oreprogression.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.kuroshiro.oreprogression.OreProgression;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OreProgression.MOD_ID);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> QUALITY_COPPER_INGOT = ITEMS.register("quality_copper_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> QUALITY_IRON_INGOT = ITEMS.register("quality_iron_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> QUALITY_GOLD_INGOT = ITEMS.register("quality_gold_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> CRIMTANE_INGOT = ITEMS.register("crimtane_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> DEMONITE_INGOT = ITEMS.register("demonite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_QUALITY_COPPER = ITEMS.register("raw_quality_copper", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_QUALITY_IRON = ITEMS.register("raw_quality_iron", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_QUALITY_GOLD = ITEMS.register("raw_quality_gold", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_CRIMTANE = ITEMS.register("raw_crimtane", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_DEMONITE = ITEMS.register("raw_demonite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));
    public static final RegistryObject<Item> RAW_HELLSTONE = ITEMS.register("raw_hellstone", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_RAW_TAB)));


    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> QUALITY_COPPER_NUGGET = ITEMS.register("quality_copper_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> QUALITY_IRON_NUGGET = ITEMS.register("quality_iron_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> QUALITY_GOLD_NUGGET = ITEMS.register("quality_gold_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> CRIMTANE_NUGGET = ITEMS.register("crimtane_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> DEMONITE_NUGGET = ITEMS.register("demonite_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));

    public static final RegistryObject<Item> HELLSTONE_NUGGET = ITEMS.register("hellstone_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_INGOTS_TAB)));
    //ARMAS
    public static final RegistryObject<Item> TIN_BROADSWORD = ITEMS.register("tin_broadsword", () -> new SwordItem(ModToolTiers.TIN, 4-1, -1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TIN_SHORTSWORD = ITEMS.register("tin_shortsword", () -> new SwordItem(ModToolTiers.TIN, 3-1, 0.61f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_COPPER_BROADSWORD = ITEMS.register("quality_copper_broadsword", () -> new SwordItem(ModToolTiers.QUALITY_COPPER, 4-1, 1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_COPPER_SHORTSWORD = ITEMS.register("quality_copper_shortsword", () -> new SwordItem(ModToolTiers.QUALITY_COPPER, 2-1, 1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> LEAD_BROADSWORD = ITEMS.register("lead_broadsword", () -> new SwordItem(ModToolTiers.LEAD, 5-1, -1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> LEAD_SHORTSWORD = ITEMS.register("lead_shortsword", () -> new SwordItem(ModToolTiers.LEAD, 4-1, 1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_IRON_BROADSWORD = ITEMS.register("quality_iron_broadsword", () -> new SwordItem(ModToolTiers.QUALITY_IRON, 5-1, -1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_IRON_SHORTSWORD = ITEMS.register("quality_iron_shortsword", () -> new SwordItem(ModToolTiers.QUALITY_IRON, 3-1, 1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SILVER_BROADSWORD = ITEMS.register("silver_broadsword", () -> new SwordItem(ModToolTiers.SILVER, 6-1, -1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_SHORTSWORD = ITEMS.register("silver_shortsword", () -> new SwordItem(ModToolTiers.SILVER, 4-1, 1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TUNGSTEN_BROADSWORD = ITEMS.register("tungsten_broadsword", () -> new SwordItem(ModToolTiers.TUNGSTEN, 6-1, -0.84f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_SHORTSWORD = ITEMS.register("tungsten_shortsword", () -> new SwordItem(ModToolTiers.TUNGSTEN, 4-1, 1.45f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> PLATINUM_BROADSWORD = ITEMS.register("platinum_broadsword", () -> new SwordItem(ModToolTiers.PLATINUM, 7-1, -0.47f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_SHORTSWORD = ITEMS.register("platinum_shortsword", () -> new SwordItem(ModToolTiers.PLATINUM, 5-1, 2f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_GOLD_BROADSWORD = ITEMS.register("quality_gold_broadsword", () -> new SwordItem(ModToolTiers.QUALITY_GOLD, 6-1, -0.66f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_GOLD_SHORTSWORD = ITEMS.register("quality_gold_shortsword", () -> new SwordItem(ModToolTiers.QUALITY_GOLD, 5-1, 1.45f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CRIMTANE_BROADSWORD = ITEMS.register("crimtane_broadsword", () -> new SwordItem(ModToolTiers.CRIMTANE, 9-1, -1.6f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DEMONITE_BROADSWORD = ITEMS.register("demonite_broadsword", () -> new SwordItem(ModToolTiers.DEMONITE, 7-1, -1f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> HELLSTONE_BROADSWORD = ITEMS.register("hellstone_broadsword", () -> new SwordItem(ModToolTiers.HELLSTONE, 18-1, -2.5f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_WEAPONS_TAB).stacksTo(1)));
    //HERRAMIENTAS
    //PICOS
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(ModToolTiers.TIN, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_COPPER_PICKAXE = ITEMS.register("quality_copper_pickaxe", () -> new PickaxeItem(ModToolTiers.QUALITY_COPPER, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () -> new PickaxeItem(ModToolTiers.LEAD, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_IRON_PICKAXE = ITEMS.register("quality_iron_pickaxe", () -> new PickaxeItem(ModToolTiers.QUALITY_IRON, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModToolTiers.SILVER, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", () -> new PickaxeItem(ModToolTiers.TUNGSTEN, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(ModToolTiers.PLATINUM, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_GOLD_PICKAXE = ITEMS.register("quality_gold_pickaxe", () -> new PickaxeItem(ModToolTiers.QUALITY_GOLD, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CRIMTANE_PICKAXE = ITEMS.register("crimtane_pickaxe", () -> new PickaxeItem(ModToolTiers.CRIMTANE, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DEMONITE_PICKAXE = ITEMS.register("demonite_pickaxe", () -> new PickaxeItem(ModToolTiers.DEMONITE, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> HELLSTONE_PICKAXE = ITEMS.register("hellstone_pickaxe", () -> new PickaxeItem(ModToolTiers.HELLSTONE, 2, -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_TOOLS_TAB).stacksTo(1)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
