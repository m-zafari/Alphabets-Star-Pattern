/**
 *
 * print 'X' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class X {

	public void xx(int n) {
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n + 1; j++) {
                    if (j == i || j + i - 1 == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == i || j + i - 1 == n) {
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
