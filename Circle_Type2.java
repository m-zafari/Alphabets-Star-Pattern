/*
 * print filled C(0,R) with star ;
 */

/**
 *
 * @author MohammadZafari <mhdzafari80@gmail.com>
 */
public class Circle_Type2 {

    public void c2 (int R) {
        int x, y;
        for (int i = 0; i <= 2 * R; i++) {
            for (int j = 0; j <= 2 * R; j++) {
                x = i - R;
                y = j - R;
                if ((x * x + y * y <= R * R + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
