/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.example.zadanie1;

/**
 *
 * @author LITEL ZVER
 */
public class Dog extends Animal{
    private String toy;

    public Dog(String name, int age, String toy) {
        super(name, age);
        this.toy = toy;
    }
    
        public void doSound(){
         System.out.println(getName() + " Woof!");
    }
    
}
