package springBoot.healhub.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot.entity.Habitacion;
import springBoot.healhub.dao.HabitacionRepository;

@RestController
@RequestMapping("/habitacion")
public class HabitacionController {
	@Autowired
    private HabitacionRepository habitacionRepository;
	
	@GetMapping("/habitaciones")
    public ResponseEntity<Iterable<Habitacion>> getAllRooms() {
        Iterable<Habitacion> habitaciones = habitacionRepository.findAll();
//        for (Habitacion habitacion : habitaciones) {
//            
//        }
        return ResponseEntity.ok(habitaciones);
    }
}
