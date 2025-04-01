package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new HashSet<>();
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
