/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mashalbutt
 */
class magazine extends Item
{
    
    private String publisher;
    private List<String>authorsList=new ArrayList<>();
    magazine(String t,String p,List<String>a)
    {
       super(t);
       publisher=p;
       authorsList=a;
    }
    public void setPublisher(String pu)
    {
      this.publisher=pu;
    }
    public void setauthorsList(List<String>a)
    {
        this.authorsList=a;
        
    }
    public String getPublisher()
    {
       return publisher; 
    }
    public List<String> getAuthorList()
    {
       return authorsList;
    }
    @Override
     public void displayInfo()
     {
         
        System.out.println( "id:"+idc+" Title:" + title+"  "+"Authors:" +authorsList +" "+"Publisher Company:"+publisher);
     }
}
