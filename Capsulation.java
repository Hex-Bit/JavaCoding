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
public class Capsulation {
    
    public static void main(String[] args) {
        
        Employee employee1=new Employee();
        employee1.setId("162-15-8257");
        employee1.setName("Mahmudul Hasan");
        
        
        Employee employee2=new Employee();
        employee2.setId("162-15-8241");
        employee2.setName("Md. Farhaduzzaman");
        
        System.out.println("Id: "+employee1.getId()+"  Name: "+employee1.getName()+"\n"+"Id: "+employee2.getId()+"  Name: "+employee2.getName());
        
        
        
        
    }
  
    
}
class Employee
{
    private String Id;
    private String Name;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    
    
}