import java.util.Scanner;

public class Punto12 {
    public static String DiaSiguiente(String diaHoy)
    {
        switch (diaHoy.toUpperCase())
        {
            case "LUNES":
                return "MARTES";
            case "MARTES":
                return "MIERCOLES";
            case "MIERCOLES":
                return "JUEVES";
            case "JUEVES":
                return "VIERNES";
            case "VIERNES":
                return "SABADO";
            case "SABADO":
                return "DOMINGO";
            case "DOMINGO":
                return "LUNES";
            default:
                return " ";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String dia = scanner.nextLine();
        System.out.println("El dia siguiente es: " + DiaSiguiente (dia) );

    }
}
