package program;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\temp\\stream.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String file = br.readLine();
            List<Product> list = new ArrayList<>();

            while (file != null) {
                String[] vetor = file.split(",");
                list.add(new Product(vetor[0], Double.parseDouble(vetor[1])));
                file = br.readLine();
            }

            //trazendo a media dos preços de produtos
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Avarege price: " + String.format("%.2f", avg));


            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());
            names.forEach(System.out::println);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}