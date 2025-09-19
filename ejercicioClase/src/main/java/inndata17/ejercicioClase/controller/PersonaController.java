package inndata17.ejercicioClase.controller;

import inndata17.ejercicioClase.entity.Persona;
import inndata17.ejercicioClase.model.PersonaDto;
import inndata17.ejercicioClase.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1") //Ruta de base
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/personas")
    public List<PersonaDto> readAll(){
        return personaService.readAll();
    }

}
