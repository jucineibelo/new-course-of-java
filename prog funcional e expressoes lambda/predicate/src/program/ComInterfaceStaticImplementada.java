package program;

import entities.ExemploPredicate;

import java.util.function.Predicate;

public class ComInterfaceStaticImplementada {
    public static void main(String[] args) {

        Predicate<Integer> predicate = ExemploPredicate ::isPar;
        System.out.println(predicate.test(8));
    }
}