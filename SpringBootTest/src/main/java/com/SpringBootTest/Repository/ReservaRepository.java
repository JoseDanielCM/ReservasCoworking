package com.SpringBootTest.Repository;

import com.SpringBootTest.DTO.Estado;
import com.SpringBootTest.Entity.Reserva;
import com.SpringBootTest.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;


public interface ReservaRepository extends JpaRepository<Reserva,Integer> {
    List<Reserva> findByUsuario(Usuario usuario);
    @Query("SELECT r FROM Reserva r WHERE usuario = :usuario AND estado != 'CANCELADA' ")
    Optional<List<Reserva>> findByUsuarioAndEstado(Usuario usuario);
}
