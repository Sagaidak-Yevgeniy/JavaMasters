package com.javarush.task.pro.task11.task1116;

/* 
Правильный класс
Исправь ошибки в коде, чтобы программа компилировалась и работала.

Требования:
•	Программа должна компилироваться и работать.
•	В программе должен быть публичный класс Solution.
•	В программе должен быть класс Cat.
*/

class solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
public class Cat {
    String name = "Tom";
}