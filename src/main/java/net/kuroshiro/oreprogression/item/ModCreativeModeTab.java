package net.kuroshiro.oreprogression.item;

import net.kuroshiro.oreprogression.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OREPROGRESSION_ORES_TAB = new CreativeModeTab("oreprogressiontab_ores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.NETHERRACK_HELLSTONE_ORE.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_RAW_TAB = new CreativeModeTab("oreprogressiontab_raw") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_DEMONITE.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_INGOTS_TAB = new CreativeModeTab("oreprogressiontab_ingots") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DEMONITE_INGOT.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_BLOCKS_TAB = new CreativeModeTab("oreprogressiontab_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DEMONITE_BLOCK.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_BRICKS_TAB = new CreativeModeTab("oreprogressiontab_bricks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DEMONITE_BRICKS.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_WEAPONS_TAB = new CreativeModeTab("oreprogressiontab_weapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DEMONITE_BROADSWORD.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_TOOLS_TAB = new CreativeModeTab("oreprogressiontab_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DEMONITE_PICKAXE.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_ARMOR_TAB = new CreativeModeTab("oreprogressiontab_armor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHADOW_SCALEMAIL.get());
        }
    };
}
