package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

Требования:
•	Программа должна считать из консоли ссылку на файл в интернете (строку).
•	Программа должна скачать файл по ссылке и сохранить его во временный файл.
•	В программе должны быть использованы методы классов Files и URL согласно условию.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
    }
}