package program;

import java.util.function.Predicate;

public class MainComExpressaoLambdaInline {
    public static void main(String[] args) {
        Predicate<String> predicate = name -> name.startsWith("Jucinei");

        System.out.println(predicate.test("Jucinei"));

    }
}
