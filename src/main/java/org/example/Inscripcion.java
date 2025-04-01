package org.example;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materiasACursar;
    private Boolean fueAprobada;
    private LocalDateTime fechaDeEvaluacion;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasACursar = new LinkedHashSet<>();
        this.fueAprobada = false;
        this.fechaDeEvaluacion = null;
    }

    public Set<Materia> getMateriasACursar() {
        return materiasACursar;
    }

    public void agregarMateriasACursar(Materia ... materias){
        Collections.addAll(this.materiasACursar, materias);
    }

    public boolean aprobada(){
        if(this.materiasACursar
                .stream()
                .allMatch(m -> m.cumpleCorrelativas(this.alumno.getMateriasAprobadas()))){
            fueAprobada = true;
            fechaDeEvaluacion = LocalDateTime.now();
            return true;
        }

        return false;

    }
}
