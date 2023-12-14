package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
Реализуй методы countDigits(String), countLetters(String), countSpaces(String), которые должны возвращать количество цифр, букв и пробелов в строке.
Метод main не принимает участия в проверке.

Требования:
•	Метод countDigits(String) должен возвращать количество цифр в переданной строке.
•	Метод countLetters(String) должен возвращать количество букв в переданной строке.
•	Метод countSpaces(String) должен возвращать количество пробелов в переданной строке.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
    }
}
