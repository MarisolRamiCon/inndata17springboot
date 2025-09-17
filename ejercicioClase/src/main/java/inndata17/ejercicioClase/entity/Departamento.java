package inndata17.ejercicioClase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor // constructor sin argumentos
@Data //getter y setter

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "m2")
    private Integer m2;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "activo")
    private Boolean activo=true;


}
