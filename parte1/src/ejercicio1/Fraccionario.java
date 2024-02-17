package ejercicio1;

public class Fraccionario {
    private Integer numerador;
    private Integer denominador;

    public Integer getNumerador() {
        return numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    public Integer getDenominador() {
        return denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }

    public Fraccionario(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
