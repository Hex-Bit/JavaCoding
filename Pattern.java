/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author 5H1MU7
 */
public class Pattern {

    public static void main(String[] args) {
        int i, j;
        int d = 0;
        for (i = 1; i <= 5; i++) {
            for (j =5; j>i; j--) {
                System.out.print("*");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println("");
        }
    }

}
