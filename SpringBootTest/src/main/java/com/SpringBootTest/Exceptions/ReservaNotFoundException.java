package com.SpringBootTest.Exceptions;

public class ReservaNotFoundException extends RuntimeException{
    public ReservaNotFoundException(String message){
        super(message);
    }
}
