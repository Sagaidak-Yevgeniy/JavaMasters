package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Переворачивание данных
Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init(). Затем в методе reverse() происходит перестановка чисел в обратном порядке.
Твоя задача — переписать код так, чтобы вместо массива int[] numbers использовался список ArrayList<Integer> numbers.
Название методов и переменных не изменяй.
Методы main() и print() не принимают участие в проверке.

Требования:
•	Поле numbers должно быть типа ArrayList<Integer>.
•	Метод init() должен заполнять список numbers числами от 0 до 9.
•	Метод reverse() должен переставить значения списка numbers в обратном порядке.
*/

public class Solution {
    public static int[] numbers = new int[10];

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static void reverse() {
        int n = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i];
            numbers[n - i] = temp;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
