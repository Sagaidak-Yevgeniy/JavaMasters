package com.javarush.task.pro.task12.task1218;

import java.io.File;
import java.util.*;

/* 
Shine bright like a diamond
В методе main создаются объекты разных типов. В некоторых случаях тип элементов объекта можно опустить и просто использовать оператор diamond(<>).
Замени тип элементов объекта на оператор diamond там, где это возможно, не меняя левую часть выражений.
Порядок следования переменных не должен меняться.

Требования:
•	Замени тип элементов объекта на оператор diamond где это возможно.
•	Левую часть выражений изменять нельзя.
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
