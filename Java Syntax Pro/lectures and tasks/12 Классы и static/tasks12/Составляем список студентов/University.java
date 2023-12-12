package com.javarush.task.pro.task11.task1125;

/* 
Составляем список студентов
Метод main должен добавлять двух студентов в массив и выводить их в консоль с помощью метода printStudents.
Сделай исправления в методе main, чтобы программа заработала.

Требования:
•	В классе University должно быть приватное final не статическое поле students типа String[], которое сразу инициализируется.
•	В классе University должен быть метод public void addStudent(String), который добавляет переданного студента в список students.
•	В классе University должен быть метод public void printStudents, который выводит всех студентов в консоли.
•	Метод main должен дважды вызывать метод addStudent.
•	Метод main должен вызывать метод printStudents один раз.
*/

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        addStudent("Максим Федоренко");
        addStudent("Олег Кесарчук");
        printStudents();
    }
}
