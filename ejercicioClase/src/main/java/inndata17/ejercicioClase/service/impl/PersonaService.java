package inndata17.ejercicioClase.service.impl;

import inndata17.ejercicioClase.entity.Persona;
import inndata17.ejercicioClase.model.PersonaDto;
import inndata17.ejercicioClase.repository.PersonaRepository;
import inndata17.ejercicioClase.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<PersonaDto> readAll() {
        return personaRepository.findAll().stream().map(
                persona -> {
                    PersonaDto personaDto= new PersonaDto(
                            persona.getNombre(), persona.getEdad(),persona.getIdDepartamento().getId()
                    );
                    return personaDto;
                }
        ).toList();
    }
}
