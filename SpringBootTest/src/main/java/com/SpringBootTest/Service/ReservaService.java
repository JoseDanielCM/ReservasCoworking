package com.SpringBootTest.Service;

import com.SpringBootTest.Entity.Reserva;
import com.SpringBootTest.Repository.ReservaRepository;
import com.SpringBootTest.Service.Interfaces.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService implements IReservaService {
    @Autowired
    ReservaRepository reservaRepository

    @Override
    public Reserva CrearReserva(Reserva reserva) {
        return null;
    }

    @Override
    public Reserva actualizarReserva(Integer id, Reserva nuevaReserva) {
        return null;
    }

    @Override
    public void eliminarReserva(Integer id) {

    }

    @Override
    public List<Reserva> obtenerReservaPorUsuario(Integer idUsuario) {
        return null;
    }

    @Override
    public List<Reserva> obtenerReservasActivas(Integer idUsuario) {
        return null;
    }
}
