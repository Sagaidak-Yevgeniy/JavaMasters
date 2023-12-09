package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
В этой задаче тебе нужно:

Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}

Требования:
•	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
•	В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
