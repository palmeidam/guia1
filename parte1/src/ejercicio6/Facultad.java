package ejercicio6;

import java.util.List;

public class Facultad {
    private String nombre;
    private Integer codigo;
    private Universidad universidad;
    private List<Carrera> carreras;
    private List<Profesor> profesores;

    public Facultad(String nombre, Integer codigo, Universidad universidad, List<Carrera> carreras, List<Profesor> profesores) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.universidad = universidad;
        this.carreras = carreras;
        this.profesores = profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
