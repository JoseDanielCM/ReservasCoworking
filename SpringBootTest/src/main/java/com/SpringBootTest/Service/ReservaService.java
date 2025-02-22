package com.SpringBootTest.Service;

import com.SpringBootTest.DTO.Estado;
import com.SpringBootTest.DTO.Tipo;
import com.SpringBootTest.Entity.Horario;
import com.SpringBootTest.Entity.Reserva;
import com.SpringBootTest.Entity.Usuario;
import com.SpringBootTest.Exceptions.NoReservasActivasDeUsuario;
import com.SpringBootTest.Exceptions.ReservaNotFoundException;
import com.SpringBootTest.Repository.ReservaRepository;
import com.SpringBootTest.Repository.UsuarioRepository;
import com.SpringBootTest.Service.Interfaces.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService implements IReservaService {
    @Autowired
    ReservaRepository reservaRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public Reserva CrearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva actualizarReserva(Integer id, Horario nuevoHorario) {
        Reserva reservaExistente = reservaRepository.findById(id).orElseThrow(() -> new ReservaNotFoundException("Reserva no encontrada con id: " + id));

        if (nuevoHorario == null) {
            throw new IllegalArgumentException("La info proporcionada no puede ser nula");
        }

        reservaExistente.setHorario(nuevoHorario);

        return reservaRepository.save(reservaExistente);
    }

    @Override
    public void eliminarReserva(Integer id) {
        Reserva reservaExistente = reservaRepository.findById(id).orElseThrow(() -> new ReservaNotFoundException("Reserva no encontrada con id: " + id));
        reservaRepository.delete(reservaExistente);
    }

    @Override
    public List<Reserva> obtenerReservaPorUsuario(Integer idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElseThrow(null);
        System.out.println(usuario);
        List<Reserva> lista = reservaRepository.findByUsuario(usuario);
        System.out.println(lista);
        return lista;
    }

    @Override
    public List<Reserva> obtenerReservasActivas(Integer idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElseThrow(null);
        return reservaRepository.findByUsuarioAndEstado(usuario).orElseThrow(() -> new NoReservasActivasDeUsuario("El usuario no tiene reservas activas"));
    }
}
