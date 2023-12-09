package com.javarush.task.pro.task06.task0603;

/* 
Любимое блюдо
Переименуй параметры метода printPersonInfo():

firstName в name;
lastName в surname;
favouriteDish в meal;
таким образом, чтобы функционал программы остался неизменным.
Имена переменных в методе main() оставь без изменений.
Требования:
•	Параметры метода printPersonInfo() должны называться name, surname и meal.
•	Вывод в консоль должен соответствовать условию задачи.
•	В методе main() переменные firstName, lastName, favouriteDish должны остаться без изменений.
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }
    
    public static void printPersonInfo(String firstName, String lastName, String favouriteDish){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Любимое блюдо: " + favouriteDish);
    }
    
}
