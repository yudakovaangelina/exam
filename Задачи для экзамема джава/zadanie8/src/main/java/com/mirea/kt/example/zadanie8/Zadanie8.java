/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie8 {

    public static void main(String[] args) {
        System.out.println("путь к файлу");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        Animal cat = new Animal("Whisky", 3);
        
        try(
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(str))) {
                out.writeObject(cat);
                
            }catch(IOException e){
                    System.out.println("error");
                    
        }
        
        
    }
}
