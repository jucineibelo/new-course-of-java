package model.entities;

import model.exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation() {

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)){
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public String updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
           throw new DomainException("Error in reservation: Check-out date must be after check-in date");  //Exeption criada
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); //convertendo para segundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //convertendo segundos para dias
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber
                + ", check-in: " + sdf.format(checkIn)
                + ", check-out: " + sdf.format(checkOut)
                + ", " + duration() + " nights";
    }

}
