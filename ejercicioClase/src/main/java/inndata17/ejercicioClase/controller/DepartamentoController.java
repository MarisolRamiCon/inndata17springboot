package inndata17.ejercicioClase.controller;

import inndata17.ejercicioClase.entity.Departamento;
import inndata17.ejercicioClase.service.impl.DepartamentoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;
    /*
    * Metodos CRUD
    * C- CREATE R-READ  U- UPDATE D-DELETE
    * Para read la anotation es @GetMapping*/
    @GetMapping("/departamentos")
    public List<Departamento> readAll(){
        return departamentoService.ReadAll();
    }
    @GetMapping("/departamentos/{id}")
    public Optional<Departamento> readById(@PathVariable Integer id){
        return departamentoService.ReadById(id);
    }


}
