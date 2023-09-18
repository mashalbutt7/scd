/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author mashalbutt
 */
public class Borrower {
    private String name;
    public static int id=1;
    public int  iddd;
    Borrower(String n)
    {
        this.name=n;
        iddd=id++;
    }
    public void setBorrower(String n)
    {
        this.name=n;
    }
    public String getBorrower()
    {
        return name;
    }
    public int getId()
    {
        return iddd;
    }
   
}
