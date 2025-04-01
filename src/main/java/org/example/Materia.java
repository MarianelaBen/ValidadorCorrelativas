package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
    }

    public void setCorrelativas(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void agregarCorrelativas(Materia ... materia){
        Collections.addAll(this.correlativas, materia);
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas){
        return materiasAprobadas.containsAll(this.correlativas);
    }
}
