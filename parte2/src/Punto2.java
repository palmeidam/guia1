public class Punto2 {
    public static final Float SILLAS_BUS = 30F;
    public static Double numeroDeBuses (Float gordos, Float flacos)
    {
        Float buses = (2*gordos + flacos)/SILLAS_BUS;
        return Math.ceil(buses);
    }

    public static void main(String[] args) {
        System.out.println("El numero de buses es: " + numeroDeBuses(20F,10F).toString());
    }
}
