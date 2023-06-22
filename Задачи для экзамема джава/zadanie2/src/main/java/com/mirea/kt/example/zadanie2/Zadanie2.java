/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie2;

import java.util.Scanner;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);

        // Reverse the string
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        // Convert string to uppercase
        sb = new StringBuilder(input.toUpperCase());
        System.out.println("Uppercase string: " + sb);

        // Convert string to lowercase
        sb = new StringBuilder(input.toLowerCase());
        System.out.println("Lowercase string: " + sb);

        
          String replacedString = input.replaceAll("[aeiouAEIOU]", "*");
          System.out.println("Lowercase string: " + replacedString);
        
    }
  
    }

