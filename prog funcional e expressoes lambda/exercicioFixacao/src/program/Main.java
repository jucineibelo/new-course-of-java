package program;

import entities.Funcionario;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "C:\\temp\\desafio.csv";

        System.out.println("Entre com o salario:");
        Double salario = sc.nextDouble();

        System.out.println("Email of people whose salary is more than " + String.format("%.2f", salario));

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            List<Funcionario> list = new ArrayList<>();

            while (line != null) {
                String vet[] = line.split(",");
                list.add(new Funcionario(vet[0], vet[1], Double.parseDouble(vet[2])));
                line = br.readLine();
            }

            list.stream()
                    .filter(f -> f.getSalario() > salario)
                    .map(f -> f.getEmail())
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .forEach(System.out::println);

            double sum = list.stream()
                    .filter(f -> f.getName().toUpperCase().startsWith("M"))
                    .map(f -> f.getSalario())
                    .reduce(0.0, Double::sum);

            System.out.println("A soma dos salários dos funcionários cujo nome começa com 'M' é : " + String.format("%.2f", sum));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}