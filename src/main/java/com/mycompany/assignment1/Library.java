/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mashalbutt
 */
class Library
{
  
    
 List<Item> itemsList=new ArrayList<>();
   
    Library()
    {
      // itemsList =new ArrayList<>();
    }
    public void addItem()
    { 
        Scanner objo=new Scanner(System.in);
        System.out.println("Enter 1 for Book,2 for magazine,3 for newspaper");
        int c=objo.nextInt();
        objo.nextLine(); 
        switch (c)
        {
            case 1:
                System.out.println("enter the title of book:");
                String t=objo.nextLine();
                System.out.println("enter the author of book:");
                String a=objo.nextLine();
                 System.out.println("enter the year of book:");
                int y=objo.nextInt();
                Book bb=new Book(t,a,y);
                itemsList.add(bb);
                break;
            case 2:
                System.out.println("enter the title of the magazine:");
                String mt=objo.nextLine();
                System.out.println("enter the authors of the magazine and to exit press\".\":");
                 List<String>authorss=new ArrayList();
                      
               while(true)
               {
                   
                
                String at=objo.nextLine();
                if(at.equalsIgnoreCase("."))
                {
                    break;
                }
              
               
                 authorss.add(at);
                
                
               }
                System.out.println("enter the publisher company of the magazine:");
                String pc=objo.nextLine();
                magazine mm=new magazine(mt,pc,authorss);
                itemsList.add(mm);
                
               
               break;
            case 3:
                Date ddi=new Date();
                System.out.println("enter the title of the newspaper:");
                String nt=objo.nextLine();
                System.out.println("enter the author of the newspaper:");
                String am=objo.nextLine();
               
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print("Enter a date (dd-MM-yyyy): ");
        String userInput = objo.nextLine();
  Date date=null;
        try {
             date = dateFormat.parse(userInput);
                        
             } catch (ParseException e) {
            System.err.println("Invalid date format. Please use dd-MM-yyyy.");
        }
               
                newspaper nn=new newspaper(nt,am,date);
                itemsList.add(nn);
                break;
            default:
                System.out.print("Enter a valid number");
                
               }
       
        displayallbooks();
    }
    
    public void editItem(int id)
    {
        Scanner input = new Scanner(System.in);
        String s="";
        Item item;
        Scanner nn=new Scanner(System.in);
         for (int i = 0; i < itemsList.size(); i++) 
        {
          item = itemsList.get(i);
        if (item.idc == id)
           {
           
            
           if(item instanceof Book)
           {
                System.out.println("Enter new title:");
                       item.settitle(input.nextLine());
                Book book = (Book) item; // Cast to Book
                System.out.println("Enter new author and press . to exit :");
                book.setAuthor(input.nextLine());
                System.out.println("Enter new year:");
                book.setYear(input.nextInt());
                  
           }
           if(item instanceof newspaper)
           {
               newspaper ne=(newspaper)item;  //cast krdo item ko newspaper pr
               System.out.println("Enter new title:");
                       item.settitle(input.nextLine());
                       System.out.println("Enter new publisher:");
                       ne.setPublisher(input.nextLine());
                       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

                  System.out.print("Enter a date (dd-MM-yyyy): ");
        String userInput = input.nextLine();
  Date date=null;
  
        try {
             date = dateFormat.parse(userInput);
             ne.setDate(date);
           
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use dd-MM-yyyy.");
        }

                   
                  
                      

           }
           if(item instanceof magazine)
           {
               magazine m=(magazine)item;
                 System.out.println("Enter new title:");
                       item.settitle(input.nextLine());
                 System.out.println("Enter new authors:");
              List<String>authorss=new ArrayList();
                      
               while(true)
               {
                   
                
                String at=input.nextLine();
                if(at.equalsIgnoreCase("."))
                {
                    break;
                }
              
               
                 authorss.add(at);
                
                
               }
                   m.setauthorsList(authorss);
                   System.out.println("Enter new Publishing Company:");
                   m.setPublisher(input.nextLine());
                      
               
           }
           
  }
//        
     }
    }
       

    public boolean deleteItem(int idd)
    { 
      System.out.println("Before deletion:");
      displayallbooks();
    for (int i = 0; i < itemsList.size(); i++) 
    {
        Item item = itemsList.get(i);
        if (item.idc == idd)
        {
            itemsList.remove(i);
               System.out.println();
            System.out.println("After deletion the remaining rows are:");
         
            displayallbooks();
            return true;
        }
    }
    // Item with the specified ID was not found
    System.out.println("No item with ID " + idd + " found.");
    return false;
}

  
    
    

    public void displayallbooks()
    {
        
        for (int i = 0; i < itemsList.size(); i++) {
        Item item = itemsList.get(i);
        item.displayInfo();
    }
    }

   
    public void displayonebook(int id)
    {
        for(int i=0;i<itemsList.size();i++)
        {
         Item item = itemsList.get(i);
           if (item.idc == id)
        {
            item.displayInfo();
            break;
        }
          
    }
        
             
    }
    public void loadfromfile()
    {
        {
       
        String filePath = "data.txt";

        try 
        {
            
            File f = new File(filePath);
            Scanner file= new Scanner(f);
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                String[] p=line.split(","); //splitting the line we read by commas to read the values
                int idd=Integer.parseInt(p[0]); //pehle wala determine karega item ki type
                String title=p[1];
                if(idd==1)//book case
                {
                    String author=p[2];
                    int year=Integer.parseInt(p[3]);
                   
                    Book b=new Book(title,author,year);
                    itemsList.add(b);
                    
                }
                
                /////////////////////////////////////////
              if(idd==2)//magazine case
              {
               List<String> author=new ArrayList<>();
               System.out.println();
               
               String joinedString = String.join(",", p);
               String[] p1 = joinedString.split(",");
               String result="";
               String b="";
                if (p1.length >= 3) 
                {
                  result = String.join(",", Arrays.copyOfRange(p1, 2, p1.length));
                
                }      
                else 
                {
          System.out.println("Not enough elements in the input string.");
                }
            
            int count=1;
for (int i = 0; i < result.length(); i++) 
{
    if(result.charAt(i) == ',') 
    {
        author.add(b); // Add the current author to the list
        b = ""; // Reset 'b'
        count++;
    } 
    else if (result.charAt(i) == '.') 
    {
        author.add(b); // Add the current author along with the full stop to the list
        b = ""; // Reset 'b'
        break; // Exit the loop after encountering the full stop
    } 
    else 
    {
        b = b + result.charAt(i);
    }
   
  
}
       
                 String pu=p[count+2];
                 magazine m=new magazine(title,pu,author);
                 itemsList.add(m);
                 
              }
                ////////////////////////////////// 
              
                if(idd==3)//newspaper case
                {
                    String publisher=p[2];  
                     String d=p[3];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date hi = null;
   try {
            // Parse the string into a Date object
            Date dd = dateFormat.parse(d);
             
            // Now you can use the 'date' object as a Date
           hi=dd;
        } 
   catch (ParseException e) 
        {
            // Handle parsing exception
            e.printStackTrace();
        }
                   
                    newspaper n=new newspaper(title,publisher,hi);
                    itemsList.add(n);
                }
            }
           

            // Close the Scanner to release resources
            file.close();
        } catch (FileNotFoundException e) 
        {
            // Handle the case where the file is not found
            System.err.println("File not found: " + filePath);
        }
        catch (NumberFormatException g) 
        {
            // Handle the case where the number is not found
            System.err.println("");
        }
    }
   
    }
    public void viewborrowerslist()
    {
        
    }
    public boolean borrowItem()
    {
        return true;
    }
    
}

