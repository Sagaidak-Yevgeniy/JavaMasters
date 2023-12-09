package com.javarush.task.pro.task06.task0614;

/* 
Вспоминаем геометрию
Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями). Кроме этого такие константы должны быть переименованы согласно конвенции (заглавными буквами).

Подсказка: Переименовать переменную (и не только) во всей программе можно с помощью комбинации клавиш Shift+F6 (Intellij IDEA).

Требования:
•	Модификатор final должен быть установлен всем константам. Константы должны быть переименованы согласно конвенции.
*/

public class Solution {
    public static double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Плошадь круга равна: " + pi * radius * radius);
        System.out.println("Периметр круга равен: " + pi * diameter);
    }
}
