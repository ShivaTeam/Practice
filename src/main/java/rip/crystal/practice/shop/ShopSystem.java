package rip.crystal.practice.shop;

import rip.crystal.practice.player.profile.Profile;

import java.util.UUID;

public class ShopSystem {

    public int getCoins(UUID uuid) {
        Profile profile = Profile.get(uuid);
        return profile.getCoins();
    }

    public void setCoins(UUID uuid, int coins) {
        Profile profile = Profile.get(uuid);

        profile.setCoins(coins);
    }
}
