package net.kuroshiro.oreprogression.block;

import net.kuroshiro.oreprogression.OreProgression;
import net.kuroshiro.oreprogression.item.ModCreativeModeTab;
import net.kuroshiro.oreprogression.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OreProgression.MOD_ID);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //estaño
    public static final RegistryObject<Block> TIN_BRICKS = registerBlock("tin_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> QUALITY_COPPER_ORE = registerBlock("quality_copper_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> QUALITY_DEEPSLATE_COPPER_ORE = registerBlock("quality_deepslate_copper_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //cobre de calidad
    public static final RegistryObject<Block> QUALITY_COPPER_BRICKS = registerBlock("quality_copper_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //plomo
    public static final RegistryObject<Block> LEAD_BRICKS = registerBlock("lead_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> QUALITY_IRON_ORE = registerBlock("quality_iron_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> QUALITY_DEEPSLATE_IRON_ORE = registerBlock("quality_deepslate_iron_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //hierro de calidad
    public static final RegistryObject<Block> QUALITY_IRON_BRICKS = registerBlock("quality_iron_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //plata
    public static final RegistryObject<Block> SILVER_BRICKS = registerBlock("silver_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //tungsteno
    public static final RegistryObject<Block> TUNGSTEN_BRICKS = registerBlock("tungsten_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //platino
    public static final RegistryObject<Block> PLATINUM_BRICKS = registerBlock("platinum_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> QUALITY_GOLD_ORE = registerBlock("quality_gold_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> QUALITY_DEEPSLATE_GOLD_ORE = registerBlock("quality_deepslate_gold_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //oro
    public static final RegistryObject<Block> QUALITY_GOLD_BRICKS = registerBlock("quality_gold_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> CRIMTANE_ORE = registerBlock("crimtane_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CRIMTANE_ORE = registerBlock("deepslate_crimtane_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //mineral carmesi
    public static final RegistryObject<Block> CRIMTANE_BRICKS = registerBlock("crimtane_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    public static final RegistryObject<Block> DEMONITE_ORE = registerBlock("demonite_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB);
    public static final RegistryObject<Block> DEEPSLATE_DEMONITE_ORE = registerBlock("deepslate_demonite_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //mineral endemoniado
    public static final RegistryObject<Block> DEMONITE_BRICKS = registerBlock("demonite_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);
    public static final RegistryObject<Block> NETHERRACK_HELLSTONE_ORE = registerBlock("netherrack_hellstone_ore",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_ORES_TAB); //piedra fundida
    public static final RegistryObject<Block> HELLSTONE_BRICKS = registerBlock("hellstone_bricks",
            ()->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.OREPROGRESSION_BRICKS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
