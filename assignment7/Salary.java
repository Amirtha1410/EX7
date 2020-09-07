/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class Salary {
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<employee> list=new ArrayList<>();
        for(int i=1;i<=2;i++)
        {
          System.out.println("Enter name of employee"+i+" :");
          String n=obj.next();
          System.out.println("Enter salary :");
          double s=obj.nextDouble();
          employee e=new employee(n,s);
          list.add(new employee(n,s));
        }
        System.out.println("LIST BEFORE SORTING");
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println("\nSORTED LIST");
        System.out.println(list);
        
    }
}
class employee
{
    String name;
    double salary;
    
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\n\nEMPLOYEE DETAILS\nEMPLOYEE NAME:"+name+"\nSALARY:"+salary;
    }
}

class namesort implements Comparator<employee>
{
@Override
public int compare(employee e1,employee e2)
{
    System.out.println("\n"+e1.name+"-----"+e2.name);
    return e1.name.compareTo(e2.name);
}

}