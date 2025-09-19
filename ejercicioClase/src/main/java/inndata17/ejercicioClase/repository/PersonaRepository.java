package inndata17.ejercicioClase.repository;

import inndata17.ejercicioClase.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer > {

}
