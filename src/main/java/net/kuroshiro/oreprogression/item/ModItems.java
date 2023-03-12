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

    //TO-DO: ITEMS DE CADA ORE, Y SUS RESPECTIVOS LINGOTES!!
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
