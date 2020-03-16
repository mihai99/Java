package Knapsack;

import Algorithms.Algorithm;
import Knapsack.Items.Item;

import java.util.*;

public class Knapsack {
    private int weight;
    private List<Item> items;

    private Knapsack(Algorithm algorithm) {
        this.weight = algorithm.getWeight();
        this.items = algorithm.getItems();
    }

    public void showItemsInKnapsack()
    {
        System.out.println("selected items:");
        float value = 0;
        for(Item item: items)
        {
            System.out.println(item.toString());
            value += item.getValue();
        }
        System.out.println("total weight = " + weight + ", total value = " + value);

    }

    public static class Builder {

        private int weight;
        private List<Item> items;

        public Builder() {
            weight = 0;
            items = new ArrayList<Item>();
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder addItem(Item item)
        {
            this.items.add(item);
            return this;
        }

        public List<Item> getItems() {
            return items;
        }

        public int getWeight() {
            return weight;
        }

        public void showInstance()
        {
            System.out.println("capacity of the knapsack = " + this.weight);
            System.out.println("available items:");
            Collections.sort(this.items, Comparator.comparing(Item::getName));
            for(Item item : this.items)
            {
                System.out.println(item.toString() + " (profit factor = " + item.getProfitFactor() + ")");
            }
        }

        public Knapsack Build(Algorithm algorithmToExecute)
        {
            if(this.weight == 0)
            {
                throw new IllegalArgumentException("You have not set the maximum weight");
            }
            else
            {
                return new Knapsack(algorithmToExecute.solve(this));
            }
        }
    }
}
