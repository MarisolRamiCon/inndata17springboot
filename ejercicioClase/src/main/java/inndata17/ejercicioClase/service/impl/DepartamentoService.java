package inndata17.ejercicioClase.service.impl;

import inndata17.ejercicioClase.entity.Departamento;
import inndata17.ejercicioClase.repository.DepartamentoRepository;
import inndata17.ejercicioClase.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired //Inyección de dependencia
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> ReadAll() {
        return departamentoRepository.findAll();
    }
}
