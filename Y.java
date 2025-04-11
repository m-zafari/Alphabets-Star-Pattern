/**
 *
 * print 'Y' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class Y {

	public void yy(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= (n + 1) / 2; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == i || j + i - 1 == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            for (int z = 1; z <= (n + 1) / 2; z++) {
                for (int k = 1; k < n; k++) {
                    if (k == (n + 1) / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == i || j + i - 1 == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            for (int z = 1; z <= n / 2; z++) {
                for (int k = 1; k < n; k++) {
                    if (k == n / 2 || k == (n + 2) / 2) {
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
