package com.SpringBootTest.Repository;

import com.SpringBootTest.Entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

public interface HorarioRepository extends JpaRepository<Horario,Integer> {

    Optional<Horario> findByFecha(LocalDate fecha);

    @Query("SELECT h FROM Horario h WHERE hora_inicio = :horaInicial")
    Optional<Horario> findByHora_inicial(LocalTime horaInicial);
}
