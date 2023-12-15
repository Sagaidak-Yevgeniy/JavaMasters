package com.javarush.task.pro.task13.task1317;

/* 
Трансформируем enum в класс
Пришло время раскрыть все карты и понять, как на самом деле работает enum. Тебе нужно из enum Month сделать class, а также добавить и реализовать методы ordinal() и values().

Требования:
•	В отдельном файле должен быть класс Month.
•	В классе Month должен быть только один приватный конструктор с одним параметром типа int.
•	В классе Month должно быть 12 констант типа Month.
•	В классе Month метод values() должен возвращать массив со всеми константами.
•	В классе Month метод ordinal() должен возвращать порядковый номер элемента(константы).
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
