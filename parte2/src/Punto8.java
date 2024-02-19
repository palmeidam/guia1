import java.util.Scanner;

public class Punto8 {
    public static double NumeroDeSalones(Double numeroEstudiantes, Double capacidadSalon)
    {
        return Math.ceil(numeroEstudiantes/capacidadSalon) ;
    }
    public static double NumeroPisos(Double salonesPorPiso, Double numeroSalones)
    {
        return Math.ceil(numeroSalones/salonesPorPiso) ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar numero estudiantes: ");
        Double numeroEstudiantes = Double.valueOf (scanner.nextLine());
        System.out.println("Digitar capacidad de un salon: ");
        Double capacidadSalon = Double.valueOf (scanner.nextLine());
        System.out.println("Digitar salones por piso: ");
        Double salonesPorPiso = Double.valueOf (scanner.nextLine());
        Double numeroSalones = NumeroDeSalones(numeroEstudiantes, capacidadSalon);
        System.out.println("El numero de salones es  : " + numeroSalones);
        System.out.println("El numero de pisos es: " +  NumeroPisos(salonesPorPiso, numeroSalones));
    }
}
