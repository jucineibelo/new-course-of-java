import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "C:\\temp\\";
        System.out.println("Insira o nome do arquivo:");

        try {
            String nomeArquivo = sc.next();
            path += nomeArquivo + ".txt";

            System.out.println("Quantos registros deseja fazer:");
            int registros = sc.nextInt();

            for (int i = 0; i < registros; i++) {
                System.out.println("Insira o " + (i + 1) + " registro");
                String registro = sc.next();
                list.add(registro);
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                for (String listas : list) {
                    bw.write(listas);
                    bw.newLine();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}