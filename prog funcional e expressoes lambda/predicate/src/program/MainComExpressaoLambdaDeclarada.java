package program;

import java.util.function.Predicate;

public class MainComExpressaoLambdaDeclarada {
    public static void main(String[] args) {

        Predicate<String> predicate = (String name) -> {
            return name.startsWith("JJ");
        };

        System.out.println(predicate.test("JJ"));
        System.out.println(predicate.test("J"));
    }
}
