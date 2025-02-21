package com.SpringBootTest.Service;

import com.SpringBootTest.Repository.EspacioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspacioService {
    @Autowired
    EspacioRepository espacioRepository;
}
