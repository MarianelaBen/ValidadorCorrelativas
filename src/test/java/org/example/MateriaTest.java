package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {
    Alumno alumno = new Alumno("Marianela", "Benitez");

    Materia pdp = new Materia("Paradigmas de Programacion");
    Materia ads = new Materia("Análisis de Sistemas de Información");
    Materia ddsi = new Materia("Diseño de Sistemas de Información");

    @Test
    @DisplayName("Devuelve verdadero si el alumno tiene aprobadas las correlativas de la materia.")
    public void ElAlumnoTieneAprobadasTodasLasCorrelativasALaMateria(){

        ddsi.getCorrelativas().add(pdp);
        ddsi.getCorrelativas().add(ads);

        alumno.agregarMateriaAprobada(pdp);
        alumno.agregarMateriaAprobada(ads);

        Assertions.assertTrue(ddsi.cumpleCorrelativas(alumno.getMateriasAprobadas()));

    }
    @Test
    @DisplayName("Devuelve falso si al alumno le faltan aprobar las correlativas de la materia.")
    public void ElAlumnoNoTieneAprobadasTodasLasCorrelativasALaMateria(){
        ddsi.getCorrelativas().add(pdp);
        ddsi.getCorrelativas().add(ads);

        alumno.agregarMateriaAprobada(ads);

        Assertions.assertFalse(ddsi.cumpleCorrelativas(alumno.getMateriasAprobadas()));

    }


}