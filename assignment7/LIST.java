/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author ELCOT
 */
public class LIST {
    
    public static void main(String[] args)
    {
       
        ArrayList<Integer> l1=new ArrayList<>();
        System.out.println("Enter the elements of list 1");
        for(int i=1;i<=10;i++)
        {
          Scanner obj=new Scanner(System.in);
          int a=obj.nextInt();
          l1.add(a);
        }
        //System.out.println(l1);
         ArrayList<Integer> l2=new ArrayList<>();
        System.out.println("Enter the elements of list 2");
        for(int i=1;i<=10;i++)
        {
          Scanner obj=new Scanner(System.in);
          int b=obj.nextInt();
          l2.add(b);
        }
        System.out.println("FIRST ARRAY");
        System.out.println(l1);
        System.out.println("SECOND ARRAY");
        System.out.println(l2);
        similar s = new similar();
        s.intersect(l1,l2);
    }
}

class similar
{   
  ArrayList<Integer> l3=new ArrayList<>(); 
  
  void intersect(ArrayList<Integer>l1,ArrayList<Integer>l2)
  {
     for(int i=0;i<10;i++) 
     {
        for(int j=0;j<10;j++) 
        {
          if(l1.get(i)==l2.get(j)) 
          {
            int v=l1.get(i);
            l3.add(v);
          }
        }
     }
     System.out.println("RESULTANT ARRAY");
     System.out.println(l3);
  }
}
