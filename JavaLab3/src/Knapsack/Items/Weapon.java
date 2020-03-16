package Knapsack.Items;

public class Weapon implements Item {
    private WeaponsType name;
    private float value;
    private float weight;

    public Weapon(WeaponsType name, float weight, float value ) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name.name();
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
