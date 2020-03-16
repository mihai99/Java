import Algorithms.DynamicProgrammingAlgorithm;
import Knapsack.Items.*;
import Knapsack.Knapsack;
import Algorithms.GreedyAlgorithm;
import KnapsackProblemGenerator.KnapsackGenerator;

public class Problem {
    public static void main(String[] args)
    {
        Item book1 = new Book("Dragon Rising", 300, 5);
        Item book2 = new Book("A Blade in the Dark", 300, 5);
        Item food1 = new Food("Cabbage", 2);
        Item food2 = new Food("Rabbit", 2);
        Item weapon = new Weapon(WeaponsType.SWORD, 5, 10);
        Knapsack.Builder knapsackBuilder = new Knapsack.Builder()
                .setWeight(10)
                .addItem(book1)
                .addItem(book2)
                .addItem(food1)
                .addItem(food2)
                .addItem(weapon);
        knapsackBuilder.showInstance();
        System.out.println();
        Knapsack knapsack = knapsackBuilder.Build(new DynamicProgrammingAlgorithm());
        knapsack.showItemsInKnapsack();

        System.out.println();
        System.out.println("Generated problem: ");
        Knapsack.Builder kn2 = KnapsackGenerator.generateKnapsackBuilder();
        kn2.showInstance();
        System.out.println();
        System.out.println("with greedy: ");
        kn2.Build(new GreedyAlgorithm()).showItemsInKnapsack();
        System.out.println();
        System.out.println("with dynamic programming: ");
        kn2.Build(new DynamicProgrammingAlgorithm()).showItemsInKnapsack();


    }
}
