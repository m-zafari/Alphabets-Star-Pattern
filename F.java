/**
 *
 * print 'F' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */


public class F {

	public void ff(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n + 5) / 2; j++) {
                    if (((j > 1 && j <= (n + 5) / 2) && (i == 1 || i == (n + 1) / 2)) || (j == 1 && i <= n)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n + 4) / 2; j++) {
                    if (((j > 1 && j <= (n + 4) / 2) && (i == 1 || i == n / 2) || (j == 1 && i <= n))) {
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
