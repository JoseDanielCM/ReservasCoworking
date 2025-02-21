package com.SpringBootTest.HandleExceptions;

import com.SpringBootTest.Exceptions.NoReservasActivasDeUsuario;
import com.SpringBootTest.Exceptions.ReservaNotFoundException;
import com.SpringBootTest.Exceptions.EspacioNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ReservaNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleReservaNotFoundException(ReservaNotFoundException e){
        Map<String, Object> error = new HashMap<>();
        error.put("error",e.getMessage());
        error.put("status", HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EspacioNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleEspacioNotFoundException(EspacioNotFoundException e){
        Map<String, Object> error = new HashMap<>();
        error.put("error",e.getMessage());
        error.put("status", HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoReservasActivasDeUsuario.class)
    public ResponseEntity<Map<String, Object>> handleNoreservasActivasUsuario(NoReservasActivasDeUsuario e){
        Map<String, Object> error = new HashMap<>();
        error.put("error",e.getMessage());
        error.put("status", HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneralErrors(Exception e){
        Map<String, Object> error = new HashMap<>();
        error.put("error","Error interno del servidor");
        error.put("detalle", e.getMessage());
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
