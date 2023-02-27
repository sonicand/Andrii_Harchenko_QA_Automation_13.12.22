package lesson17.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {

    private List<Product> productsList;

    public ProductMarket(List<Product> productsList) {
        this.productsList = productsList;
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (Product p : productsList) {
            names.add(p.getProductName());
        }
        return names;

    }

    public List<String> getNamesSorted() {
        List<String> names = new ArrayList<>();
        for (Product p : productsList) {
            names.add(p.getProductName());
            Collections.sort(names);
        }
        return names;
    }

    public List<String> getLessThanTen() {
        List<String> names = new ArrayList<>();
        for (Product p : productsList) {
            if (p.getPrice() < 10) {
                names.add(p.getProductName());
            }
        }
        return names;
    }

    public List<String> getMoreThanFive() {
        List<String> names = new ArrayList<>();
        for (Product p : productsList) {
            if (p.getPrice() > 5) {
                names.add(p.getProductName());
            }
        }
        return names;
    }

    public List<String> getAllPriceInStr() {
        List<String> allPricesInStr = new ArrayList<>();
        for (Product prices : productsList) {
            allPricesInStr.add(String.valueOf(prices.getPrice()));
        }
        return allPricesInStr;
    }
}

