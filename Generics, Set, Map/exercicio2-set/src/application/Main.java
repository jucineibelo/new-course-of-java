package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A?");
        int numCursosA = sc.nextInt();

        for (int i = 0; i < numCursosA; i++) {
            System.out.println("Informe o " + (i + 1) + " número.");
            int valorDeA = sc.nextInt();
            a.add(valorDeA);
        }

        System.out.println("How many students for course B?");
        int numCursosB = sc.nextInt();

        for (int i = 0; i < numCursosB; i++) {
            System.out.println("Informe o " + (i + 1) + " número.");
            int valorDeB = sc.nextInt();
            b.add(valorDeB);
        }

        System.out.println("How many students for course C?");
        int numCursosC = sc.nextInt();

        for (int i = 0; i < numCursosC; i++) {
            System.out.println("Informe o " + (i + 1) + " número.");
            int valorDeC = sc.nextInt();
            c.add(valorDeC);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println("Total students: " + total.size());


    }
}