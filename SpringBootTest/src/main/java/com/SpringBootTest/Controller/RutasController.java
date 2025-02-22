package com.SpringBootTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RutasController {

    @GetMapping("/vista/users/{id}")
    public String usersPage (@PathVariable Integer id){
        return "reservas";
    }

    @GetMapping("/vista/espacios")
    public String espaciosPage(){
        return "espacios";
    }

    @GetMapping("/vista/crear")
    public String espacioCrear(){
        return "crearEspacio";
    }
}
