package Algorithms;

import Knapsack.Items.Item;
import Knapsack.Knapsack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.max;

public class DynamicProgrammingAlgorithm extends Algorithm {

    public Algorithm solve(Knapsack.Builder builder) {

        List<Item> items = builder.getItems();
        weight = builder.getWeight();
        selectedItems = new ArrayList<>();
        int maxValueTable[][] = new int[items.size()+1][weight+1];

        for (int i = 0; i <= items.size(); i++)
        {
            for (int w = 0; w <= weight; w++)
            {
                if (i==0 || w==0) {
                    maxValueTable[i][w] = 0;
                } else if (items.get(i-1).getWeight() <= w) {
                    maxValueTable[i][w] = max((int) (items.get(i-1).getValue() + maxValueTable[i-1][w-(int)items.get(i-1).getWeight()]),  maxValueTable[i-1][w]);
                } else {
                    maxValueTable[i][w] = maxValueTable[i-1][w];
                }
            }
        }
        int res = maxValueTable[items.size()][weight];
        for (int i = items.size(); i > 0 && res > 0; i--) {
            if (res != maxValueTable[i - 1][weight]) {
                selectedItems.add(items.get(i-1));
                res = (int) (res - items.get(i - 1).getValue());
                weight = (int) (weight - items.get(i - 1).getWeight());
            }
        }
        return this;
    }
}
