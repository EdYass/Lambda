package application;

import entities.Product;
import util.ProductPredicate;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case",80.90));


        //list.removeIf(p -> p.getPrice() >= 100); Implementação de Interface
        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate); Referencia a method estático
        //list.removeIf(Product::nonStaticProductPredicate); Referncia a methos não estático

        /*double min = 100.0;
        Predicate<Product> pred = p->p.getPrice() >=min; Expressão lambda declarada
        list.removeIf(pred);*/

        double min = 100.0;
        list.removeIf(p->p.getPrice() >=min); //Expressão lambda inline
        for(Product p : list){
            System.out.println(p);
        }

    }
}