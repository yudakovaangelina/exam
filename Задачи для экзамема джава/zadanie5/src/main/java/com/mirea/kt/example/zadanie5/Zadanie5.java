/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie5 {

    public static void main(String[] args) {
         HashMap<String, Integer> map = new HashMap<>();
        map.put("c", 1);
        map.put("e", 2);
        map.put("a", 3);
        map.put("b", 4);
        map.put("d", 5);
        
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        
        for(Entry<String, Integer> entr : sortedMap.entrySet()){
            String id = entr.getKey();
            int value1 = entr.getValue();
            System.out.println(id + " " + value1);
        }
        
    }
}
