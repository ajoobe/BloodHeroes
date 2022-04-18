package com.github.ajoobe.bloodheroes.items;

import com.github.ajoobe.bloodheroes.BloodHeroes;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class BHItems {

    public static final NestedItemGroup BH_MAIN_GROUP = new NestedItemGroup(
            new NamespacedKey(BloodHeroes.getInstance(), "BLOOD_HEROES"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "47ca7883b1b9b2bb588e1a71d33b2923b7c7926dfba6db13414339961136fdd8")),
                    "&4Blood &8&lHeroes"));

    public static final SubItemGroup BH_MACHINES = new SubItemGroup(
            new NamespacedKey(BloodHeroes.getInstance(), "BLOOD_HEROES_MACHINERY"),
            BH_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7767a0cacdd7316d40e69f6bb923cb6b8bf2d8249918d8d1b94f2bf469d5cefc")),
                    "&eBH Machinery"));

    public static final SubItemGroup BH_ARMOR = new SubItemGroup(
            new NamespacedKey(BloodHeroes.getInstance(), "BLOOD_HEROES_ARMOR"),
            BH_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "a0a27239f4359f4980ebdf26cf270f42654f15134797ae4bad96f60b40ae2942")),
                    "&eBH Armor"));

    public static final SubItemGroup BH_WEAPONS= new SubItemGroup(
            new NamespacedKey(BloodHeroes.getInstance(), "BLOOD_HEROES_WEAPONS"),
            BH_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "f00e7b33ee2a6002758acfe08c7df6bd37a497dc9f8000c3ca9824a2cfabcadd")),
                    "&eBH Weapons"));

    /** Composite Compressors **/
    public static final SlimefunItemStack BH_COMPRESSOR_1 = new SlimefunItemStack(
            "BH_COMPRESSOR_1",
            Material.ORANGE_TERRACOTTA,
            "&dComposite Compressor I",
            "", "&eA machinery that can compress",
            "&ecomposite items",
            "",
            "&d&oBH Machinery",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(128));

    public static final SlimefunItemStack BH_COMPRESSOR_2 = new SlimefunItemStack(
            "BH_COMPRESSOR_2",
            Material.ORANGE_TERRACOTTA,
            "&dComposite Compressor II",
            "", "&eA machinery that can compress",
            "&ecomposite items",
            "",
            "&d&oBH Machinery",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack BH_COMPRESSOR_3 = new SlimefunItemStack(
            "BH_COMPRESSOR_3",
            Material.ORANGE_TERRACOTTA,
            "&dComposite Compressor III",
            "", "&eA machinery that can compress",
            "&ecomposite items",
            "",
            "&d&oBH Machinery",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(512));
}
