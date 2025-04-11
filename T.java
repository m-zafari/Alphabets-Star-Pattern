/**
 *
 * print 'T' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class T {

	public void tt(int n) {
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < n + 2; j++) {
                    if ((i == 1 || (j == (n + 2) / 2) && (i > 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < n + 2; j++) {
                    if (i == 1 || (j == (n + 2) / 2 || j == (n + 4) / 2) && i > 1) {
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
