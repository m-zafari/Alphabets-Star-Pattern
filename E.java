/**
 *
 * print 'E' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class E {

    public void ee(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n + 1) / 2; j++) {
                    if (((j > 1 && j <= (n + 1) / 2) && (i == 1 || i == (n + 1) / 2 || i == n)) || (j == 1 && i <= n)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n / 2; j++) {
                    if (((j > 1 && j <= n / 2) && (i == 1 || i == (n + 2) / 2 || i == n)) || (j == 1 && i <= n)) {
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
