package springBoot.healhub.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import springBoot.entity.Auxiliar;

public interface AuxiliarRepository extends CrudRepository<Auxiliar, String> {
	Optional<Auxiliar> findByNombreAndNumTrabajador(String nombre, String numTrabajador);
}
