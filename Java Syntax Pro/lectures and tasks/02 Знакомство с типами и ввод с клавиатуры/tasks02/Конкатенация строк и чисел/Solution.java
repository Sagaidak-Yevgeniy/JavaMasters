package com.javarush.task.pro.task02.task0209;

/* 
Конкатенация строк и чисел
В переменную digits нужно записать строку "60".
Используй переменные x, y, z, пустую строку и конкатенацию строк.

Требования:
•	Не изменяй значения переменных x, y, z.
•	Для инициализации переменной digits используй x, y, z, пустую строку и конкатенацию строк.
•	Программа должна выводить на экран переменную digits.
*/

public class Solution {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = x+y+ "" + z; //напишите тут ваш код

        System.out.println(digits);
    }
}
