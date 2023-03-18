package net.kuroshiro.oreprogression.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    //ARMADURA
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TIN_CHAINMAIL = ITEMS.register("tin_chainmail", () -> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TIN_GREAVES = ITEMS.register("tin_greaves", () -> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_COPPER_HELMET = ITEMS.register("quality_copper_helmet", () -> new ArmorItem(ModArmorMaterials.QUALITY_COPPER, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_COPPER_CHAINMAIL = ITEMS.register("quality_copper_chainmail", () -> new ArmorItem(ModArmorMaterials.QUALITY_COPPER, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_COPPER_LEGGINGS = ITEMS.register("quality_copper_leggings", () -> new ArmorItem(ModArmorMaterials.QUALITY_COPPER, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_COPPER_GREAVES = ITEMS.register("quality_copper_greaves", () -> new ArmorItem(ModArmorMaterials.QUALITY_COPPER, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet", () -> new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> LEAD_CHAINMAIL = ITEMS.register("lead_chainmail", () -> new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () -> new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> LEAD_GREAVES = ITEMS.register("lead_greaves", () -> new ArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_IRON_HELMET = ITEMS.register("quality_iron_helmet", () -> new ArmorItem(ModArmorMaterials.QUALITY_IRON, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_IRON_CHAINMAIL = ITEMS.register("quality_iron_chainmail", () -> new ArmorItem(ModArmorMaterials.QUALITY_IRON, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_IRON_LEGGINGS = ITEMS.register("quality_iron_leggings", () -> new ArmorItem(ModArmorMaterials.QUALITY_IRON, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_IRON_GREAVES = ITEMS.register("quality_iron_greaves", () -> new ArmorItem(ModArmorMaterials.QUALITY_IRON, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_CHAINMAIL = ITEMS.register("silver_chainmail", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_GREAVES = ITEMS.register("silver_greaves", () -> new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_CHAINMAIL = ITEMS.register("tungsten_chainmail", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> TUNGSTEN_GREAVES = ITEMS.register("tungsten_greaves", () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_CHAINMAIL = ITEMS.register("platinum_chainmail", () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_GREAVES = ITEMS.register("platinum_greaves", () -> new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> QUALITY_GOLD_HELMET = ITEMS.register("quality_gold_helmet", () -> new ArmorItem(ModArmorMaterials.QUALITY_GOLD, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_GOLD_CHAINMAIL = ITEMS.register("quality_gold_chainmail", () -> new ArmorItem(ModArmorMaterials.QUALITY_GOLD, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_GOLD_LEGGINGS = ITEMS.register("quality_gold_leggings", () -> new ArmorItem(ModArmorMaterials.QUALITY_GOLD, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> QUALITY_GOLD_GREAVES = ITEMS.register("quality_gold_greaves", () -> new ArmorItem(ModArmorMaterials.QUALITY_GOLD, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CRIMSON_HELMET = ITEMS.register("crimson_helmet", () -> new ArmorItem(ModArmorMaterials.CRIMTANE, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> CRIMSON_SCALEMAIL = ITEMS.register("crimson_scalemail", () -> new ArmorItem(ModArmorMaterials.CRIMTANE, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> CRIMSON_LEGGINGS = ITEMS.register("crimson_leggings", () -> new ArmorItem(ModArmorMaterials.CRIMTANE, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> CRIMSON_GREAVES = ITEMS.register("crimson_greaves", () -> new ArmorItem(ModArmorMaterials.CRIMTANE, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SHADOW_HELMET = ITEMS.register("shadow_helmet", () -> new ArmorItem(ModArmorMaterials.DEMONITE, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SHADOW_SCALEMAIL = ITEMS.register("shadow_scalemail", () -> new ArmorItem(ModArmorMaterials.DEMONITE, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SHADOW_LEGGINGS = ITEMS.register("shadow_leggings", () -> new ArmorItem(ModArmorMaterials.DEMONITE, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SHADOW_GREAVES = ITEMS.register("shadow_greaves", () -> new ArmorItem(ModArmorMaterials.DEMONITE, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_HELMET = ITEMS.register("molten_helmet", () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_BREASTPLATE = ITEMS.register("molten_breastplate", () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_LEGGINGS = ITEMS.register("molten_leggings", () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_GREAVES = ITEMS.register("molten_greaves", () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.OREPROGRESSION_ARMOR_TAB).stacksTo(1)));

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
