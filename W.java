/**
 *
 * print 'W' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class W {

	public void ww(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4 * n - 3; j++) {
                if (i + j == 2 * n || i == j || j - i == 2 * n - 2 || i + j == 4 * n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
