import java.util.Scanner;

public class Punto13 {
    public static double SueldoEmpleado(Double sueldoActual)
    {
       if (sueldoActual <= 800000)
       {
           return (sueldoActual*0.10);

       }
       else if (sueldoActual > 800000 && sueldoActual <= 1200000)
       {
           return (sueldoActual*0.08);

       }
       else if (sueldoActual > 1200000)
       {
           return (sueldoActual*0.05);

       }
    else {
           return 0;
       }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sueldo del empleado: ");
        Double sueldoActual = Double.valueOf(scanner.nextLine());
        System.out.println("El valor del aumento es  " + SueldoEmpleado (sueldoActual) );

    }
}
