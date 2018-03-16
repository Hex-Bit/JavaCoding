/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Random;

/**
 *
 * @author 5H1MU7
 */
public class Arr {
    public static void main(String[] args) {
        int a[]=new int[3];
        Random r=new Random();
        for (int i = 0; i < a.length; i++) {
            
            a[i]=r.nextInt(5);
            System.out.println(a[i]);
            
        }
        
        try {
            System.out.println(a[45]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This Is the Out of Bound");
        }
    }
    
}
