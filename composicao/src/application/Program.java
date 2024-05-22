package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enuns.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        String departament;
        String name;
        String level;
        double baseSalary;
        int qtdContrats;
        double valuePerHour;
        int duration;
        Date contractDate;

        Locale.setDefault(Locale.US);
        SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter departament's name:");
        departament = sc.next();
        System.out.println("Enter worker data");
        System.out.println("Name:");
        name = sc.next();
        System.out.println("level");
        level = sc.next();
        System.out.println("Base salary:");
        baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(departament));

        System.out.println("How many contracts to this workwer:");
        qtdContrats = sc.nextInt();

        for (int i = 0; i < qtdContrats; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data");
            System.out.println("Date (DD/MM/YYY)");
            contractDate = formatacaoData.parse(sc.next());
            System.out.println("Value per hour:");
            valuePerHour = sc.nextDouble();
            System.out.println("Duration:");
            duration = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY:");
        String monthAdYear = sc.next();
        int month = Integer.parseInt(monthAdYear.substring(0, 2));
        int year = Integer.parseInt(monthAdYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAdYear + ": " + String.format("%.2f", worker.income(year, month)));

    }
}