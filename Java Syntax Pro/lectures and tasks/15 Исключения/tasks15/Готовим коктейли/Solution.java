package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
Метод printStackTrace принимает в качестве параметра массив stackTrace. Нужно вывести информацию о каждом элементе массива в формате:
"Метод <имя метода> вызван из строки <номер строки> класса <имя класса> в файле <имя файла>."
Информацию о каждом элементе выводи с новой строки.

Пример:
Метод addJuice вызван из строки 24 класса com.javarush.task.pro.task14.task1414.Solution в файле Solution.java.

Требования:
•	Метод printStackTrace должен выводить информацию о каждом элементе массива stackTrace.
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишите тут ваш код
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
