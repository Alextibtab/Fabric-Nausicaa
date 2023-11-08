package alextabitha.nausicaa.item;

import alextabitha.nausicaa.Nausicaa;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class NausicaaItemGroups {
    private static final ItemGroup NAUSICAA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Nausicaa.MOD_ID, "ohmu_shell"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(NausicaaItems.OHMU_SHELL))
                    .displayName(Text.translatable("itemgroup.nausicaa"))
                    .entries((context, entries) -> {
                        entries.add(NausicaaItems.OHMU_SHELL);
                    })
                    .build());

    public static void registerItemGroups() {
        Nausicaa.LOGGER.info("Registering Item Groups for " + Nausicaa.MOD_ID);
    }
}
