package com.javarush.task.pro.task14.task1401;

import java.util.Objects;
/*
Поработай обработчиком
Для начала разберись, что делает программа, а затем:

В методе addUser обработай значение, возвращаемое методом setName:
если setName вернул -1, выведи сообщение: "Имя не может быть null."
если -2, выведи сообщение: "Имя не может быть пустым."
если -3, выведи сообщение: "Имя не может содержать цифры."
если другое значение, кроме 0, выведи сообщение: "Неизвестная ошибка."
В методе addUser обработай значение, возвращаемое методом setAge:
если setAge вернул -1, выведи сообщение: "Возраст не может быть меньше 0."
если -2, выведи сообщение: "Возраст не может быть больше 150."
если другое значение, кроме 0, выведи сообщение "Неизвестная ошибка."
В методе findUserIndex обработай значение, возвращаемое методом indexOf:
если indexOf вернул -1, выведи сообщение "Пользователь '<имя пользователя>' не найден."
иначе — оставь текущее сообщение
Класс User не изменяй.
Требования:
•	Значение, возвращаемое методом setName, должно быть обработано.
•	Значение, возвращаемое методом setAge, должно быть обработано.
•	Значение, возвращаемое методом indexOf, должно быть обработано.
 */
public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".*\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
