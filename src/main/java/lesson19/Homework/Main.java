package lesson19.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Rice", 25));
        list.add(new Product("Spaghetti", 30));
        list.add(new Product("Milk", 15));
        list.add(new Product("Apple", 3));
        list.add(new Product("Orange", 40));

        ProductMarket market = new ProductMarket(list);

        List<String> names = market.getNames();
        System.out.println("Product names:");
        System.out.println(names);

        List<String> sortedNames = market.getNamesSorted();
        System.out.println("Product names sorted:");
        System.out.println(sortedNames);

        List<String> lessThanTen = market.getLessThanTen();
        System.out.println("Product names with price less than 10:");
        System.out.println(lessThanTen);

        List<String> moreThanFive = market.getMoreThanFive();
        System.out.println("Product names with price greater than 5:");
        System.out.println(moreThanFive);

        List<String> prices = market.getAllPriceInStr();
        System.out.println("Product prices in string:");
        System.out.println(prices);
    }
}
