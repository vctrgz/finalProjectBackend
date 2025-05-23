package springBoot.healhub.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springBoot.entity.Paciente;
import springBoot.entity.Registro;
import springBoot.healhub.dao.RegistroRepository;

@RestController
@RequestMapping("/registro")
public class RegistroController {
	@Autowired
	private RegistroRepository registroRepository;
	
	@PostMapping("/nuevoRegistro")	
    public @ResponseBody ResponseEntity<Registro> createRegistro(@RequestBody Registro registro) {
    	Optional<Registro> newRegistro = registroRepository.findByRegistroId(registro.getRegistroId());
    	if (!newRegistro.isPresent()) {
    		try {   
    			System.out.println(registro);
    			Registro createdRegistro = registroRepository.save(registro);
    			return ResponseEntity.status(HttpStatus.CREATED).body(createdRegistro);
    		} catch (Exception e) {
    			// TODO: handle exception
    			System.out.println(e.getMessage());
    			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    		}			
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
	@GetMapping("/patient/{id}")
    public ResponseEntity<Iterable<Registro>> getAllCaresByPatient(@PathVariable int id) {
	    System.out.println("Recibida petición para ID: " + id);

		Iterable<Registro> registros = registroRepository.findByPacienteNumHistorial(id);
	    registros.forEach(registro -> System.out.println("Registro: " + registro));

        return ResponseEntity.ok(registros);
    }
}
