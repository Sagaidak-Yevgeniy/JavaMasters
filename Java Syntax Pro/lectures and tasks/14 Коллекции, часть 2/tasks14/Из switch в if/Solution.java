package com.javarush.task.pro.task13.task1321;

/*
Из switch в if
В классе Solution есть метод getTranslationForDayOfWeek(String), который возвращает перевод дня недели с русского на английский. Твоя задача — переписать метод, используя только оператор if-else.

Требования:
•	Метод getTranslationForDayOfWeek(String) должен возвращать перевод дня недели с русского на английский.
•	В методе getTranslationForDayOfWeek(String) должен использоваться только оператор if-else.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        switch (ru.toLowerCase()) {
            case "понедельник":
                en = "Monday";
                break;
            case "вторник":
                en = "Tuesday";
                break;
            case "среда":
                en = "Wednesday";
                break;
            case "четверг":
                en = "Thursday";
                break;
            case "пятница":
                en = "Friday";
                break;
            case "суббота":
                en = "Saturday";
                break;
            case "воскресенье":
                en = "Sunday";
                break;
            default:
                en = "Недействительный день недели";
        }
        return en;

    }
}
