/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie1;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie1 {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Myrka", 2, "white");
        Animal cat2= new AbyssinianCat("Viski", 2, "red");
        Animal dog = new Dog("Mike", 5, "ball");
        
        cat1.doSound();
        cat2.doSound();
        dog.doSound();
    }
}
