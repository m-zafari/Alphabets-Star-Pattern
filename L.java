/**
 *
 * print 'L' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class L {

	public void ll(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n + 4; j++) {
                if ((j == 1 || (j > 1 && j < n + 4 && i == n))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
