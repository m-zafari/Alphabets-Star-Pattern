/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class Z {
	public void zz(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i+j == n+1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
