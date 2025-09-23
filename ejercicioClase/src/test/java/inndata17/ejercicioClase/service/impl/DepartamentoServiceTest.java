package inndata17.ejercicioClase.service.impl;

import inndata17.ejercicioClase.entity.Departamento;
import inndata17.ejercicioClase.repository.DepartamentoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DepartamentoServiceTest {
    @InjectMocks
    DepartamentoService departamentoService;

    @Mock
    DepartamentoRepository departamentoRepository;


    @Test
    void suma() {
        Double valorDado= departamentoService.suma(5.28,8.4);
        //resultado esperado -> 13.68
        assertEquals(13.68,valorDado);
        System.out.println("Probando Método suma");

    }

    @BeforeEach
    void setUp() {
        System.out.println("Procesando Metodo Before");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Procesando metodo after");
    }

    @Test
    void deleteById() {
        Departamento departamento= new Departamento(1,20,500,true);
        Mockito.when(departamentoRepository.findById(1)).thenReturn(Optional.of(departamento));
        departamento.setActivo(false);
        departamentoRepository.save(departamento);
        assertEquals("Departamento borrado",departamentoService.deleteById(1));
    }
}