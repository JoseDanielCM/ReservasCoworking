package com.SpringBootTest.Service;

import com.SpringBootTest.Repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService {

    @Autowired
    HorarioRepository horarioRepository;
}
