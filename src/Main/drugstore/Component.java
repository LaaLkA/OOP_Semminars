package Main.drugstore;

public abstract class Component {
    private String title;
    private double weight;
    private int power;

    public Component(String name, double weight, int power) {
        this.title = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s; power = %s", title, power);
    }
}

