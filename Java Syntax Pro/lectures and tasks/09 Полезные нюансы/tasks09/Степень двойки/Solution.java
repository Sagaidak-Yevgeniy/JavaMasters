package com.javarush.task.pro.task08.task0813;

/* 
Степень двойки
Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.

Требования:
•	В методе getPowerOfTwo(int) необходимо возвращать степень двойки.
•	В методе getPowerOfTwo(int) должен использоваться оператор побитового сдвига влево.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        for(int i = 0; i < power - 1; i++) {
            result *= 2;
        }
        return result;
    }
}
