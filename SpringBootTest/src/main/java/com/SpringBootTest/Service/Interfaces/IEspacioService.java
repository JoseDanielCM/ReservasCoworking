package com.SpringBootTest.Service.Interfaces;

import com.SpringBootTest.Entity.Espacio;
import java.util.List;

public interface IEspacioService {
    public Espacio CrearEspacio(Espacio espacio);
    public Espacio actualizarEspacio(Integer id, Espacio nuevoEspacio);
    public void eliminarEspacio(Integer id);
    public List<Espacio> obtenerTodosLosEspacios();
    public List<Espacio> obtenerEspacioTipo(String tipo);
    public List<Espacio> obtenerEspacioDisponible();
}
