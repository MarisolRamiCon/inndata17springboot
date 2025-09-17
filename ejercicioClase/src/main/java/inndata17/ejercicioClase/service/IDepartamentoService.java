package inndata17.ejercicioClase.service;

import inndata17.ejercicioClase.entity.Departamento;

import java.util.List;
import java.util.Optional;


public interface IDepartamentoService {
    public List<Departamento> ReadAll();
    public Optional<Departamento> ReadById(Integer id);
    public Departamento create(Departamento departamento);
    public Departamento update(Departamento departamento);
    public String deleteById(Integer id);
}
