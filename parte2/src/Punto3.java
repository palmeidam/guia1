public class Punto3 {
    public static double LongitudEscalera (Float lado, Double angulo)
    {
        Double anguloRad = Math.toRadians(angulo);
        return (lado / Math.sin(anguloRad));
    }

    public static void main(String[] args) {
        System.out.println("La longitud de la escalera es: " + LongitudEscalera(10F,70D));
    }
}
