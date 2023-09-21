/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author mashalbutt
 */
class Book extends Item
{
   
    private String author;
    private int year;
    Book(String t,String a,int y,int pc,int c)
    {
         super(t,pc,c);
         this. author=a;
         this. year=y;
        
    }
    public void setAuthor(String autho)
    {
      this.author=autho;
    }
    public void setYear(int yr)
    {
        this.year=yr;
        
    }
    public String getAuthor()
    {
       return author; 
    }
    public int getYear()
    {
       return year;
    }
    @Override
  public void displayInfo()
     {
        System.out.println( "id:"+idc+" Title: " + title+"  "+"Authors:" +author+" "+"Year:"+year);
     }
    @Override
   public final double calculateCost()
     { 
         int iit=getPrice();
         double total=200+(0.2*iit)+iit;
         return total;
     }
}