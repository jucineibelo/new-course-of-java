package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration() {
        long diff = checkout.getTime() - checkin.getTime();  //recendo as datas como milesegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  //convertendo os milesegundos para dias
    }

    public void updateDates(Date checkin, Date checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + ", checkin: "
                + sdf.format(checkin ) + ", checkout: "
                + sdf.format(checkout) + ", " + duration() + "nights";
    }

}
