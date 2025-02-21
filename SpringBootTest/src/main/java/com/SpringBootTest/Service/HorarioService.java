package com.SpringBootTest.Service;

import com.SpringBootTest.Entity.Horario;
import com.SpringBootTest.Repository.HorarioRepository;
import com.SpringBootTest.Service.Interfaces.IHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Service
public class HorarioService implements IHorarioService {

    @Autowired
    HorarioRepository horarioRepository;
    @Override
    public Horario crearHorario(Horario horario) throws Exception {


        Optional<Horario> horarioEncontradoByDate = horarioRepository.findByFecha(horario.getFecha());
        Optional<Horario> horarioEncontradoByInitialTime = horarioRepository.findByHora_inicial(horario.getHora_inicio());

        if (horarioEncontradoByDate.isPresent() && horarioEncontradoByInitialTime.isPresent()){
            throw new Exception("Ya existe un horario con esa fecha");
        }

        return horarioRepository.save(horario);
    }


}
