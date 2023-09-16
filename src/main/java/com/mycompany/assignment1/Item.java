/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author mashalbutt
 */

 class Item implements Configuration
{
   public String title;
   private boolean isBorrowed;
  private int popularityCount;
   public static int id=1;
   public int idc;
   private int cost;
   Item(String t)
   {
      this.idc=id++;
       title=t;
      
   }

    Item() 
    {
       title="";
       isBorrowed=true;
       popularityCount=0;
       cost=0;
       
    }
     public void setisborrowed(boolean tt)
   {
       isBorrowed=tt;
   }
     public boolean getisborrowed()
     {
         return isBorrowed;
     }
     public void setpopularityCount(int pc)
     {
         popularityCount=pc;
     }
     public int getpopularityCount()
     {
         return popularityCount;
     }
   public void settitle(String tt)
   {
       title=tt;
   }
   public String gettitle()
           
   {
       return title;
   }
   
   @Override
   public void displayInfo()
   {
       
    
   }
//   public int calculateCost()
//   {
//       return 0;
//   }
}

