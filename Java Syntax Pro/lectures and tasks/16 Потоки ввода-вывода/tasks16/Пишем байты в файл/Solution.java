package com.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
У Амиго появилась задача: записать байты в файл. Он написал программу, которая считывает из консоли путь к файлу и записывает в этот файл последовательность байтов, полученную из аргумента метода main(String[]). Но в процессе написания программы он допустил ошибку.
Как ты уже знаешь, BufferedWriter "не работает" с байтами: для записи байтов в файл нужно использовать метод write(Path, byte[]) класса Files.
Path можно получить используя статический метод Path.of(), в который передать путь к файлу, считанный из консоли. Выглядит это так - Path.of(scanner.nextLine()). Помоги Амиго исправить программу.

Требования:
•	Программа должна считать из консоли путь к файлу.
•	Программа должна записывать байты в файл.
•	Для записи байтов должен быть использован метод write(Path, byte[]) класса Files.
•	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            bufferedWriter.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

