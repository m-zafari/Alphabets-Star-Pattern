//import java.util.Scanner;

/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class Cardioid_Up {

	public void cardioid_u(int R) {

        System.out.println("Enter R:(R>4)");
        if (R > 4) {
            for (int x = -2 * R; x <= 2 * R; x++) {
                for (int y = -2 * R; y <= 2 * R; y++) {
                    double InR = Math.sqrt(x * x + y * y);
                    double Teta = Math.atan2(y, x);
                    if (InR <= R * (1 - Math.cos(Teta))) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
//}
