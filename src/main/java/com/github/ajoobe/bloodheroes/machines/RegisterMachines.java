package com.github.ajoobe.bloodheroes.machines;

import com.github.ajoobe.bloodheroes.items.BHItems;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterMachines {

    public static void setup(SlimefunAddon instance){

        new CompositeCompressor(BHItems.BH_MACHINES, BHItems.BH_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.COMPRESSED_CARBON, SlimefunItems.ALUMINUM_INGOT,
                SlimefunItems.BLISTERING_INGOT_3, new ItemStack(Material.FURNACE), SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ALUMINUM_INGOT})
                .setCapacity(1536).setEnergyConsumption(64).setProcessingSpeed(1).register(instance);

        new CompositeCompressor(BHItems.BH_MACHINES, BHItems.BH_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.COMPRESSED_CARBON, SlimefunItems.ALUMINUM_INGOT,
                SlimefunItems.BLISTERING_INGOT_3, BHItems.BH_COMPRESSOR_1, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ALUMINUM_INGOT})
                .setCapacity(1536).setEnergyConsumption(128).setProcessingSpeed(2).register(instance);

        new CompositeCompressor(BHItems.BH_MACHINES, BHItems.BH_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.COMPRESSED_CARBON, SlimefunItems.ALUMINUM_INGOT,
                SlimefunItems.BLISTERING_INGOT_3, BHItems.BH_COMPRESSOR_2, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ALUMINUM_INGOT})
                .setCapacity(1536).setEnergyConsumption(256).setProcessingSpeed(4).register(instance);

    }

}
