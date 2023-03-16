package net.kuroshiro.oreprogression.world.feature;

import net.kuroshiro.oreprogression.OreProgression;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, OreProgression.MOD_ID);


    public static final RegistryObject<PlacedFeature> TIN_ORE_PLACED = PLACED_FEATURES.register("tin_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TIN_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(112)))));

    public static final RegistryObject<PlacedFeature> QUALITY_COPPER_ORE_PLACED = PLACED_FEATURES.register("quality_copper_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.QUALITY_COPPER_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(64), VerticalAnchor.aboveBottom(112)))));

    public static final RegistryObject<PlacedFeature> LEAD_ORE_PLACED = PLACED_FEATURES.register("lead_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LEAD_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(24), VerticalAnchor.aboveBottom(92)))));

    public static final RegistryObject<PlacedFeature> QUALITY_IRON_ORE_PLACED = PLACED_FEATURES.register("quality_iron_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.QUALITY_IRON_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(24), VerticalAnchor.aboveBottom(92)))));

    public static final RegistryObject<PlacedFeature> SILVER_ORE_PLACED = PLACED_FEATURES.register("silver_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SILVER_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(92)))));

    public static final RegistryObject<PlacedFeature> TUNGSTEN_ORE_PLACED = PLACED_FEATURES.register("tungsten_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TUNGSTEN_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(92)))));

    public static final RegistryObject<PlacedFeature> PLATINUM_ORE_PLACED = PLACED_FEATURES.register("platinum_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PLATINUM_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(85)))));

    public static final RegistryObject<PlacedFeature> QUALITY_GOLD_ORE_PLACED = PLACED_FEATURES.register("quality_gold_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.QUALITY_GOLD_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(85)))));

    public static final RegistryObject<PlacedFeature> CRIMTANE_ORE_PLACED = PLACED_FEATURES.register("crimtane_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CRIMTANE_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64)))));

    public static final RegistryObject<PlacedFeature> DEMONITE_ORE_PLACED = PLACED_FEATURES.register("demonite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DEMONITE_ORE.getHolder().get(),
                    commonOrePlacement(8,
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(64)))));

    public static final RegistryObject<PlacedFeature> HELLSTONE_ORE_PLACED = PLACED_FEATURES.register("netherrack_hellstone_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_HELLSTONE_ORE.getHolder().get(),
                    commonOrePlacement(50,
                            HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(25)))));
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_){
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_){
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_){
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
