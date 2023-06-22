/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.example.zadanie4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author LITEL ZVER
 */
public class Zadanie4 {

    public static void main(String[] args) {
          // Создание объектов класса Person и добавление их в ArrayList
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanov", 25));
        persons.add(new Person("Nikolay", "Petrov", 35));
        persons.add(new Person("Anna", "Sidorova", 30));
        
        // Сортировка коллекции по имени
        Collections.sort(persons);
        
        // Вывод отсортированных объектов Person в консоль
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
