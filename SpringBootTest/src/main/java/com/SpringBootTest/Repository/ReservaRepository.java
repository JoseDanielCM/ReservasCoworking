package com.SpringBootTest.Repository;

import com.SpringBootTest.Entity.Reserva;
import com.SpringBootTest.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ReservaRepository extends JpaRepository<Reserva,Integer> {
    List<Reserva> findByUsuario(Usuario usuario);
}
