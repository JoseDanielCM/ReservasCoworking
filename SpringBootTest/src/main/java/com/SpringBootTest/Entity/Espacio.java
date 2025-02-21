package com.SpringBootTest.Entity;

import com.SpringBootTest.DTO.Tipo;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "espacios")
public class Espacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private Integer capacidad;
    private Boolean disponible;

    @OneToMany(mappedBy = "espacio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservas;
    public Espacio() {
    }

    public Espacio(Integer id, String nombre, Tipo tipo, Integer capacidad, Boolean es_disponible) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.disponible = es_disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getEs_disponible() {
        return disponible;
    }

    public void setEs_disponible(Boolean es_disponible) {
        this.disponible = es_disponible;
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", capacidad=" + capacidad +
                ", es_disponible=" + disponible +
                '}';
    }
}
