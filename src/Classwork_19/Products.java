package Classwork_19;

import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Products {
    public static void main(String[] args) {
        House house = new House(200);
        house.sell();

        System.out.println(house instanceof Transportable);

        Fridge fridge = new Fridge(100,200);
        fridge.sell();

        List<Product> productList = new ArrayList<>();
        productList.add(house);
        productList.add(fridge);

        List<Sellable> productsSell = new ArrayList<>();
        productsSell.add(house);
        productsSell.add(fridge);


        Comparator<Sellable> compPrice = Comparator.comparing(product -> product.getPrice());
        Collections.sort(productsSell, compPrice);
        for (Sellable product: productsSell)
            System.out.println(product.toString());
    }
}

abstract class Product{
    protected String name;
    public abstract void sell();
}

interface Sellable{
    int getPrice();
}

interface Transportable{
    double getWeight();
}

class Fridge extends Product implements Sellable,Transportable {

    private int price;
    private double weight;

    public Fridge(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public Fridge() {
    }

    @Override
    public void sell() {
        System.out.println("The fridge has been sold.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

class House extends Product implements Sellable{
    private int price;

    public House(int price) {
        this.price = price;
    }

    public House() {
    }

    @Override
    public void sell() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
