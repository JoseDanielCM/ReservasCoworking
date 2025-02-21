package com.SpringBootTest.Repository;

import com.SpringBootTest.DTO.Tipo;
import com.SpringBootTest.Entity.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EspacioRepository extends JpaRepository<Espacio, Integer> {
    List<Espacio> findAllByDisponibleIsTrue();
    List<Espacio> findByTipo(Tipo tipo);
}
