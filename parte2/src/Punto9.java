import java.util.Scanner;

public class Punto9 {
    public static Integer NumeroMayor(Integer numero1, Integer numero2)
    {
        if(numero1>numero2) {
            return numero1;
        }
        else {
            return numero2;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        Integer numero1 = Integer.valueOf (scanner.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        Integer numero2 = Integer.valueOf (scanner.nextLine());
        System.out.println("El numero mayor es: " +  NumeroMayor(numero1, numero2));
    }
}
