/**
 *
 * print 'N' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class N {

	public void nn(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && j > 1 && j < n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
