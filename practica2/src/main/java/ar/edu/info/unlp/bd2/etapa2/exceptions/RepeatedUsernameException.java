package ar.edu.info.unlp.bd2.etapa2.exceptions;

public class RepeatedUsernameException extends Exception{
    public RepeatedUsernameException() { super("There is an existing user with that username !!!"); }
}
