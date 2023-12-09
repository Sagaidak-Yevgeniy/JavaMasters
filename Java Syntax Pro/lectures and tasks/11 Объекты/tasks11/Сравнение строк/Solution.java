package com.javarush.task.pro.task10.task1009;

/* 
Сравнение строк
В методе main объявлены переменные типа String. В консоли выводится результат их сравнения: если строки равны, выводится true, иначе — false. Тебе нужно раскомментировать одну строку, чтобы получился следующий вывод:
true
true

Тело метода main менять нельзя: можно только раскомментировать одну строку.

Требования:
•	В методе main нужно только раскомментировать одну строку: добавлять или изменять остальной код нельзя.
•	Вывод должен соответствовать условию.
*/

public class Solution {

    public static void main(String[] args) {
        String s1 = new String("JavaRush");
//        s1 = "JavaRush";
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
