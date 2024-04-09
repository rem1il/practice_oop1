package grocery;

import java.util.ArrayList;
import java.util.List;

public class MyProducts {
    private double maxProteins;
    private double maxFats;
    private double maxCarbohydrates;
    private int maxCalories;
    private List<Product> productList;

    public MyProducts(double maxProteins, double maxFats, double maxCarbohydrates, int maxCalories) {
        this.maxProteins = maxProteins;
        this.maxFats = maxFats;
        this.maxCarbohydrates = maxCarbohydrates;
        this.maxCalories = maxCalories;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product.getProteins() <= maxProteins &&
                product.getFats() <= maxFats &&
                product.getCarbohydrates() <= maxCarbohydrates &&
                product.getCalories() <= maxCalories) {
            productList.add(product);
        } else {
            System.out.println("Продукт " + product.getName() + " не может быть добавлен в список. " +
                    "Превышено одно или несколько ограничений.");
        }
    }

    public void printProducts() {
        System.out.println("Список продуктов:");
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }
}
