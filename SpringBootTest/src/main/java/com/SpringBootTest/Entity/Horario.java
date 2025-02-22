package com.SpringBootTest.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "horarios")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;

    private LocalTime hora_inicio;
    private LocalTime hora_final;

    @OneToMany(mappedBy = "horario")
    @JsonBackReference
    private List<Reserva> reservas;

    public Horario() {
    }

    public Horario(Integer id, LocalDate fecha, LocalTime hora_inicio, LocalTime hora_final) {
        this.id = id;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalTime getHora_final() {
        return hora_final;
    }

    public void setHora_final(LocalTime hora_final) {
        this.hora_final = hora_final;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }


    @Override
    public String toString() {
        return "Horario{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora_inicio=" + hora_inicio +
                ", hora_final=" + hora_final +
                ", reservas=" + reservas +
                '}';
    }
}
