/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.Scanner;

/**
 *
 * @author 5H1MU7
 */
public class Inheritance {
    
    public static void main(String[] args) {
        class3 class3=new class3();
        class3.a=20;
        class3.b=15;
        System.out.println("Press 1 For add"+"\n"+"Press 2 For sub"+"\n"+"Press 3 For mul"+"\n"+"Press 4 For div"+"\n"+"Exit");
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
            switch(a)
        {
            case 1:
                class3.add();
        System.out.println(class3.c);
        break;
        
        case 2:
                class3.sub();
        System.out.println(class3.c);
        break;
        
        case 3:
                class3.mul();
        System.out.println(class3.c);
        break;
        
        case 4:
                class3.div();
        System.out.println(class3.c);
        break;
        
        case 5:
                
        System.out.println("Termination");
        break;
        }
            

        
        
        
        
        
    }
    
}
