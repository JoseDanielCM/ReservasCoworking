package com.SpringBootTest.Exceptions;

public class NoReservasActivasDeUsuario extends RuntimeException{
    public NoReservasActivasDeUsuario(String message){
        super(message);
    }
}
