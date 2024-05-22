import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int vidaInicial;
        int ataque;
        int armadura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.println("nome:");
        nome = scanner.next();
        System.out.println("vida inicial");
        vidaInicial = scanner.nextInt();
        System.out.println("ataque:");
        ataque = scanner.nextInt();
        System.out.println("armadura:");
        armadura = scanner.nextInt();
        Champion c1 = new Champion(nome, vidaInicial, ataque, armadura);
        System.out.println(c1.status());

        System.out.println("Digite os dados do segundo campeão:");
        System.out.println("nome:");
        nome = scanner.next();
        System.out.println("vida inicial");
        vidaInicial = scanner.nextInt();
        System.out.println("ataque:");
        ataque = scanner.nextInt();
        System.out.println("armadura:");
        armadura = scanner.nextInt();
        Champion c2 = new Champion(nome, vidaInicial, ataque, armadura);
        System.out.println(c2.status());

        System.out.println("Quantos turnos você deseja escutar?");
        int numerosAtaque = scanner.nextInt();
        int inicio = 1;

        while (inicio < numerosAtaque) {
            System.out.println("");
            System.out.println(inicio + "rodada");

            c1.takeDamage(c2);
            c2.takeDamage(c1);
            System.out.println(c1.status());
            System.out.println("");
            System.out.println(c2.status());

            if (c1.getLife() <= 0) {
                System.out.println("C1 morreu");
                break;
            }
            if (c2.getLife() <= 0) {
                System.out.println("C2 morreu");
                break;
            }

            inicio++;
        }
        System.out.println("");
        System.out.println(c1.status());
        System.out.println("");
        System.out.println(c2.status());
        System.out.println("FIM DE JOGO");

    }
}