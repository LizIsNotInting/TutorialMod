package io.github.lizisnotinting.tutorialmod.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static io.github.lizisnotinting.tutorialmod.TutorialMod.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register(
            "tungsten_ingot",
            () -> new Item(
                    new Item.Properties()
                            .group(ModItemGroups.MOD_ITEMS)
            )
    );
}
