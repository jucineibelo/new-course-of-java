public class Casting { //casting é uma conversão explicita de dados
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        double resultando;

        resultando = num1 / num2;  //sem cast
        System.out.println(resultando);

        resultando = (double) num1 / num2; //com cast
        System.out.println(resultando);


    }
}
