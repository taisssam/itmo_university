package ru.itmo.lab4.exceptions;

//lab4 unchecked_exception
public class NameException extends RuntimeException{
    public NameException(String message){
        super(message);
    }
}
