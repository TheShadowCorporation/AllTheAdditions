package net.shadowrcx.alltheadditions.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shadowrcx.alltheadditions.AllTheAdditions;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AllTheAdditions.MOD_ID);

    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
