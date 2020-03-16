package Algorithms;

import Knapsack.Items.Item;
import Knapsack.Knapsack;
import java.util.List;

public abstract class Algorithm {
    protected int weight;
    protected List<Item> selectedItems;

    public abstract Algorithm solve(Knapsack.Builder builder);
    public int getWeight() {
        return this.weight;
    }
    public List<Item> getItems() {
        return this.selectedItems;
    }
}
