package com.SpringBootTest.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "horarios")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;

    private LocalDateTime hora_inicio;
    private LocalDateTime hora_final;

    @OneToMany(mappedBy = "horario")
    private List<Reserva> reservas;

    public Horario() {
    }

    public Horario(Integer id, LocalDate fecha, LocalDateTime hora_inicio, LocalDateTime hora_final) {
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

    public LocalDateTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalDateTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalDateTime getHora_final() {
        return hora_final;
    }

    public void setHora_final(LocalDateTime hora_final) {
        this.hora_final = hora_final;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora_inicio=" + hora_inicio +
                ", hora_final=" + hora_final +
                '}';
    }
}
