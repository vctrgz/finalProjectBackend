package springBoot.healhub.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import springBoot.entity.Registro;

public interface RegistroRepository extends CrudRepository<Registro, String> {
	Optional<Registro> findByRegistroId(Integer registroId);
	Iterable<Registro> findByPacienteNumHistorial(Integer numHistorial);
}
