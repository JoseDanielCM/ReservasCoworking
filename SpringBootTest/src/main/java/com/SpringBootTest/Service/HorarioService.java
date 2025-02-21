package com.SpringBootTest.Service;

import com.SpringBootTest.Entity.Horario;
import com.SpringBootTest.Repository.HorarioRepository;
import com.SpringBootTest.Service.Interfaces.IHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class HorarioService implements IHorarioService {

    @Autowired
    HorarioRepository horarioRepository;
    @Override
    public Horario crearHorario(Horario horario) {

        LocalTime inicio = horario.getHora_inicio();
        LocalTime finalTime = horario.getHora_final();

        return null;
    }


}
