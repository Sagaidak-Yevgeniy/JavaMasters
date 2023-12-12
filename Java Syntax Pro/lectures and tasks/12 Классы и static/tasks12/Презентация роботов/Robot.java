package com.javarush.task.pro.task11.task1103;

/* 
Презентация роботов
В методе main создается 5 роботов и выводится информация о них.
Убери максимально возможное количество модификаторов static так, чтобы функционал программы не изменился.
В методе main менять ничего не нужно.

Требования:
•	Модификатор static должен быть расставлен правильно.
*/

public class Robot {

    public static int robotCounter;

    public static int id;

    public static String model;

    public static int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                 id, robotCounter, model, vendor, productionYear);
    }
}
