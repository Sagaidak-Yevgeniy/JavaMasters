package com.javarush.task.pro.task08.task0812;

/*
Swap по-новому
В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
Можно использовать только операции:

Исключающее или.
Присваивание.
Исключающее или с присваиванием.
Не оставляй комментарии, не меняй остальной код.
Требования:
•	В классе Pair должен присутствовать метод swap().
•	В классе Pair в методе swap() используй только разрешенные операции.
•	Вызов метода swap() должен поменять значения полей x и y.
•	Не изменяй никакой код, кроме метода swap().
 */
public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        //напишите тут ваш код
    }
}
