package net.temmie.twins.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.temmie.twins.TwinsAPI;

public class ModItems {

    public static final Item TELEPORT_STAR = registerItem("teleport_star", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item FIREBALL = registerItem("fireball_spell", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SPHERE_OF_DARKNESS_SPELL = registerItem("sphere_of_darkness_spell", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item UP_VOTE = registerItem("up_vote", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DOWN_VOTE = registerItem("down_vote", new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TwinsAPI.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + TwinsAPI.MOD_ID);
    }
}
