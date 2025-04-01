package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    @DisplayName("Verifica que la materia se agregue correctamente a las materias aprobadas del alumno.")
    public void PuedeAgregarMateriaAprobada(){
        Alumno alumno = new Alumno("Marianela", "Benitez");
        Materia ddsi = new Materia("Diseño de Sistemas de Informacion");

        alumno.agregarMateriasAprobadas(ddsi);

        Assertions.assertTrue(alumno.getMateriasAprobadas().contains(ddsi));
    }
}