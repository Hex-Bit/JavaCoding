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
public class Class1 {
    int c,a,b;
    public void add()
    {
        c=a+b;
    }
    
    
}
class Class2 extends Class1 //Single Level Inheritance
{
    
    public void sub()
    {
        c=a-b;
        
    }
    
    
}
class class3 extends Class2
{
    public void mul()
    {
        c=a*b;
    }
     public void div()
    {
        c=a/b;
    }
    
}
