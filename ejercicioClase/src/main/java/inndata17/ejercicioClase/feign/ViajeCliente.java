package inndata17.ejercicioClase.feign;

import inndata17.ejercicioClase.model.Viajes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "viajes", url = "https://6721642e98bbb4d93ca84a26.mockapi.io/api/v4")
public interface ViajeCliente {
    //Es la conexion entre la api de terceros y nuestra computadora
    @GetMapping("/viajes")
    List<Viajes> ReadAll();

}
