package org.bukkit.inventory;

/**
 * Represents a dynamic recipe.
 * These are recipes that have can have different results, depending on the inputs used, rather than a simple matching algorithm. <p>
 * Used for recipes such as Banners, which require item metadata to be copied to an item, along with having a semi-shaped recipe.
 */
public interface DynamicRecipe extends Recipe {

    /**
     * Checks to see if the recipe will match a crafting matrix. This method also prepares {@link #getResult()}
     * to return the correct item (including all metadata) for the input.
     * @param matrix Items on the crafting grid
     * @return Whether the recipe matches the inputs
     */
    boolean match(ItemStack[] matrix);

    /**
     * Gets the result of this recipe, given the input of {@link #match(ItemStack[])}.
     * @return
     */
    @Override
    ItemStack getResult();
}
