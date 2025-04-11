/**
 *
 * print 'A' with '*'
 */

/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */


public class A {

	public void aa(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (i + j - 1 == n || j - i + 1 == n || (i == (n + 1) / 2 && j > n - i + 1 && j < i + n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (i + j - 1 == n || j - i + 1 == n || (i == (n + 2) / 2 && j > n - i + 1 && j < i + n - 1)) {
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
