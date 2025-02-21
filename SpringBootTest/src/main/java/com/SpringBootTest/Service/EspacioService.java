package com.SpringBootTest.Service;

import com.SpringBootTest.DTO.Tipo;
import com.SpringBootTest.Entity.Espacio;
import com.SpringBootTest.Exceptions.EspacioNotFoundException;
import com.SpringBootTest.Repository.EspacioRepository;
import com.SpringBootTest.Service.Interfaces.IEspacioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioService implements IEspacioService {
    @Autowired
    EspacioRepository espacioRepository;

    @Override
    public Espacio CrearEspacio(Espacio espacio){
        return espacioRepository.save(espacio);
    };
    @Override
    public Espacio actualizarEspacio(Integer id, Espacio nuevoEspacio){
        Espacio espacioExistente = espacioRepository.findById(id).orElseThrow(() -> new EspacioNotFoundException("Espacio no encontrado con id: " + id));

        if (nuevoEspacio == null) {
            throw new IllegalArgumentException("La info proporcionada no puede ser nula");
        }

        if (nuevoEspacio.getCapacidad() != null) {
            espacioExistente.setCapacidad(nuevoEspacio.getCapacidad());
        }

        if (nuevoEspacio.getNombre() != null) {
            espacioExistente.setNombre(nuevoEspacio.getNombre());
        }

        return espacioRepository.save(espacioExistente);
    };


    @Override
    public void eliminarEspacio(Integer id){
        Espacio espacioEliminar = espacioRepository.findById(id).orElseThrow(() -> new EspacioNotFoundException("Espacio no encontrado con id: " + id));
        espacioRepository.delete(espacioEliminar);
    };
    @Override
    public List<Espacio> obtenerTodosLosEspacios(){
        return espacioRepository.findAll();
    };

    @Override
    public List<Espacio> obtenerEspacioTipo(String tipo){
        Tipo tipoEnum = Tipo.valueOf(tipo);
        return espacioRepository.findByTipo(tipoEnum);
    };
    public List<Espacio> obtenerEspacioDisponible(){
        return  espacioRepository.findAllByDisponibleIsTrue();
    };

}
