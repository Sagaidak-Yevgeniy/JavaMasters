package com.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 3
В классе Solution объявлены методы: min(ArrayList<Integer>), max(ArrayList<Integer>), frequency(ArrayList<Integer>, Integer), binarySearch(ArrayList<Integer>, Integer). Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при этом только соответствующие методы класса Collections.

Требования:
•	В классе Solution должен быть публичный статический метод min(ArrayList<Integer>) с типом возвращаемого значения Integer.
•	В классе Solution должен быть публичный статический метод max(ArrayList<Integer>) с типом возвращаемого значения Integer.
•	В классе Solution должен быть публичный статический метод frequency(ArrayList<Integer>, Integer) с типом возвращаемого значения int.
•	В классе Solution должен быть публичный статический метод binarySearch(ArrayList<Integer>, Integer) с типом возвращаемого значения int.
•	Метод min(ArrayList<Integer>) нужно переписать, используя метод min класса Collections.
•	Метод max(ArrayList<Integer>) нужно переписать, используя метод max класса Collections.
•	Метод frequency(ArrayList<Integer>, Integer) нужно переписать, используя метод frequency класса Collections.
•	Метод binarySearch(ArrayList<Integer>, Integer) нужно переписать, используя метод binarySearch класса Collections.
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        if (element == null) {
            return frequency;
        } else {
            for (Integer integer : list) {
                if (element.equals(integer)) {
                    frequency++;
                }
            }
        }
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int low = 0;
        int high = list.size() - 1;
        int mid = (low + high) / 2;
        int index = -1;
        while (low <= high) {
            if (list.get(mid) < key) {
                low = mid + 1;
            } else if (list.get(mid).equals(key)) {
                index = mid;
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return index;
    }
}
