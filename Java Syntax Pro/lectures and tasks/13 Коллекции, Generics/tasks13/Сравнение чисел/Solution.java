package com.javarush.task.pro.task12.task1203;

/* 
Сравнение чисел
В классе Solution есть три поля с одинаковыми значениями. В методе main происходит их сравнение с выводом результата в консоли.
Добавь использование метода equals() в методе main такое минимальное количество раз, чтобы вывод был:
true
true
true

Требования:
•	Поля класса Solution изменять нельзя.
•	Вывод должен соответствовать условию.
•	Добавь использование метода equals() минимальное количество раз.
*/

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first == second);
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
