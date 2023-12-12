package com.javarush.task.pro.task11.task1128;

/* 
Текстовые цифры
Программа преобразует цифры в текст. В классе Solution есть статический метод digitToText(char), который возвращает текстовое представление цифр. В методе main число переводится в текстовое представление, но выводится только "девять девять ... ". Добавь в метод digitToText(char) нужное количество операторов break, чтобы он возвращал правильное текстовое представление цифры. Метод main не участвует в проверке.

Требования:
•	В классе Solution должен быть статический публичный метод digitToText(char) с типом возвращаемого значения String.
•	Метод digitToText(char) должен возвращать текстовое представление соответствующей цифры.
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "ноль";
            case '1':
                result = "один";
            case '2':
                result = "два";
            case '3':
                result = "три";
            case '4':
                result = "четыре";
            case '5':
                result = "пять";
            case '6':
                result = "шесть";
            case '7':
                result = "семь";
            case '8':
                result = "восемь";
            case '9':
                result = "девять";
        }
        return result;
    }
}
