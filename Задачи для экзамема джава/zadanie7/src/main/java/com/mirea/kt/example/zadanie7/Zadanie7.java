/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie7 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Введите путь к файлу");
         String path = scan.nextLine();
         System.out.println("Введите имя файла"); 
         String fileName = scan.nextLine();
         
         File firstFile = new File(path, fileName);
     
         try {
           Scanner reading = new Scanner(firstFile);
           String line = reading.nextLine();
            String replacedString = line.replaceAll("[aeiouAEIOU]", "");
          System.out.println("Lowercase string: " + replacedString);
           
         
           reading.close();
           } catch (IOException ex) {
                   System.out.println("Произошла ошибка: " + ex.getMessage());
           }
          
    }
}
