import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " é o maior");
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " é o maior");
            } else {
                System.out.println(num3 + " é maior");
            }
        }

        String funcaoTernaria = (num1 > num2) ? "10 é maior de 20" : "10 não é maior que 20";
        System.out.println(funcaoTernaria);

        /*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        dá direito a 100 minutos de telefone. Cada minuto que exceder a
        franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
        a ser pago.*/

        double plano = 100;
        double precoPlano = 50;
        double minutosExeder = 102;
        double armazenaDiferenca;

        if (minutosExeder <= plano) {
            System.out.println("Sua mensalidade está dentro do plano: " + plano);
        } else {
            armazenaDiferenca = precoPlano + ((minutosExeder - plano) * 2);
            System.out.println("Você irá pagar: " + armazenaDiferenca);

        }


    }
}
