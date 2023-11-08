package alextabitha.nausicaa.item;

import alextabitha.nausicaa.Nausicaa;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NausicaaItems {
    public static final Item OHMU_SHELL = registerItem("ohmu_shell", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Nausicaa.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Nausicaa.LOGGER.info("Registering Mod Items for " + Nausicaa.MOD_ID);
    }
}
