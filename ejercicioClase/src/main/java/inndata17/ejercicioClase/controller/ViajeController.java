package inndata17.ejercicioClase.controller;

import inndata17.ejercicioClase.model.Viajes;
import inndata17.ejercicioClase.service.impl.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ViajeController {
    @Autowired
    ViajeService viajeService;
    @GetMapping("/viajes")
    public List<Viajes> readAll(){
        return viajeService.ReadAll();
    }
}
