import java.util.Scanner;

public class Punto14 {
    public static String HermanoMayor (String nombre1, Integer edad1,String nombre2, Integer edad2,String nombre3, Integer edad3)
    {
       if (edad1 > edad2 && edad1 > edad3)
       {
           return (nombre1);

       }
       else if (edad2 > edad1 && edad2 > edad3)
       {
           return (nombre2);

       }
       else if (edad3 > edad1 && edad3 > edad2)
       {
           return (nombre3);

       }
    else {
           return "no hay hermano mayor";
       }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hermano 1: ");
        String nombre1= (scanner.nextLine());
        System.out.println("Ingrese la edad del hermano 1: ");
        Integer edad1= Integer.valueOf((scanner.nextLine()));
        System.out.println("Ingrese el nombre del hermano 2: ");
        String nombre2= (scanner.nextLine());
        System.out.println("Ingrese la edad del hermano 2: ");
        Integer edad2= Integer.valueOf((scanner.nextLine()));
        System.out.println("Ingrese el nombre del hermano 3: ");
        String nombre3= (scanner.nextLine());
        System.out.println("Ingrese la edad del hermano 3: ");
        Integer edad3= Integer.valueOf((scanner.nextLine()));

        System.out.println("El hermano mayor es  " + HermanoMayor (nombre1,edad1,nombre2,edad2,nombre3,edad3) );

    }
}
