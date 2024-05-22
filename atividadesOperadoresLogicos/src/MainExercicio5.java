import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExercicio5 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa;

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            System.out.println("Pessoa " + i + " Informe o nome:");
            String nome = scanner.next();

            System.out.println("Informe o sexo 'F' para feminino e 'M' para masculino");
            char sexo = scanner.next().charAt(0);

            pessoa = new Pessoa(nome, sexo);
            pessoas.add(pessoa);
        }

        int armazenaF = 0;
        int armazenaM = 0;
        for (Pessoa result : pessoas) {
            if (result.getSexo() == 'F') {
                armazenaF ++;
            }
            if (result.getSexo() == 'M') {
                armazenaM ++;
            }
        }

        System.out.println("Relatório");
        System.out.println("Numero de pessoas do sexo masculino: " + armazenaM);
        System.out.println("Numero de pessoas do sexo feminino: " + armazenaF);


    }

}
