package com.javarush.task.pro.task13.task1307;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 2
В классе Solution объявлены методы: reverse(ArrayList<Integer>), sort(ArrayList<Integer>), rotate(ArrayList<Integer>, int), shuffle(ArrayList<Integer>). Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при этом только соответствующие методы класса Collections.

Требования:
•	В классе Solution должен быть публичный статический метод reverse(ArrayList<Integer>) с типом возвращаемого значения void.
•	В классе Solution должен быть публичный статический метод sort(ArrayList<Integer>) с типом возвращаемого значения void.
•	В классе Solution должен быть публичный статический метод rotate(ArrayList<Integer>, int) с типом возвращаемого значения void.
•	В классе Solution должен быть публичный статический метод shuffle(ArrayList<Integer>) с типом возвращаемого значения void.
•	Метод reverse(ArrayList<Integer>) нужно переписать, используя метод reverse класса Collections.
•	Метод sort(ArrayList<Integer>) нужно переписать, используя метод sort класса Collections.
•	Метод rotate(ArrayList<Integer>, int) нужно переписать, используя метод rotate класса Collections.
•	Метод shuffle(ArrayList<Integer>) нужно переписать, используя метод shuffle класса Collections.
*/

public class Solution {

    public static void reverse(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
            Integer integer = list.get(i);
            list.set(i, list.get(j - i));
            list.set(j - i, integer);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list.get(j - 1) > list.get(j)) {
                    temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        for (int i = 0; i < distance; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndexToSwap = rand.nextInt(list.size());
            int temp = list.get(randomIndexToSwap);
            list.set(randomIndexToSwap, list.get(i));
            list.set(i, temp);
        }
    }
}
