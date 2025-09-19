package inndata17.ejercicioClase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Viajes {
    private Integer id;
    private String destino;
    private Double precio;
    private LocalDateTime fechaSalida;
}
