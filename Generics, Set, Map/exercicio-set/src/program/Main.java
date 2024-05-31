package program;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fille full path");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }


    }
}