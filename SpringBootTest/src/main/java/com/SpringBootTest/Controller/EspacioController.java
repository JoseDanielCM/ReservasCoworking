package com.SpringBootTest.Controller;

import com.SpringBootTest.Entity.Espacio;
import com.SpringBootTest.Service.EspacioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/espacio")
public class EspacioController {

    @Autowired
    EspacioService espacioService;

// CREATE
    @PostMapping("/crear")
    public ResponseEntity<Espacio> crearEspacio(@RequestBody Espacio espacio){
        System.out.println(espacio);
        return ResponseEntity.ok(espacioService.CrearEspacio(espacio));
    }

// READ
    @GetMapping("/getAll")
    public ResponseEntity<List<Espacio>> obtenerTodosEspacios (){
        return ResponseEntity.ok(espacioService.obtenerTodosLosEspacios());
    }

    @GetMapping("/getByTipo")
    public ResponseEntity<List<Espacio>> obtenerEspacioTipo (@RequestParam String tipo){
        return ResponseEntity.ok(espacioService.obtenerEspacioTipo(tipo));
    }

    @GetMapping("/getEspaciosDisponibles")
    public ResponseEntity<List<Espacio>> obtenerEspacioDisponible (){
        return ResponseEntity.ok(espacioService.obtenerEspacioDisponible());
    }

// UPDATE
    @PatchMapping("/actualizar/{id}")
    public ResponseEntity<Espacio> actualizarEspacio(@PathVariable Integer id, @RequestBody Espacio espacio){
        System.out.println(espacio);
        return ResponseEntity.ok(espacioService.actualizarEspacio(id, espacio));
    }

// DELETE
    @DeleteMapping("/delete/{id}")
    public void deleteEspacio(@PathVariable Integer id){
        espacioService.eliminarEspacio(id);
    }

}
