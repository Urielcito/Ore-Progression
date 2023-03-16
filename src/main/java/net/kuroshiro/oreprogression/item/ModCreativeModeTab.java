package net.kuroshiro.oreprogression.item;

import net.kuroshiro.oreprogression.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OREPROGRESSION_ORES_TAB = new CreativeModeTab("oreprogressiontab_ores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TIN_ORE.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_RAW_TAB = new CreativeModeTab("oreprogressiontab_raw") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_TIN.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_INGOTS_TAB = new CreativeModeTab("oreprogressiontab_ingots") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_INGOT.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_BLOCKS_TAB = new CreativeModeTab("oreprogressiontab_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TIN_BLOCK.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_BRICKS_TAB = new CreativeModeTab("oreprogressiontab_bricks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TIN_BRICKS.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_WEAPONS_TAB = new CreativeModeTab("oreprogressiontab_weapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_BROADSWORD.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_TOOLS_TAB = new CreativeModeTab("oreprogressiontab_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_PICKAXE.get());
        }
    };

    public static final CreativeModeTab OREPROGRESSION_ARMOR_TAB = new CreativeModeTab("oreprogressiontab_armor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_CHAINMAIL.get());
        }
    };
}
