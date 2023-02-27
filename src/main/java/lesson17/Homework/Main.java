package lesson17.Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Rice", 25);
        Product product2 = new Product("Spaghetti", 30);
        Product product3 = new Product("Milk", 15);
        Product product4 = new Product("Apple", 3);
        Product product5 = new Product("Orange", 40);

        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

        ProductMarket productUtils = new ProductMarket(list);


        List<String> names = productUtils.getNames();
        System.out.println("Product names: " + names);

        List<String> sortedNames = productUtils.getNamesSorted();
        System.out.println("Product names sorted: " + sortedNames);

        List<String> lessThanTen = productUtils.getLessThanTen();
        System.out.println("Product names with price less than 10: " + lessThanTen);

        List<String> moreThanFive = productUtils.getMoreThanFive();
        System.out.println("Product names with price greater than 5: " + moreThanFive);

        System.out.println();
        System.out.println("Product names to String");
        for (Product l : list) {
            System.out.println(l.getProductName().toString());
        }
    }
}
