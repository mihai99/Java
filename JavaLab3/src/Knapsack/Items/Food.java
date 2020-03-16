package Knapsack.Items;

public class Food implements Item {

    private String name;
    private float weight;

    public Food(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getValue() {
        return this.weight*2;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public float getProfitFactor() {
        return getValue()/getWeight();
    }

    @Override
    public String toString() {
        return getName() + ", weight = " +  getWeight() + ", value = " + getValue() ;
    }
}
