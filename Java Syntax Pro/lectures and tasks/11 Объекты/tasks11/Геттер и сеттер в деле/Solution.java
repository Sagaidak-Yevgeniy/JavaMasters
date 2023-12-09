package com.javarush.task.pro.task10.task1018;

/* 
Геттер и сеттер в деле
В классе Coordinate есть 2 геттера и 2 сеттера, но значения переменным сеттеры не устанавливают.
Разберись, почему так происходит и исправь. Метод main не участвует в проверке.

Требования:
•	В классе Coordinate должно быть два приватных не статических поля x, y типа int.
•	В классе Coordinate должен быть геттер getX для поля x.
•	В классе Coordinate должен быть геттер getY для поля y.
•	В классе Coordinate должен быть сеттер setX(int) для поля x.
•	В классе Coordinate должен быть сеттер setY(int) для поля y.
•	Сеттеры должны инициализировать соответствующие поля.
*/

public class Solution {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
