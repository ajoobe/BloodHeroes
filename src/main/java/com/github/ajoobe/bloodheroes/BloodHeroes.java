package com.github.ajoobe.bloodheroes;

import com.github.ajoobe.bloodheroes.items.BHItemSetup;
import com.github.ajoobe.bloodheroes.items.BHItems;
import com.github.ajoobe.bloodheroes.machines.RegisterMachines;
import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BloodHeroes extends JavaPlugin implements SlimefunAddon {

    public static BloodHeroes instance;
    private boolean byPass = false;
    private boolean shouldDisable = false;

    @Override
    public void onEnable() {
        instance = this;

        runChecks();

        Config cfg = new Config(this);
        if (cfg.getBoolean("options.auto-update")) {

        }

        BHItemSetup.INSTANCE.init();
        RegisterMachines.setup(this);

    }

    @Override
    public void onDisable() {
        if (shouldDisable) return;
        instance = null;
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return instance;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return null;
    }


    private void runChecks() {
        if (!byPass) {
            if (!PaperLib.isPaper()) {
                Bukkit.getConsoleSender().sendMessage("BloodHeroes only supports Paper and its forks (i.e. Airplane and Purpur)");
                Bukkit.getConsoleSender().sendMessage("Please use Paper or a fork of Paper");
                shouldDisable = true;
            }
            if (Slimefun.getMinecraftVersion().isBefore(MinecraftVersion.MINECRAFT_1_17)) {
                Bukkit.getConsoleSender().sendMessage("BloodHeroes only supports Minecraft 1.17 and above");
                Bukkit.getConsoleSender().sendMessage("Please use Minecraft 1.17 or above");
                shouldDisable = true;
            }

            if (shouldDisable) {
                Bukkit.getPluginManager().disablePlugin(this);
                return;
            }
        }

    }

    public static BloodHeroes getInstance() {
        return instance;
    }
}
