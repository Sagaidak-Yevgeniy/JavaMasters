package com.javarush.task.pro.task12.task1217;

/* 
Назад в прошлое
В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными. Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя), а также починить геттер и сеттер поля intArray.

Пример:
var console = new Scanner(System.in);
Заменить на:
Scanner console = new Scanner(System.in);

Требования:
•	Замени типы переменных c var на конкретный тип объекта.
•	Почини геттер и сеттер для поля intArray.
*/

public class Solution {
    private var intArray = new int[4];

    public var getIntArray() {
        return intArray;
    }

    public void setIntArray(var intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        var solution = new Solution();
        var string = new String("Hello");
        var stringBuilder = new StringBuilder();
    }
}
