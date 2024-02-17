package ejercicio6;

import java.util.List;

public class Carrera {
    private String nombre;
    private Integer numeroCreditosTotales;
    private Integer numeroSemestres;
    private  NivelCarrera nivelCarrera;
    private  Facultad facultad;
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;

    public Carrera(String nombre, Integer numeroCreditosTotales, Integer numeroSemestres, NivelCarrera nivelCarrera, Facultad facultad, List<Estudiante> estudiantes, List<Curso> cursos) {
        this.nombre = nombre;
        this.numeroCreditosTotales = numeroCreditosTotales;
        this.numeroSemestres = numeroSemestres;
        this.nivelCarrera = nivelCarrera;
        this.facultad = facultad;
        this.estudiantes = estudiantes;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroCreditosTotales() {
        return numeroCreditosTotales;
    }

    public void setNumeroCreditosTotales(Integer numeroCreditosTotales) {
        this.numeroCreditosTotales = numeroCreditosTotales;
    }

    public Integer getNumeroSemestres() {
        return numeroSemestres;
    }

    public void setNumeroSemestres(Integer numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }

    public NivelCarrera getNivelCarrera() {
        return nivelCarrera;
    }

    public void setNivelCarrera(NivelCarrera nivelCarrera) {
        this.nivelCarrera = nivelCarrera;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
