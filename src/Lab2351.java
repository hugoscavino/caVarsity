import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Lab2351 {

    /**
    Given three floating-point numbers

     3.6 4.5 2.0

     the output is:
     12.96 1.841304610218211E11 4.5 16.2

     x, y, and z,

     1) output x to the power of z,
     2) x to the power of (y to the power of z),
     3) the absolute value of y, and the
     3) square root of (xy to the power of z).
     */
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
        URL url = Lab2351.class.getResource("input.txt");
        assert url != null;
        Scanner scnr = new Scanner(new File(url.toURI()));

        double x;
        double y;
        double z;

        x = scnr.nextDouble() ;
        y = scnr.nextDouble();
        z = scnr.nextDouble() ;

        double x2ndPower = Math.pow(x, z);
        double xPowerY2PowerZ = Math.pow(x, Math.pow(y, z));
        double absValueY = Math.abs(y) ;
        double sqrRootXY2Z = Math.sqrt(Math. pow(x*y, z));

        System.out.print(x2ndPower + " ");
        System.out.print(xPowerY2PowerZ + " ");
        System.out.print(absValueY + " ");
        System.out.println(sqrRootXY2Z);
    }
}
