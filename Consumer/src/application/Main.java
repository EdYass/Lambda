package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case",80.90));

        //list.forEach(new PriceUpdate()); Implementação da Interface
        //list.forEach(Product::staticPriceUpdate); Reference static method
        //list.forEach(Product::nonStaticPriceUpdate); Reference nonstatic method

        /* Expressão lambda declarada
        double factor = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice()*factor);
        list.forEach(cons);*/

        //Expressão lambda inline
        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice()*factor));

        list.forEach(System.out::println);
    }
}