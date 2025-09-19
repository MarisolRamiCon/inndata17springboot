package inndata17.ejercicioClase.service;

import inndata17.ejercicioClase.entity.Persona;
import inndata17.ejercicioClase.model.PersonaDto;

import java.util.List;

public interface IPersonaService {
    public List<PersonaDto> readAll();
}
