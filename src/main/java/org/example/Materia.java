package org.example;

import lombok.Getter;
import lombok.Setter;

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

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas){
        for(Materia correlativa: correlativas){
            if(!materiasAprobadas.contains(correlativa)){
                return false;
            }
        }
        return true;
    }
}
