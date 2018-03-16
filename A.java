/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author 5H1MU7
 */
public class A {
    public static void main(String[] args) {
        Best b=new Best();
        Best b1=new Best();
        Best b3=new Best();
        Best b2=new Best();
        b.cnt();
        
        
        
    }
    
}
class Best
{
    static int a;
    public Best()
    {
         a++;
    }
    public void cnt()
    {
        System.out.println(a);
    }
    
    
}
