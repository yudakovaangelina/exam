/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.example.zadanie1;

/**
 *
 * @author LITEL ZVER
 */
public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        
    }
    
    
    
    
     public void doSound() {
         System.out.println(getName() + " Meow!");
    }
    
}
