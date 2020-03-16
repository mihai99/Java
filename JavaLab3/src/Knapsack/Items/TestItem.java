package Knapsack.Items;

public class TestItem implements Item {
    private String name;
    private float weight;
    private float value;

    public TestItem(String name, float weight, float value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getValue() {
        return this.value;
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
