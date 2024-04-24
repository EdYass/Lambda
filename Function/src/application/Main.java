package application;

import entities.Product;
import util.UperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case",80.90));

        /*Implementação de Interface
        List<String> names = list.stream().map(new UperCaseName()).collect(Collectors.toList());*/

        /*Reference static method
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());/*

        /*Reference nonstatic method
        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());/*  */

        /*Expressão lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());*/

        //Expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);



    }
}