import java.util.Scanner;

public class Punto11 {
    public static Integer NumeroDecenas(Integer numero)
    {
        return (int) Math.floor(numero/10);
    }

    public static Integer NumeroUnidades(Integer numero)
    {
        return (numero-(NumeroDecenas(numero)*10));
    }

    public static String EquivalenteRomanoUnidades(Integer numeroUnidades)
    {
        switch (numeroUnidades)
        {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return " ";
        }
    }

    public static String EquivalenteRomanoDecenas (Integer numeroDecenas)
    {
        switch (numeroDecenas)
        {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return " ";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de dos cifras: ");
        Integer numero = Integer.valueOf (scanner.nextLine());
        if(numero<=99 && numero>=1 )
        {
            String equivalenteRomanoDecenas = EquivalenteRomanoDecenas(NumeroDecenas(numero));
            String equivalenteRomanoUnidades = EquivalenteRomanoUnidades( NumeroUnidades(numero));
            System.out.println("El numero romano es : " + equivalenteRomanoDecenas + equivalenteRomanoUnidades);
        }
        else
        {
            System.out.println("Error: el numero no es de dos cifras o es negativo ");
        }


    }
}
