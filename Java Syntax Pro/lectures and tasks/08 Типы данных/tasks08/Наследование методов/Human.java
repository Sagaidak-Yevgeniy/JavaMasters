package com.javarush.task.pro.task07.task0715;


/*
Наследование методов
Правильно унаследуй классы:

человека — от существа;
Java-девелопера — от человека.
Удали дублирующие методы.
Требования:
•	Класс Human должен наследоваться от класса Entity.
•	Класс JavaDeveloper должен наследоваться от класса Human.
•	Дублирующих методов не должно быть.
 */
public class Human {
    public void move(){
        System.out.println("Я передвигаюсь.");
    }

    public void eat(){
        System.out.println("Я ем.");
    }

    public void speak(){
        System.out.println("Я умею общаться.");
    }
}
