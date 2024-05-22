import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Insira quantas posições deseja para o array:");
        try {
            int numPosicoes = sc.nextInt();

            for (int i = 0; i < numPosicoes; i++) {
                System.out.println("posição " + (i + 1));
                lista.add(sc.next());
            }

            System.out.println("Acessar uma posição do array:");
            System.out.println(lista.get(4));
        } catch (InputMismatchException e) {
            System.out.println("Erro ao inserir o tamanho do array");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro ao acessar posição do array");
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}