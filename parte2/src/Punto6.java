import java.util.Scanner;

public class Punto6 {
      public static double AreaRectangulo (Float base, Float altura)
    {
        return (base * altura);
    }
      public static Double Hipotenusa (Float catetoOpuesto, Float catetoAdyacente)
    {
        return Math.sqrt((catetoAdyacente * catetoAdyacente)+(catetoOpuesto*catetoOpuesto));
    }
      public static double AreaTriangulo (Float base, Float altura)
    {
        return ((base*altura)/2);
    }
    public static double PerimetroTerreno (Float a, Float b, Float c, Double hipotenusa)
    {
        return ((a+b+c+hipotenusa));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar A: ");
        Float a = Float.valueOf (scanner.nextLine());
        System.out.println("Digitar B: ");
        Float b = Float.valueOf (scanner.nextLine());
        System.out.println("Digitar C: ");
        Float c = Float.valueOf (scanner.nextLine());
        Double areaRectangulo = AreaRectangulo(b,a-c);
        Double areaTriangulo = AreaTriangulo(b,a-c);
        Double hipotenusa = Hipotenusa(a-c,b);
        System.out.println("El area es : " + (areaRectangulo + areaTriangulo));
        System.out.println("El perimetro es : " +  PerimetroTerreno(a,b,c,hipotenusa));
    }
}
