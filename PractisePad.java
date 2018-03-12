/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practisepad;

import java.util.Scanner;

/**
 *
 * @author 5H1MU7
 */
public class PractisePad {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Please Enter The number1 : ");
        int a=read.nextInt();
        
        System.out.print("Please Enter The number1 : ");
        int b=read.nextInt();
        
        System.out.print("The Sum is = ");
        System.out.println(a+b);
        
        System.out.println("");
        String s=read.nextLine();
        System.out.println(s);
        System.out.println("");
        
        System.out.print("Please Enter The Double number1 : ");
        double d=read.nextDouble();
        System.out.print("Please Enter The Double number2 : ");
        double d1=read.nextDouble();
        
        
        
        System.out.print("The Sum is = ");
        System.out.println(d+d1);
        
    }
    
    }
    
