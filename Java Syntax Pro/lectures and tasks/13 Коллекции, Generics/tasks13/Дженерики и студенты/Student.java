package com.javarush.task.pro.task12.task1221;


/*
Дженерики и студенты
В классе UniversityDepartment есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их имена. Но на данный момент программа не компилируется.
Твоя задача исправить этот баг. Для этого нужно исправить сигнатуру метода printStudentNames(ArrayList), чтобы он принимал список объектов только типа Student(используй дженерик).
Метод main не участвует в проверке.

Требования:
•	Исправь сигнатуру метода printStudentNames, чтобы он принимал список только студентов.
•	Реализацию метода printStudentNames не изменять.*/
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
