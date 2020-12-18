package io.github.lizisnotinting.tutorialmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class IconItemGroup extends ItemGroup {
    private final Supplier<ItemStack> iconSupplier;

    public IconItemGroup(String label, Supplier<ItemStack> iconSupplier) {
        super(label);
        this.iconSupplier = iconSupplier;
    }

    public IconItemGroup(int index, String label, Supplier<ItemStack> iconSupplier) {
        super(index, label);
        this.iconSupplier = iconSupplier;
    }

    public static IconItemGroup ofItem(String label, Supplier<Item> iconSupplier) {
        return new IconItemGroup(label, () -> new ItemStack(iconSupplier.get()));
    }

    public static IconItemGroup ofItem(int index, String label, Supplier<Item> iconSupplier) {
        return new IconItemGroup(index, label, () -> new ItemStack(iconSupplier.get()));
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}
