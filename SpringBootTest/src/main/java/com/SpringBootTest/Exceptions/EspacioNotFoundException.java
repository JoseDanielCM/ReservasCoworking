package com.SpringBootTest.Exceptions;

public class EspacioNotFoundException extends RuntimeException{
    public EspacioNotFoundException(String message){
        super(message);
    }
}
