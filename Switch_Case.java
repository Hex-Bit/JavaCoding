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
public class Switch_Case {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String a=read.nextLine();
        switch(a)
        {
            case "01713914899":
                System.out.println("Shimul");
                break;
            case "01738570697":
                System.out.println("Farhad");
                break;
                
            case "01740868087":
                System.out.println("Abbu");
                break;
            case "01767518384":
                System.out.println("Amma");
                break;
            default:
                System.out.println("Unknown");
                break; 
        }
    }
}
