package program;

public class test {
    public static void main(String[] args) {

        double alimentacao = 668.0;
        double valeRefeicao = 49 * 22;

        double calculo = retornaDesconto(alimentacao, valeRefeicao);
        double calculoSemDesconto = alimentacao + valeRefeicao;
        System.out.println("O valor total sem desconto é: " + calculoSemDesconto);
        System.out.println("O valor com descontos é: " + calculo);
        System.out.println("O que vai descontar em folha é: " + String.format("%.2f", calculoSemDesconto - calculo));
    }


    public static double retornaDesconto(double alimentacao, double valeRefeicao) {
        return (alimentacao - alimentacao * 0.05) + (valeRefeicao - valeRefeicao * 0.10);
    }

}
