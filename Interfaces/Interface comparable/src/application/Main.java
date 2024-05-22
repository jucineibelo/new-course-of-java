package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String emplyeeCsv = br.readLine();

            while (emplyeeCsv != null) {
                String[] fields = emplyeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                emplyeeCsv = br.readLine();
            }
            Collections.sort(list);

            for (Employee employee : list) {
                System.out.println(employee.getName() + ", " + employee.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}