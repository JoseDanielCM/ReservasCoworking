package com.SpringBootTest.DTO;

import com.SpringBootTest.Entity.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDTO {
    private Integer id;
    private String estado;
    private String nombreEspacio;
    private LocalDate fecha;

    private LocalTime horaInicio;
    private LocalTime horaFin;

    public ReservaDTO(Reserva reserva) {
        this.id = reserva.getId();
        this.estado = reserva.getEstado().toString();
        this.nombreEspacio = reserva.getEspacio().getNombre();
        this.fecha = reserva.getHorario().getFecha();
        this.horaFin = reserva.getHorario().getHora_final();
        this.horaInicio = reserva.getHorario().getHora_inicio();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
