package ejercicio6;

import java.util.Date;
import java.util.List;

public class Estudiante {
    private String colegioBachillerato;
    private Date fechaIngresoUniversidad;
    private Persona persona;
    private List<Carrera> carreras;
    private List<Curso> cursos;

    public Estudiante(String colegioBachillerato, Date fechaIngresoUniversidad, Persona persona, List<Carrera> carreras, List<Curso> cursos) {
        this.colegioBachillerato = colegioBachillerato;
        this.fechaIngresoUniversidad = fechaIngresoUniversidad;
        this.persona = persona;
        this.carreras = carreras;
        this.cursos = cursos;
    }

    public String getColegioBachillerato() {
        return colegioBachillerato;
    }

    public void setColegioBachillerato(String colegioBachillerato) {
        this.colegioBachillerato = colegioBachillerato;
    }

    public Date getFechaIngresoUniversidad() {
        return fechaIngresoUniversidad;
    }

    public void setFechaIngresoUniversidad(Date fechaIngresoUniversidad) {
        this.fechaIngresoUniversidad = fechaIngresoUniversidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
