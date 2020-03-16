package Algorithms;

import Knapsack.Items.Item;
import Knapsack.Knapsack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GreedyAlgorithm extends Algorithm {

    public Algorithm solve(Knapsack.Builder builder) {

        List<Item> items = builder.getItems();
        weight = builder.getWeight();
        Collections.sort(items, Comparator.comparing(Item::getProfitFactor));
        selectedItems = new ArrayList<>();

        for(int i = items.size()-1; i >=0 ; i--)
        {
            Item currentItem = items.get(i);
            if(currentItem.getWeight() <= weight){
                selectedItems.add(currentItem);
                weight = weight - (int)currentItem.getWeight();
                if(weight <= 0)
                    return this;
            }
        }
        return this;
    }
}