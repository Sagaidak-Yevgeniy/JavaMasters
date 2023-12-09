package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result. Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это.

Требования:
•	Реализуй метод main(String[]) согласно условию.
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(result));
    }
}
