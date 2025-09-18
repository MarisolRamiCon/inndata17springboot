package inndata17.ejercicioClase.service.impl;

import inndata17.ejercicioClase.entity.Departamento;
import inndata17.ejercicioClase.repository.DepartamentoRepository;
import inndata17.ejercicioClase.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {
    @Autowired //Inyección de dependencia
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> ReadAll() {
        return departamentoRepository.findAll().stream().filter(depa-> depa.getActivo()).toList();
    }

    @Override
    public Optional<Departamento> ReadById(Integer id) {
        return departamentoRepository.findById(id);
    }

    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String deleteById(Integer id) {
        Optional<Departamento> departamentoBuscado= departamentoRepository.findById(id);
        if(departamentoBuscado.isPresent()){
            Departamento departamento2= departamentoBuscado.get();
            departamento2.setActivo(false);
            departamentoRepository.save(departamento2);
            return "Departamento borrado";
        } else{
            return "Departamento no encontrado";
        }
    }

    @Override
    public List<Departamento> precioMayor(Double precio) {
        return departamentoRepository.findByPrecioGreaterThan(precio);
    }

    @Override
    public List<Departamento> precioM2(Integer m2, Double precio) {
        return departamentoRepository.m2AndPrecio(m2, precio).stream().filter(depa->depa.getActivo()).toList();
    }
}
