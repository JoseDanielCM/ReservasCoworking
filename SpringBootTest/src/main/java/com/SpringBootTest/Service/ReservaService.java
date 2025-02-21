package com.SpringBootTest.Service;

import com.SpringBootTest.Repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository reservaRepository;


}
