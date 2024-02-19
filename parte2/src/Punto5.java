import java.util.Scanner;

public class Punto5 {
    public static final Float RADIO_GRANDE = 30F;
    public static final Float RADIO_PEQUENNO = 12F;
    public static double AreaCirculo (Float radio)
    {
        return (Math.PI * radio * radio);
    }

    public static double AreaCorona (Float radioPequenno, Float radioGrande)
    {
        return (AreaCirculo(radioGrande) - AreaCirculo(radioPequenno));
    }

    public static void main(String[] args) {
        System.out.println("Area de la corona : " + AreaCorona(RADIO_PEQUENNO,RADIO_GRANDE));
    }
}
