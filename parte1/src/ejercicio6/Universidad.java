package ejercicio6;

import java.util.List;

public class Universidad {
    private String nombre;
    private String nombreRector;
    private String nombreCiudad;
    private List<Facultad> facultades;

    public Universidad(String nombre, String nombreRector, String nombreCiudad, List<Facultad> facultades) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.nombreCiudad = nombreCiudad;
        this.facultades = facultades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }
}
