package grocery;

public class Product {
    private String name;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int calories;

    public Product(String name, double proteins, double fats, double carbohydrates, int calories) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Product(String name, double proteins, double fats, double carbohydrates) {
        this(name, proteins, fats, carbohydrates, 0);
    }

    public Product(String name, double proteins, double fats) {
        this(name, proteins, fats, 0);
    }

    public Product(String name, double proteins) {
        this(name, proteins, 0);
    }

    public String getName() {
        return name;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
