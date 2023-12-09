package com.javarush.task.pro.task05.task0515;

import java.util.Arrays;

/* 
Сравнение двумерных массивов
Исправь работу метода main(String[]), который выводит в консоли true, если arrayFirst равняется arraySecond, иначе — false.

Требования:
•	Если arrayFirst равняется arraySecond, то метод main(String[]) выводит в консоли true.
•	Если arrayFirst не равняется arraySecond, то метод main(String[]) выводит в консоли false.
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(arrayFirst == arraySecond);
    }
}
