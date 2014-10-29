package org.bukkit.inventory;

public class ItemMatcher {

    /**
     * Get the result for a given crafting matrix.
     * @param matrix a square matrix of items
     * @return Result of recipe
     */
    public ItemStack getResult(ItemStack[] matrix) {
        return null; // Don't match by default
    }

    /**
     * Clean the crafting matrix after crafting an item.
     *
     * <p>Primarily used in recipes where some of the parts of the recipe need to be preserved.</p>
     * @param matrix Crafting matrix to clean
     * @param result Result of the given matrix
     */
    public void cleanup(ItemStack[] matrix, ItemStack result) {
        // Do nothing by default
    }

}
