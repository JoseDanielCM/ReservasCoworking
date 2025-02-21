package com.SpringBootTest.Repository;

import com.SpringBootTest.Entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioRepository extends JpaRepository<Horario,Integer> {
}
