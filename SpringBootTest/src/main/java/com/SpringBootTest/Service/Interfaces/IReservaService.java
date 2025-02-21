package com.SpringBootTest.Service.Interfaces;

import com.SpringBootTest.Entity.Reserva;

import java.util.List;

public interface IReservaService {
    public Reserva CrearReserva(Reserva reserva);
    public Reserva actualizarReserva(Integer id, Reserva nuevaReserva);
    public void eliminarReserva(Integer id);
    public List<Reserva> obtenerReservaPorUsuario(Integer idUsuario);
    public List<Reserva> obtenerReservasActivas(Integer idUsuario);
}
