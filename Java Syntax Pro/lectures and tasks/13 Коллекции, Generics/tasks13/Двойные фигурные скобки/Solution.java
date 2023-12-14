package com.javarush.task.pro.task12.task1219;

import java.util.ArrayList;

/* 
Двойные фигурные скобки
В методе main создается список ArrayList<String>, присваивается переменной var strings и заполняется пятью элементами.
Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.

Требования:
•	Список strings должен заполняться пятью элементами в двойных фигурных скобках.
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("Так");
        strings.add("тоже");
        strings.add("можно");
        strings.add("делать");
        strings.add("!");
    }
}
