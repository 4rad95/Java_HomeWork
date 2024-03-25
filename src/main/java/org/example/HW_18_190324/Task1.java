package org.example.HW_18_190324;

import java.io.*;
import java.util.Scanner;

// 1 уровень сложности: 1. Написать приложение, которое будет копировать информацию из файла в другой файл.
//Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.
public class Task1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите путь к файлу источнику (по умолчанию  text.txt):");
        String sourceFilePath = scanner.nextLine();

        if (sourceFilePath.length()==0) {
                    sourceFilePath = "text.txt"; }

        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("Нету такого файла !");
            return;
        }

        System.out.println("Введите имя нового файла  (по умолчанию  text_new.txt):");
        String newFileName = scanner.nextLine();
        if (newFileName.length()==0) {
            newFileName= "text_new.txt";
        }




        File newFile = new File(newFileName);
        if (newFile.exists()) {
            System.out.println("Файл с таким именем уже существует!");
            return;
        }
        newFile.createNewFile();

        // Копирование информации
        try (
                Scanner sourceScanner = new Scanner(sourceFile);
                PrintWriter newFileWriter = new PrintWriter(newFile);
        ) {
            while (sourceScanner.hasNextLine()) {
                String line = sourceScanner.nextLine();
                newFileWriter.println(line);
            }
        }

        System.out.println("Информация из файла скопирована!");
    }
}
