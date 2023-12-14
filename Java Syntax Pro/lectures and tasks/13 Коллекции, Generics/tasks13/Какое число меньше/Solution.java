package com.javarush.task.pro.task12.task1207;

/* 
Какое число меньше
Программа сравнивает два числа. Если первое число меньше второго, то в консоль выводится сообщение: Первое число меньше второго.
Если первое число больше второго или равно второму числу, то в консоль выводится сообщение: Первое число больше или равно второму числу.
Но на данный момент программа завершается с ошибкой. Разберись, что работает не так и исправь ошибку.
Метод main не принимает участие в проверке.

Требования:
•	Если первое число больше второго, то метод isLess(int, int) должен возвращать false.
•	Если первое число меньше второго, то метод isLess(int, int) должен возвращать true.
*/

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second ? true : null;
    }
}
