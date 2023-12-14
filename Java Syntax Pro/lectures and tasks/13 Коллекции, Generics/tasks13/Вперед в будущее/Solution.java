package com.javarush.task.pro.task12.task1216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вперед в будущее
В классе Solution есть поля number, string и метод main с объявленными в нем переменными. Тебе нужно заменить объявления переменных на var, где это возможно. Порядок следования переменных не должен меняться.

Пример:
Scanner console = new Scanner(System.in);
Заменить на:
var console = new Scanner(System.in);

Требования:
•	Замени типы переменных на var, где это возможно.
•	Не изменяй правую часть выражений.
*/

public class Solution {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {
        int integer = 22;
        String string = "string";
        int[] array = new int[5];
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);
    }
}
