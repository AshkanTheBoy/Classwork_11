package S1mple;

public class Apple {

    private double weight;
    private Variety variety;

    public Apple(double weight, Variety variety) {
        this.weight = weight;
        this.variety = variety;
    }

    public double getWeight() {
        return weight;
    }

    public Variety getVariety() {
        return variety;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", variety=" + variety +
                '}';
    }
}
