package util;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class FuncaoProduto {

    public Double filterListSum(List<Product> list) {
        double sum = 0;

        for (Product p : list) {
            if (p.getName().charAt(0) == 'A') {
                sum += p.getPrice();
            }
        }
        return sum;
    }

    public Double filterListSumPricate(List<Product> list, Predicate<Product> predicate) {
        double sum = 0;

        for (Product p : list) {
            if (predicate.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }


}
