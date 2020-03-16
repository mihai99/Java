package KnapsackProblemGenerator;
import Knapsack.Knapsack;
import Knapsack.Items.Item;
import Knapsack.Items.TestItem;

import java.util.Random;

public class KnapsackGenerator {
    public static Knapsack.Builder generateKnapsackBuilder()
    {
        Random rand = new Random();
        int numberOfObjects = rand.nextInt(100);
        int weight = rand.nextInt(500);
        Knapsack.Builder knapsackBuilder = new Knapsack.Builder().setWeight(weight);
        for(int i = 0; i <= numberOfObjects; i++) {
            Item item = new TestItem("item " +i, rand.nextInt(50), rand.nextInt(50));
            knapsackBuilder.addItem(item);
        }
        return knapsackBuilder;
    }
}
