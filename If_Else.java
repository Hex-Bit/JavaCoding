/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.util.Scanner;

/**
 *
 * @author 5H1MU7
 */
public class If_Else {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=read.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println(a);
                
            } else {
                System.out.println(c);
            }
            
        } else {
            if (c>b) {
                System.out.println(c);
                
            } else {
                System.out.println(b);
            }
        }
        
        
    }
    
}
