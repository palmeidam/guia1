package ejercicio4;

public class Proyectil {
    private Integer velocidad;
    private Integer angulo;

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getAngulo() {
        return angulo;
    }

    public void setAngulo(Integer angulo) {
        this.angulo = angulo;
    }

    public Proyectil(Integer velocidad, Integer angulo) {
        this.velocidad = velocidad;
        this.angulo = angulo;


    }
}
