public class Punto1 {
    public static Integer funcionEstadistica (Integer x, Integer y)
    {
        return (x*x) + (2*x*y) + (y*y);
    }

    public static void main(String[] args) {
        System.out.println("El valor es: " + funcionEstadistica(1,2));
    }
}
