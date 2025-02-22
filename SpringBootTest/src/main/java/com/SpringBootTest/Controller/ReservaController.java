package com.SpringBootTest.Controller;
import com.SpringBootTest.DTO.ReservaDTO;
import com.SpringBootTest.Entity.Espacio;
import com.SpringBootTest.Entity.Horario;
import com.SpringBootTest.Entity.Reserva;
import com.SpringBootTest.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    ReservaService reservaService;

    @GetMapping("/getAll/{id}")
    public ResponseEntity<List<ReservaDTO>> obtenerReservasUsuario(@PathVariable Integer id) {
        List<Reserva> listaReservas = reservaService.obtenerReservaPorUsuario(id);
        List<ReservaDTO> reservaDTOs = listaReservas.stream().map(ReservaDTO::new).toList();
        return ResponseEntity.ok(reservaDTOs);
    }


    @GetMapping("/activas/{id}")
    public ResponseEntity<List<Reserva>> obtenerReservasUsuarioActivas(@PathVariable Integer id) {
        return ResponseEntity.ok(reservaService.obtenerReservasActivas(id));
    }


    @PatchMapping("/actualizar/{id}")
    public void eliminarReserva(@PathVariable Integer id, @RequestBody Horario horario) {
        reservaService.actualizarReserva(id, horario);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarReserva(@PathVariable Integer id) {
        reservaService.eliminarReserva(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<Reserva> crearReserva(@RequestBody Reserva reserva){
        return ResponseEntity.ok(reservaService.CrearReserva(reserva));
    }

}






