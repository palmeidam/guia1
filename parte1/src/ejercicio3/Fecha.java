package ejercicio3;

public class Fecha {
    private Integer ano;
    private Integer mes;
    private Integer dia;

    public Fecha(Integer ano, Integer mes, Integer dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
}
