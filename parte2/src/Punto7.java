import java.util.Scanner;

public class Punto7 {
      public static double Distancia (Double x1, Double y1, Double x2, Double y2)
    {
        return (Math.sqrt(Math.pow(y2-y1,2)) * (Math.pow(x2-x1,2)));
    }
      public static double Pendiente (Double x1, Double y1, Double x2, Double y2)
    {
        return ((y2-y1)/(x2-x1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar x1: ");
        Double x1 = Double.valueOf (scanner.nextLine());
        System.out.println("Digitar y1: ");
        Double y1 = Double.valueOf (scanner.nextLine());
        System.out.println("Digitar x2: ");
        Double x2 = Double.valueOf (scanner.nextLine());
        System.out.println("Digitar y2: ");
        Double y2 = Double.valueOf (scanner.nextLine());
        System.out.println("La distancia entre 2 puntos es : " + Distancia(x1,y1,x2,y2));
        System.out.println("La pendiente entre 2 puntos es: " +  Pendiente(x1,y1,x2,y2));
    }
}
