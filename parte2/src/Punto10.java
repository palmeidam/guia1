import java.util.Scanner;

public class Punto10 {
    public static Double Operacion(Integer numero1, Integer numero2, String operador)
    {
        if(operador.equals( "+")) {
            return Double.valueOf(numero1 + numero2);
        }
        if(operador.equals( "-")) {
            return Double.valueOf(numero1 - numero2);
        }
        if(operador.equals("*")) {
            return Double.valueOf(numero1 * numero2);
        }
        if(operador.equals("/")) {
            return Double.valueOf(numero1 / numero2);
        }
        if(operador.equals("%")) {
            return Double.valueOf((numero1 * numero2)/100);
        }
        if(operador.equals("**")) {
            return Math.pow(numero1,numero2);
        }
     return  0D;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        Integer numero1 = Integer.valueOf (scanner.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        Integer numero2 = Integer.valueOf (scanner.nextLine());
        System.out.println("Ingrese el operdores: ");
        String operador = scanner.nextLine();
        System.out.println("El resultado es: " +  Operacion(numero1, numero2,operador));
    }
}
