package program;

import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class MapExp2 {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 1000.0);
        Product p2 = new Product("Notebook", 2800.0);
        Product p3 = new Product("PC", 6000.0);

        stock.put(p1, 200.0);
        stock.put(p2, 300.0);
        stock.put(p3, 50.0);

        Product teste = new Product("PC", 6000.0);

        System.out.println(stock.containsKey(teste)); // deu true só porque tem o metodo equals e hashCode


    }
}
