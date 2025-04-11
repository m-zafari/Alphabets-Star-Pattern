/**
 *
 * print 'H' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
import java.util.Scanner;

public class H {

	public void hh(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < n; j++) {
                    if ((j == 1 || j == (n - 1) || (j > 1 && j < n - 1 && i == (n + 1) / 2))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < n; j++) {
                    if ((j == 1 || j == (n - 1)) || ((i == (n + 2) / 2) && (j > 1 && j < n - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
