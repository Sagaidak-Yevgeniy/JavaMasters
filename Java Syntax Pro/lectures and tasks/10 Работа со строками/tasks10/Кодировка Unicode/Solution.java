package com.javarush.task.pro.task09.task0910;

/* 
Кодировка Unicode
В публичный статический метод init(char[]) передается массив символов размером 9, который нужно заполнить следующими символами:
0 - '\u00A9'
1 - '\u004A'
2 - '\u0061'
3 - '\u0076'
4 - '\u0061'
5 - '\u0052'
6 - '\u0075'
7 - '\u0073'
8 - '\u0068'

Чтобы посмотреть результат, запусти метод main().

Требования:
•	Нужно, чтобы метод init(char[]) заполнял полученный массив символов согласно условию.
*/

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //напишите тут ваш код
    }
}
