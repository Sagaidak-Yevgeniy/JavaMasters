package com.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Найти и обезвредить
В классе Solution объявлены методы, которые тебе нужно реализовать следующим образом:

removeBugWithFor(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for и счетчик.
removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл while и метод iterator().
removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for-each и копию списка.
В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
Метод main реализован для вашего кода и не участвует в проверке.
Требования:
•	В классе Solution должен быть публичный статический метод removeBugWithFor(ArrayList<String>) с типом возвращаемого значения void.
•	В классе Solution должен быть публичный статический метод removeBugWithWhile(ArrayList<String>) с типом возвращаемого значения void.
•	В классе Solution должен быть публичный статический метод removeBugWithCopy(ArrayList<String>) с типом возвращаемого значения void.
•	Метод removeBugWithFor(ArrayList<String>) должен работать согласно условию.
•	Метод removeBugWithWhile(ArrayList<String>) должен работать согласно условию.
•	Метод removeBugWithCopy(ArrayList<String>) должен работать согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишите тут ваш код
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишите тут ваш код
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код
    }
}
