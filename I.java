/**
 *
 * print 'I' with '*'
 */
/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */


public class I {

	public void ii(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 || i == n || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
