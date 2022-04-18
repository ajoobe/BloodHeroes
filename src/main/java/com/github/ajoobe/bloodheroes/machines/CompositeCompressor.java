package com.github.ajoobe.bloodheroes.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class CompositeCompressor  extends AContainer implements RecipeDisplayItem {

    public CompositeCompressor(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[0]);
        }

        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        SlimefunItemStack ALUMINUM_COMPOSITE = new SlimefunItemStack(
                "ALUMINUM_COMPOSITE",
                Material.IRON_INGOT,
                "&fAluminum Composite",
                "",
                "&7You'll never guess how long it took us",
                "&7to name this material"
        );


        SlimefunItemStack ALUMINUM_COMPOSITE_SHEET = new SlimefunItemStack(
                "ALUMINUM_COMPOSITE_SHEET",
                Material.PAPER,
                "&fAluminum Composite Sheet"
        );


        SlimefunItemStack HEAVY_DUTY_SHEET = new SlimefunItemStack(
                "HEAVY_DUTY_SHEET",
                Material.PAPER,
                "&fHeavy Duty Sheet"
        );

        registerRecipe(12, new ItemStack[]{new SlimefunItemStack(ALUMINUM_COMPOSITE, 8)}, new ItemStack[]{ALUMINUM_COMPOSITE_SHEET});
        registerRecipe(12, new ItemStack[]{new SlimefunItemStack(ALUMINUM_COMPOSITE_SHEET, 8)}, new ItemStack[]{HEAVY_DUTY_SHEET});

    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "COMPOSITE_COMPRESSOR";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.PISTON);
    }
}