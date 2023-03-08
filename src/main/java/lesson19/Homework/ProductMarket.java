package lesson19.Homework;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {

    private List<Product> productsList;

    public ProductMarket(List<Product> productsList) {
        this.productsList = productsList;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public List<String> getNames() {
        return productsList.stream()
                .map(Product::getProductName)
                .collect(Collectors.toList());
    }

    public List<String> getNamesSorted() {
        return productsList.stream()
                .map(Product::getProductName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getLessThanTen() {
        return productsList.stream()
                .filter(p -> p.getPrice() < 10)
                .map(Product::getProductName)
                .collect(Collectors.toList());
    }

    public List<String> getMoreThanFive() {
        return productsList.stream()
                .filter(p -> p.getPrice() > 5)
                .map(Product::getProductName)
                .collect(Collectors.toList());
    }

    public List<String> getAllPriceInStr() {
        return productsList.stream()
                .map(p -> String.valueOf(p.getPrice()))
                .collect(Collectors.toList());
    }

}

