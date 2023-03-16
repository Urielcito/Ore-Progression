package net.kuroshiro.oreprogression.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.kuroshiro.oreprogression.OreProgression;
import net.kuroshiro.oreprogression.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, OreProgression.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TIN_ORES = Suppliers.memoize(()-> List.of(//ESTAÑO
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES.get(), 11)));             //TIER I

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_QUALITY_COPPER_ORES = Suppliers.memoize(()-> List.of(//COBRE DE CALIDAD
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.QUALITY_COPPER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_COPPER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> QUALITY_COPPER_ORE = CONFIGURED_FEATURES.register("quality_copper_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_QUALITY_COPPER_ORES.get(), 11)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LEAD_ORES = Suppliers.memoize(()-> List.of(//PLOMO
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LEAD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_COPPER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LEAD_ORE = CONFIGURED_FEATURES.register("lead_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES.get(), 8)));               //TIER II

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_QUALITY_IRON_ORES = Suppliers.memoize(()-> List.of(//HIERRO DE CALIDAD
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.QUALITY_IRON_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_IRON_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> QUALITY_IRON_ORE = CONFIGURED_FEATURES.register("quality_iron_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_QUALITY_IRON_ORES.get(), 8)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(()-> List.of(//PLATA
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_COPPER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(), 8)));               //TIER III

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TUNGSTEN_ORES = Suppliers.memoize(()-> List.of(//TUNGSTENO
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TUNGSTEN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_IRON_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TUNGSTEN_ORE = CONFIGURED_FEATURES.register("tungsten_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TUNGSTEN_ORES.get(), 8)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PLATINUM_ORES = Suppliers.memoize(()-> List.of(//PLATINO
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_COPPER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PLATINUM_ORE = CONFIGURED_FEATURES.register("platinum_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PLATINUM_ORES.get(), 8)));               //TIER IV

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_QUALITY_GOLD_ORES = Suppliers.memoize(()-> List.of(//QUALITY_GOLD
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.QUALITY_GOLD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_IRON_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> QUALITY_GOLD_ORE = CONFIGURED_FEATURES.register("quality_gold_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_QUALITY_GOLD_ORES.get(), 8)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CRIMTANE_ORES = Suppliers.memoize(()-> List.of(//CRIMTANE
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRIMTANE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_COPPER_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CRIMTANE_ORE = CONFIGURED_FEATURES.register("crimtane_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CRIMTANE_ORES.get(), 8)));               //TIER V

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_DEMONITE_ORES = Suppliers.memoize(()-> List.of(//DEMONITE
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DEMONITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.QUALITY_DEEPSLATE_IRON_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEMONITE_ORE = CONFIGURED_FEATURES.register("demonite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_DEMONITE_ORES.get(), 8)));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_HELLSTONE_ORES = Suppliers.memoize(()-> List.of(//HELLSTONE
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_HELLSTONE_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_HELLSTONE_ORE = CONFIGURED_FEATURES.register("netherrack_hellstone_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_HELLSTONE_ORES.get(), 30)));
    
    

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
