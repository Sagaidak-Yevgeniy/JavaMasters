package com.javarush.task.pro.task06.task0604;

/* 
Ливерпульская четверка
Метод createCrew() выводит должности и имена членов экипажа космического корабля.
Во избежание путаницы внутри метода, измени имена параметров createCrew(), чтобы они соответствовали именам переменных, которые передаются в метод:

name1 в navigator
name2 в pilot
name3 в secondPilot
name4 в flightEngineer
При этом результат выполнения программы не должен измениться.
Требования:
•	Параметры метода createCrew() должны называться navigator, pilot, secondPilot и flightEngineer.
•	Вывод в консоли должен соответствовать условию задачи.
•	В методе main() переменные navigator, pilot, secondPilot и flightEngineer должны остаться без изменений.
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Ринго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String name1, String name2, String name3, String name4){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + name1);
        System.out.println("Пилот: " + name2);
        System.out.println("Второй пилот: " + name3);
        System.out.println("Бортинженер: " + name4);
    }
}
