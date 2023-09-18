/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mashalbutt
 */
class newspaper extends Item
{
    Date date=new Date();
   private String publisher;
   

   newspaper(String t,String p,Date d,int pc)
   {
       super(t,pc);
       
       publisher=p;
       date=d;
   }
    public void setPublisher(String pu)
    {
      this.publisher=pu;
    }
    public void setDate(Date dt)
    {
        this.date=dt;
        
    }
    public String getPublisher()
    {
       return publisher; 
    }
    public Date getDate()
    {
       return date;
    }
    
   @Override
    public void displayInfo()
     {
          SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(date);
        System.out.println( "id:"+idc+" Title:" + title+"  "+"Authors:" +publisher+" "+"Date:"+formattedDate);
     }
}