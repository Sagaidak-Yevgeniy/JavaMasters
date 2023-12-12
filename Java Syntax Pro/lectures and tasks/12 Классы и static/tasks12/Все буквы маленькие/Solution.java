package com.javarush.task.pro.task11.task1120;

import java.util.Scanner;

/* 
Все буквы маленькие
Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре. Исправь ошибку в коде, чтобы программа работала корректно.

Требования:
•	Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        line.toLowerCase();
        System.out.println(line);
    }
}
