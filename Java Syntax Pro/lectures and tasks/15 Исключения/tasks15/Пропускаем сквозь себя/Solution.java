package com.javarush.task.pro.task14.task1409;

/* 
Пропускаем сквозь себя
Сделай так, чтобы программа компилировалась, не используя try-catch.

Требования:
•	В методе main не должно быть блока try-catch.
•	Метод main должен бросать исключение.
•	Метод main должен вызывать метод generateLuckyNumber().
•	Метод generateLuckyNumber изменять нельзя.
*/

public class Solution {

    public static void main(String[] args) {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
