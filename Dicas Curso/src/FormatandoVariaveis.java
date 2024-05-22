import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FormatandoVariaveis {
    public static void main(String[] args) {

        // para utilizar formatação de casas decimais em java, utiliza-se Format => exemplo abaixo
        // %.2f% => isso são duas casas decimais

        double exemplo = 5.87956;

        System.out.println(exemplo); //sem formatação

        System.out.printf("%.2f%n", exemplo); //com formatação, porém o número da saída está com virgula pq o Locale  padrão da minha maquina é Brasil

        Locale.setDefault(Locale.US); // formatando locale (localização) da maquina para Estados Unidos
        System.out.printf("%.2f%n", exemplo);

        //CONCATENANDO VARIOS ELEMENTOS EM UM MESMO COMANDO DE ESCRITA.
        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha

        String nome = "Jucinei";
        int idade = 34;
        double salario = 5.056554;
        double salarioAlmejado = 40.500;
        System.out.printf("%s, tem idade %d, atualmente tem um salário R$: %.3f %n mas %s gostaria de receber um salário de %.3f",nome, idade, salario, nome, salarioAlmejado);




        }
    }
