/**
 *
 * print 'M' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class M {

	public void mm(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == 1 || j == (2 * n - 1) || (i + j == 2 * n && j > n && j < (2 * n - 1)) || (i == j && j > 1 && j <= n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
