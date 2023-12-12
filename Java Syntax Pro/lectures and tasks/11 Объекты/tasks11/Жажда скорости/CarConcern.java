package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
Почувствуй себя автоконструктором и найди решение, как сделать так, чтобы завод снова заработал.
 Для этого тебе нужно добавить инициализацию полей в конструкторах соответствующими параметрами.
  Если параметр отсутствует, то нужно инициализировать поле значением по умолчанию. Для поля year это текущий год (4321), для поля color — Оранжевый.

Требования:
•	В классе CarConcern должно быть четыре приватных final поля.
•	В классе CarConcern должен быть публичный конструктор с тремя параметрами, который инициализирует соответствующие поля.
•	В классе CarConcern должен быть публичный конструктор с двумя параметрами, который инициализирует соответствующие поля.
•	В классе CarConcern должен быть публичный конструктор с одним параметром, который инициализирует соответствующие поля.
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        //напишите тут ваш код
    }

    public CarConcern(String model, int year) {
        //напишите тут ваш код
    }

    public CarConcern(String model) {
        //напишите тут ваш код
    }
}
