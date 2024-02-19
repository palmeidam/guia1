import java.util.Scanner;

public class Punto4 {
    public static double GastoArriendo (Float sueldoPedro)
    {
        return (sueldoPedro * 0.40);
    }

    public static double GastoComida (Float sueldoPedro)
    {
        return (sueldoPedro * 0.15);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar sueldo de Pedro: ");
        String sueldoPedro = scanner.nextLine();
        Double gastoArriendo = GastoArriendo(Float.valueOf(sueldoPedro));
        Double gastoComida = GastoComida(Float.valueOf(sueldoPedro));
        Double dineroDisponible = Float.valueOf(sueldoPedro) - gastoArriendo - gastoComida;
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero que queda: " + dineroDisponible);
    }
}
