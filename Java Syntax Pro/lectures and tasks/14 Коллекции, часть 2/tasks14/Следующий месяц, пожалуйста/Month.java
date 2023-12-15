package com.javarush.task.pro.task13.task1318;

/*
Следующий месяц, пожалуйста
В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц, а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
Метод main не участвует в проверке.

Требования:
•	Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
•	В методе getNextMonth должны использоваться методы ordinal() и values().
 */
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
