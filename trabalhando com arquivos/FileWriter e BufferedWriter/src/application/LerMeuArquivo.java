package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerMeuArquivo {
    public static void main(String[] args) {
        String path = "C:\\temp\\meuarquivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
