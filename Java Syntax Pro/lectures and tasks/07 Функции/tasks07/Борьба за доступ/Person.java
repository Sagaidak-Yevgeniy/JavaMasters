package com.javarush.task.pro.task06.task0610;

/*
Борьба за доступ
Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.

Требования:
•	Код должен компилироваться.
•	Нужно изменить минимальное необходимое количество модификаторов доступа в классе Person.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    private String getFullName(){
        return firstName + " " + lastName;
    }
}
