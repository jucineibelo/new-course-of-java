package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in data (dd/mm/yyyy): ");
        Date checkin = sdf.parse((sc.next()));
        System.out.println("Check-out data (dd/mm/yyyy): ");
        Date checkout = sdf.parse((sc.next()));

        if (!checkout.after(checkin)) {
            System.out.println("Error in reservation: Checkout data must be after checkin date");
        } else {
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation");
            System.out.println("Check-in data (dd/mm/yyyy): ");
            checkin = sdf.parse((sc.next()));
            System.out.println("Check-out data (dd/mm/yyyy): ");
            checkout = sdf.parse((sc.next()));

            Date now = new Date();
            if (checkin.before(now) || checkout.before(now)) {
                System.out.println("Error in reservation: Reservation date for update must be future dates");
            } else if (!checkout.after(checkin)) {
                System.out.println("Error in reservation: Checkout data must be after checkin date");
            } else {
                reservation.updateDates(checkin, checkout);
                System.out.println("Reservation " + reservation);
            }


        }


    }
}