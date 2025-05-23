package springBoot.healhub.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springBoot.entity.Auxiliar;
import springBoot.healhub.dao.AuxiliarRepository;

@RestController
@RequestMapping("/auxiliar")
public class AuxiliarController {

    @Autowired
    private AuxiliarRepository auxiliarRepository;

    @PostMapping("/login")
    public ResponseEntity<Auxiliar> login(@RequestBody Auxiliar auxiliar) {
        System.out.println("Intento de login:");
        System.out.println("Nombre recibido: " + auxiliar.getNombre());
        System.out.println("NumTrabajador recibido: " + auxiliar.getNumTrabajador());

        Optional<Auxiliar> loggedNurse = auxiliarRepository
                .findByNombreAndNumTrabajador(auxiliar.getNombre(), auxiliar.getNumTrabajador());

        if (loggedNurse.isPresent()) {
            return ResponseEntity.ok(loggedNurse.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
