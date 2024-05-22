package application;

import model.entities.Reservation;
import model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in data (dd/mm/yyyy): ");
            Date checkin = sdf.parse((sc.next()));
            System.out.println("Check-out data (dd/mm/yyyy): ");
            Date checkout = sdf.parse((sc.next()));
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation");
            System.out.println("Check-in data (dd/mm/yyyy): ");
            checkin = sdf.parse((sc.next()));
            System.out.println("Check-out data (dd/mm/yyyy): ");
            checkout = sdf.parse((sc.next()));
            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalida format date!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (DomainException e) {
            System.out.println("Exeção tratada!" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error" + e.getMessage());
        } finally {
            sc.close();
        }

    }


}


