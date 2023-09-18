/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

/**
 *
 * @author mashalbutt
 */
import java.util.*;
public class Assignment1 {

    public static void main(String[] args)
    {
     Scanner obj=new Scanner(System.in);
        Library lb=new Library();
        System.out.println("loaded from file");
        lb.loadfromfile();
        int s=0;
      
       do
       {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Library Management System Menu");
        System.out.println("1.  Add Book");
        System.out.println("2.  Edit Book");
        System.out.println("3.  Delete Book");
        System.out.println("4.  View All");
        System.out.println("5.  View Book By ID");
        System.out.println("6.  Hot Picks");
         System.out.println("7. Borrow Items");
          System.out.println("8.  Display the borrowers");
           System.out.println("9.  Exit");
        System.out.println("Enter your choice:");
        s=  obj.nextInt();
       
     
        switch(s)
          
        {
            case 1:
        {
            lb.addItem();
            break;
        }
            case 2:
        {
            System.out.println("Enter the id of book to edit");
          
            int y=obj.nextInt();
              System.out.println("Before editing");
            lb.displayonebook(y);
            lb.editItem(y);
            System.out.println("After editing");
          lb.displayonebook(y);
            break;
        }
            case 3:
        {
            System.out.println("Enter the id of book to delete:");
            int x=obj.nextInt();
            lb.deleteItem(x);
            break;
        }
            case 4:
        {
            lb.displayallbooks();
            break;
        }
            case 5:
        {
            System.out.println("enter the id you want to display:");
         
             int ed=obj.nextInt();
             Item Display = null;
    for (int i=0;i<lb.itemsList.size();i++)
       {
       
         Item item = lb.itemsList.get(i);
        if (item.idc == ed)
        {
            Display = item;
            break; 
        }
    }
    if (Display != null)
    {
        lb.displayonebook(Display);
    } 
    
    else 
    {
        System.out.println("Item with ID " + Display + " not found.");
    }
            break;
           
   }
            case 6:
            {
                System.out.println("Hot Picks:");
                lb.displayHotPicks();
                break;
            }
            case 7:
            {  
              lb.borrowItem();
               break;
           
            }
            case 8:
            {
                lb.displayBorrowers();
            }
            case 9:
            {
                break;
            }
            default:
            {
                 System.out.println("Invalid choice. Please try again.");
                 break;
            }
               
        }
      
         
         

 }while(s!=9);
    }
}