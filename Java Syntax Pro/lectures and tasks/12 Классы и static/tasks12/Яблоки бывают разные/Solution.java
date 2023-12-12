package com.javarush.task.pro.task11.task1119;

import java.util.Objects;

/* 
Яблоки бывают разные
Исправь ошибку в коде, чтобы программа вывела на экран фразу: "телефоны одинаковые".

Требования:
•	В консоли должна выводиться фраза "телефоны одинаковые".
*/

public class Solution {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");
        if (cellPhone1 == cellPhone2) {
            System.out.println("телефоны одинаковые");
        }
    }
}

class CellPhone {
    String vendor;
    String model;

    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellPhone cellPhone = (CellPhone) o;
        return Objects.equals(vendor, cellPhone.vendor) &&
                Objects.equals(model, cellPhone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, model);
    }
}