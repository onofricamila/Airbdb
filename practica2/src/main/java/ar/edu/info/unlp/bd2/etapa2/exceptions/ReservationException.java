package ar.edu.info.unlp.bd2.etapa2.exceptions;

public class ReservationException extends Exception {
    public ReservationException() {
        super("There is an existing reservation for that apartment which overlaps with the the one you want to create !!!");
    }
}
