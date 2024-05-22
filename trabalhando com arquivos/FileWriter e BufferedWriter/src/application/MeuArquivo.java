package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeuArquivo {
    public static void main(String[] args) {

        String path = "C:\\temp\\meuarquivo.txt";
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamanho do array");
        int tamanhoArray = sc.nextInt();

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("posição " + (i + 1));
            list.add(sc.next());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String teste : list) {
                bw.write(teste);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
