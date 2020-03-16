package Knapsack.Items;

public class Book implements Item {

    private String name;
    private int numberOfPages;
    private float value;

    public Book(String name, int numberOfPages, float value) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getValue() {
        return value;
    }

    @Override
    public float getWeight() {
        return numberOfPages/100;
    }

    @Override
    public float getProfitFactor() {
        return getValue()/getWeight();
    }

    @Override
    public String toString() {
        return getName() + ", weight = " +  getWeight() + ", value = " + getValue();
    }
}
