package rip.crystal.practice.shop.buttons;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import rip.crystal.practice.player.profile.Profile;
import rip.crystal.practice.shop.impl.trails.menu.TrailEffectsShopMenu;
import rip.crystal.practice.utilities.ItemBuilder;
import rip.crystal.practice.utilities.menu.Button;

import java.util.ArrayList;
import java.util.List;

public class TrailsEffectsShopButton extends Button {

    @Override
    public ItemStack getButtonItem(Player player) {

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("&7Click here to purchase Trail Effects!");

        return new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .name("&4&lBuy Trail Effects")
                .lore(lore)
                .build();
    }

    @Override
    public void clicked(Player player, ClickType clickType) {
        Profile profile = Profile.get(player.getUniqueId());
        new TrailEffectsShopMenu().openMenu(player);
    }
}

