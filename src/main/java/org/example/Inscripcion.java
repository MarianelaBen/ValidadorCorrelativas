package org.example;

import java.time.LocalDateTime;
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

    public boolean aprobada(){
        for (Materia materia : materiasACursar) {
            if(!materia.cumpleCorrelativas(alumno.getMateriasAprobadas())){
                return false;
            }
        }
        fueAprobada = true;
        fechaDeEvaluacion = LocalDateTime.now();
        return true;
    }
}
