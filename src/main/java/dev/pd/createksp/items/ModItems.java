package dev.pd.createksp.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

import static dev.pd.createksp.Createksp.MODID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> SOLID_FUEL_DUST = ITEMS.register("solid_fuel_dust", () -> new SolidFuelDustItem(
                    new Item.Properties().food(
                            new FoodProperties(
                                    0, 0, true, 3f, null, null
                            )
                    )
            )
    );

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
