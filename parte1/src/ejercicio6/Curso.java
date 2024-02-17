package ejercicio6;

import java.util.List;

public class Curso {
    private Integer curso;
    private String nombre;
    private Integer numeroCreditos;
    private Integer numeroSalon;
    private String nombreEdificio;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;
    private Carrera carrera;


    public Curso(Integer curso, String nombre, Integer numeroCreditos, Integer numeroSalon, String nombreEdificio, List<Profesor> profesores, List<Estudiante> estudiantes, Carrera carrera) {
        this.curso = curso;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroSalon = numeroSalon;
        this.nombreEdificio = nombreEdificio;
        this.profesores = profesores;
        this.estudiantes = estudiantes;
        this.carrera = carrera;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public Integer getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(Integer numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
