package net.shadowrcx.alltheadditions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shadowrcx.alltheadditions.AllTheAdditions;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllTheAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALL_THE_ADDITIONS = CREATIVE_MODE_TABS.register("all_the_additions",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_COIN.get()))
                    .title(Component.translatable("creativetab.all_the_additions"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COPPER_COIN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
