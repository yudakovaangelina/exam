/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie6 {

    public static void main(String[] args) {
        
        System.out.println("Введите путь к файлу");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        File zadanieFile = new File(path + "/zadaniefile.txt");
        
        System.out.println("Введите текст");
       String text = scan.nextLine();
          
       try {
           FileWriter fw = new FileWriter(zadanieFile);
           
               fw.write(text);
           
           fw.close();
       }catch(IOException ex){
           System.out.println("Произошла ошибка: " +ex.getMessage());
       }
        System.out.println(text.length());
    }
}
