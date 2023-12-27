package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
В методе main перехвати исключение и выведи его стектрейс.

Требования:
•	Метод main должен вызывать метод dangerousMethod.
•	Метод dangerousMethod должен бросать Exception.
•	Метод main должен выводить на экран стектрейс перехваченного исключения.
*/

public class Solution {

    public static void main(String[] args) {
        dangerousMethod();
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
