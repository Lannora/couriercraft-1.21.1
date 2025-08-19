package com.lannora.couriercraft.item;

import com.lannora.couriercraft.CourierCraft;
import com.lannora.couriercraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CouriercraftItemGroup {

    public static final ItemGroup COURIERCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CourierCraft.MOD_ID, "couriercraft_item"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.MAILBOX))
                    .displayName(Text.translatable("itemgroup.couriercraft.couriercraftItems"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAILBOX);
                        entries.add(ModItems.LETTER);
                    })
                    .build());

    public static void registerItemGroups () {

    }

}
