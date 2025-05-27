package springBoot.healhub.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import springBoot.entity.Auxiliar;
import springBoot.entity.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, String> {
	Optional<Paciente>findByNumHistorial(Integer numHistorial);
}
