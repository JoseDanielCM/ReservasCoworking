package com.SpringBootTest.Entity;

import com.SpringBootTest.DTO.Estado;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    // user
    @ManyToOne
    @JoinColumn(name = "id_espacio")
    private Espacio espacio;


    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_horario")
    private Horario horario;
    // esppacio

    private Estado estado;

    public Reserva() {
    }

    public Reserva(Integer id, Espacio espacio, Usuario usuario, Horario horario, Estado estado) {
        this.id = id;
        this.espacio = espacio;
        this.usuario = usuario;
        this.horario = horario;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", espacio=" + espacio +
                ", usuario=" + usuario +
                ", horario=" + horario +
                ", estado=" + estado +
                '}';
    }
}
