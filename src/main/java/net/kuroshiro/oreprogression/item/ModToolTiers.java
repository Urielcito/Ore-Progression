package net.kuroshiro.oreprogression.item;

import net.kuroshiro.oreprogression.OreProgression;
import net.kuroshiro.oreprogression.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    //TIERS GENERICOS
    public static Tier I, II, III, IV, V, VI;
    static{
        I = TierSortingRegistry.registerTier(
                new ForgeTier(2, 0, 0f, 0f, 0,
                        ModTags.Blocks.NEEDS_TIER_I_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "i"), List.of(Tiers.STONE), List.of());
    }
    static{
        II = TierSortingRegistry.registerTier(
                new ForgeTier(3, 0, 0f, 0f, 0,
                        ModTags.Blocks.NEEDS_TIER_II_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "ii"), List.of(Tiers.STONE), List.of());
    }
    static{
        III = TierSortingRegistry.registerTier(
                new ForgeTier(3, 0, 0f, 0f, 0,
                        ModTags.Blocks.NEEDS_TIER_III_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "iii"), List.of(Tiers.IRON), List.of());
    }
    static{
        IV = TierSortingRegistry.registerTier(
                new ForgeTier(4, 0, 0f, 0f, 0,
                        ModTags.Blocks.NEEDS_TIER_IV_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "iv"), List.of(Tiers.IRON), List.of());
    }
    static{
        V = TierSortingRegistry.registerTier(
                new ForgeTier(5, 0, 0f, 0f, 0,
                        ModTags.Blocks.NEEDS_TIER_V_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "v"), List.of(Tiers.DIAMOND), List.of());
    }
    static{
        VI = TierSortingRegistry.registerTier(
                new ForgeTier(4, 0, 0f, 0f, 0,
                        ModTags.Blocks.NEEDS_TIER_VI_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "vi"), List.of(Tiers.NETHERITE), List.of());
    }
    //TIERS PARA DIFERENCIAR CADA PICO
    public static Tier TIN, QUALITY_COPPER, LEAD, QUALITY_IRON, SILVER, TUNGSTEN, PLATINUM, QUALITY_GOLD, CRIMTANE, DEMONITE, HELLSTONE;

    static{ //estaño
        TIN = TierSortingRegistry.registerTier(
                new ForgeTier(2, 200, 4f, 0f, 24,
                        ModTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_tin"), List.of(I), List.of(II));
    }

    static{ //alternativa mas rapida que el estaño
        QUALITY_COPPER = TierSortingRegistry.registerTier(
                new ForgeTier(2, 175, 4.5f, 0f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_COPPER_TOOL, () -> Ingredient.of(ModItems.QUALITY_COPPER_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_quality_copper"), List.of(I), List.of(II));
    }

    static{ //plomo
        LEAD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 500, 6f, 0f, 24,
                        ModTags.Blocks.NEEDS_LEAD_TOOL, () -> Ingredient.of(ModItems.LEAD_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_lead"), List.of(II), List.of(III));
    }

    static{ //alternativa mas rapida que el plomo
        QUALITY_IRON = TierSortingRegistry.registerTier(
                new ForgeTier(2, 450, 6.5f, 0f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_IRON_TOOL, () -> Ingredient.of(ModItems.QUALITY_IRON_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_quality_iron"), List.of(II), List.of(III));
    }

    static{ //tungsteno
        TUNGSTEN = TierSortingRegistry.registerTier(
                new ForgeTier(2, 800, 4.5f, 0f, 24,
                        ModTags.Blocks.NEEDS_TUNGSTEN_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_tungsten"), List.of(III), List.of(IV));
    }

    static{ //alternativa mas rapida que el tungsteno
        SILVER = TierSortingRegistry.registerTier(
                new ForgeTier(3, 600, 7f, 0f, 24,
                        ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_silver"), List.of(III), List.of(IV));
    }

    static{ //oro
        QUALITY_GOLD = TierSortingRegistry.registerTier(
                new ForgeTier(4, 1270, 10f, 0f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_GOLD_TOOL, () -> Ingredient.of(ModItems.QUALITY_GOLD_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_quality_gold"), List.of(IV), List.of(V));
    }

    static{ //alternativa mas rapida que el oro
        PLATINUM = TierSortingRegistry.registerTier(
                new ForgeTier(4, 1000, 12f, 0f, 24,
                        ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_platinum"), List.of(IV), List.of(V));
    }

    static{ //carmesi
        CRIMTANE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 2750, 13f, 0f, 24,
                        ModTags.Blocks.NEEDS_CRIMTANE_TOOL, () -> Ingredient.of(ModItems.CRIMTANE_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_crimtane"), List.of(V), List.of(VI));
    }

    static{ //endemoniao
        DEMONITE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 2500, 17f, 0f, 24,
                        ModTags.Blocks.NEEDS_DEMONITE_TOOL, () -> Ingredient.of(ModItems.DEMONITE_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_demonite"), List.of(V), List.of(VI));
    }

    static{ //fundido
        HELLSTONE = TierSortingRegistry.registerTier(
                new ForgeTier(5, 5000, 5f, 0f, 24,
                        ModTags.Blocks.NEEDS_HELLSTONE_TOOL, () -> Ingredient.of(ModItems.HELLSTONE_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "raw_hellstone"), List.of(VI), List.of());
    }

    //TIERS PARA DIFERENCIAR CADA ESPADA LARGA
    public static Tier TIN_BROADSWORD, QUALITY_COPPER_BROADSWORD, LEAD_BROADSWORD, QUALITY_IRON_BROADSWORD,
            SILVER_BROADSWORD, TUNGSTEN_BROADSWORD, PLATINUM_BROADSWORD,
            QUALITY_GOLD_BROADSWORD, CRIMTANE_BROADSWORD, DEMONITE_BROADSWORD, HELLSTONE_BROADSWORD;

    static{ //estaño
        TIN_BROADSWORD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 200, 4f, 0.5f, 24,
                        ModTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "tin_broadsword"), List.of(I), List.of(II));
    }

    static{ //alternativa mas rapida que el estaño
        QUALITY_COPPER_BROADSWORD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 175, 4.5f, 0.05f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_COPPER_TOOL, () -> Ingredient.of(ModItems.QUALITY_COPPER_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "quality_copper_broadsword"), List.of(I), List.of(II));
    }

    static{ //plomo
        LEAD_BROADSWORD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 500, 6f, 0.85f, 24,
                        ModTags.Blocks.NEEDS_LEAD_TOOL, () -> Ingredient.of(ModItems.LEAD_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "lead_broadsword"), List.of(II), List.of(III));
    }

    static{ //alternativa mas rapida que el plomo
        QUALITY_IRON_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(2, 450, 6.5f, 0.4f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_IRON_TOOL, () -> Ingredient.of(ModItems.QUALITY_IRON_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "quality_iron_broadsword"), List.of(II), List.of(III));
    }

    static{ //tungsteno
        TUNGSTEN_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(2, 800, 4.5f, 0.3f, 24,
                        ModTags.Blocks.NEEDS_TUNGSTEN_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "tungsten_broadsword"), List.of(III), List.of(IV));
    }

    static{ //alternativa mas rapida que el tungsteno
        SILVER_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(3, 600, 7f, 0.3f, 24,
                        ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "silver_broadsword"), List.of(III), List.of(IV));
    }

    static{ //oro
        QUALITY_GOLD_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(4, 1270, 10f, 0.75f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_GOLD_TOOL, () -> Ingredient.of(ModItems.QUALITY_GOLD_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "quality_gold_broadsword"), List.of(IV), List.of(V));
    }

    static{ //alternativa mas rapida que el oro
        PLATINUM_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(4, 1000, 12f, 0.2f, 24,
                        ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "platinum_broadsword"), List.of(IV), List.of(V));
    }

    static{ //carmesi
        CRIMTANE_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(4, 2750, 13f, 0.9f, 24,
                        ModTags.Blocks.NEEDS_CRIMTANE_TOOL, () -> Ingredient.of(ModItems.CRIMTANE_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "crimtane_broadsword"), List.of(V), List.of(VI));
    }

    static{ //endemoniao
        DEMONITE_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(4, 2500, 17f, 0.2f, 24,
                        ModTags.Blocks.NEEDS_DEMONITE_TOOL, () -> Ingredient.of(ModItems.DEMONITE_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "demonite_broadsword"), List.of(V), List.of(VI));
    }

    static{ //fundido
        HELLSTONE_BROADSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(5, 5000, 5f, 0.1f, 24,
                        ModTags.Blocks.NEEDS_HELLSTONE_TOOL, () -> Ingredient.of(ModItems.HELLSTONE_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "hellstone_broadsword"), List.of(VI), List.of());
    }

    //TIERS PARA DIFERENCIAR CADA ESPADA CORTA
    public static Tier TIN_SHORTSWORD, QUALITY_COPPER_SHORTSWORD, LEAD_SHORTSWORD, QUALITY_IRON_SHORTSWORD,
            SILVER_SHORTSWORD, TUNGSTEN_SHORTSWORD, PLATINUM_SHORTSWORD,
            QUALITY_GOLD_SHORTSWORD, CRIMTANE_SHORTSWORD, DEMONITE_SHORTSWORD, HELLSTONE_SHORTSWORD;

    static{ //estaño
        TIN_SHORTSWORD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 200, 4f, 0.12f, 24,
                        ModTags.Blocks.NEEDS_TIN_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "tin_shortsword"), List.of(I), List.of(II));
    }

    static{ //alternativa mas rapida que el estaño
        QUALITY_COPPER_SHORTSWORD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 175, 4.5f, 0.25f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_COPPER_TOOL, () -> Ingredient.of(ModItems.QUALITY_COPPER_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "quality_copper_shortsword"), List.of(I), List.of(II));
    }

    static{ //plomo
        LEAD_SHORTSWORD = TierSortingRegistry.registerTier(
                new ForgeTier(2, 500, 6f, 0.05f, 24,
                        ModTags.Blocks.NEEDS_LEAD_TOOL, () -> Ingredient.of(ModItems.LEAD_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "lead_shortsword"), List.of(II), List.of(III));
    }

    static{ //alternativa mas rapida que el plomo
        QUALITY_IRON_SHORTSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(2, 450, 6.5f, 0.6f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_IRON_TOOL, () -> Ingredient.of(ModItems.QUALITY_IRON_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "quality_iron_shortsword"), List.of(II), List.of(III));
    }

    static{ //tungsteno
        TUNGSTEN_SHORTSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(2, 800, 4.5f, 0.5f, 24,
                        ModTags.Blocks.NEEDS_TUNGSTEN_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "tungsten_shortsword"), List.of(III), List.of(IV));
    }

    static{ //alternativa mas rapida que el tungsteno
        SILVER_SHORTSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(3, 600, 7f, 0.05f, 24,
                        ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "silver_shortsword"), List.of(III), List.of(IV));
    }

    static{ //oro
        QUALITY_GOLD_SHORTSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(4, 1270, 10f, 0.4f, 24,
                        ModTags.Blocks.NEEDS_QUALITY_GOLD_TOOL, () -> Ingredient.of(ModItems.QUALITY_GOLD_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "quality_gold_shortsword"), List.of(IV), List.of(V));
    }

    static{ //alternativa mas rapida que el oro
        PLATINUM_SHORTSWORD= TierSortingRegistry.registerTier(
                new ForgeTier(4, 1000, 12f, 0.85f, 24,
                        ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
                new ResourceLocation(OreProgression.MOD_ID, "platinum_shortsword"), List.of(IV), List.of(V));
    }


}
