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
public class Arithmetic {
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int a=read.nextInt();
        System.out.print("Enter The Second Number : ");
        int b=read.nextInt();
        
        
        System.out.println("The Sum is = "+(a+b));
        
        System.out.println("The Sub is = "+(a-b));
        
        System.out.println("The Mul is = "+(a*b));
        System.out.println("The Div is = "+(a/b));
        System.out.println("The Mod is = "+(a%b));
        
  
    }
    
}
