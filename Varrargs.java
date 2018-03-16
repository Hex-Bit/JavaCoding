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
public class Varrargs {
    public static void main(String[] args)
    {
        show s=new show();
        s.show1(5,6,7,8,9);
    }
}


class  show
{
     public void show1(int ...a)
     {
         for (int i:a) 
         {
             System.out.println(i);
         }
     }
}