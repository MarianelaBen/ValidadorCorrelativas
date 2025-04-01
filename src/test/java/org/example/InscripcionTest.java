package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class InscripcionTest {
    Alumno alumno = new Alumno("Marianela", "Benitez");
    Inscripcion inscripcion = new Inscripcion(alumno);


    @Test
    @DisplayName("Devuelve verdadero si el alumno tiene todas las correlativas necesarias aprobadas.")
    public void SeApruebaLaInscripcion(){

        Materia ddsi = new Materia("Diseño de Sistemas de Informacion");
        Materia pdp = new Materia("Paradigmas de Programacion");
        Materia ads = new Materia("Análisis de Sistemas de Información");

        ddsi.getCorrelativas().add(pdp);
        ddsi.getCorrelativas().add(ads);


        alumno.agregarMateriasAprobadas(pdp,ads);


        inscripcion.getMateriasACursar().add(ddsi);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Devuelve falso si el alumno no cumple con todas las correlativas necesarias aprobadas.")
    public void NoApruebaLaInscripcion(){

        Materia aN = new Materia("Analisis numerico");
        Materia aga = new Materia("Algebra y  Geometria Analitica");
        Materia am1 = new Materia("Analisis Matematico 1");

        Materia am2 = new Materia("Analisis Matematico 2");


        alumno.agregarMateriasAprobadas(am1, aga);

        aN.getCorrelativas().add(am1);
        aN.getCorrelativas().add(aga);
        aN.getCorrelativas().add(am2);

        inscripcion.getMateriasACursar().add(aN);

        Assertions.assertFalse(inscripcion.aprobada());

    }
}