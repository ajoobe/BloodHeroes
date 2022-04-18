package com.github.ajoobe.bloodheroes.items;

import com.github.ajoobe.bloodheroes.BloodHeroes;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

public class BHItemSetup {

    public static final BHItemSetup INSTANCE = new BHItemSetup();
    private final SlimefunAddon plugin = BloodHeroes.getInstance();
    private boolean initialised;

    private BHItemSetup() {}

    public void init() {
        if (initialised) {
            return;
        }

        initialised = true;

        BHItems.BH_MAIN_GROUP.register(BloodHeroes.getInstance());
        BHItems.BH_MACHINES.register(BloodHeroes.getInstance());

    }

}
