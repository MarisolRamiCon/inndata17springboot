package inndata17.ejercicioClase.service.impl;

import inndata17.ejercicioClase.feign.ViajeCliente;
import inndata17.ejercicioClase.model.Viajes;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViajeService implements ViajeCliente {
    @Autowired
    ViajeCliente viajeCliente;
    @Override
    public List<Viajes> ReadAll() {
        return viajeCliente.ReadAll();
    }
}
