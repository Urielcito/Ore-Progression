package net.kuroshiro.oreprogression.util;

import net.kuroshiro.oreprogression.OreProgression;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks
    {
        //TIERS GENERICOS
        public static final TagKey<Block> NEEDS_TIER_I_TOOL
                = tag("needs_tier_i_tool");
        public static final TagKey<Block> NEEDS_TIER_II_TOOL
                = tag("needs_tier_ii_tool");
        public static final TagKey<Block> NEEDS_TIER_III_TOOL
                = tag("needs_tier_iii_tool");
        public static final TagKey<Block> NEEDS_TIER_IV_TOOL
                = tag("needs_tier_iv_tool");
        public static final TagKey<Block> NEEDS_TIER_V_TOOL
                = tag("needs_tier_v_tool");
        public static final TagKey<Block> NEEDS_TIER_VI_TOOL
                = tag("needs_tier_vi_tool");
        //TIERS ESPECIFICOS
        public static final TagKey<Block> NEEDS_TIN_TOOL
                = tag("needs_tin_tool");

        public static final TagKey<Block> NEEDS_QUALITY_COPPER_TOOL
                = tag("needs_quality_copper_tool");

        public static final TagKey<Block> NEEDS_LEAD_TOOL
                = tag("needs_lead_tool");

        public static final TagKey<Block> NEEDS_QUALITY_IRON_TOOL
                = tag("needs_quality_iron_tool");

        public static final TagKey<Block> NEEDS_SILVER_TOOL
                = tag("needs_silver_tool");

        public static final TagKey<Block> NEEDS_TUNGSTEN_TOOL
                = tag("needs_tungsten_tool");

        public static final TagKey<Block> NEEDS_PLATINUM_TOOL
                = tag("needs_platinum_tool");

        public static final TagKey<Block> NEEDS_QUALITY_GOLD_TOOL
                =tag("needs_quality_gold_tool");

        public static final TagKey<Block> NEEDS_CRIMTANE_TOOL
                = tag("needs_crimtane_tool");

        public static final TagKey<Block> NEEDS_DEMONITE_TOOL
                = tag("needs_demonite_tool");

        public static final TagKey<Block> NEEDS_HELLSTONE_TOOL
                = tag("needs_hellstone_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(OreProgression.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
