package io;

import java.io.*;
import java.util.*;

public class IO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "cp1251");

        String s;

        do {
            // Пример ввода D:\IO\src\io\STAS.txt
            System.out.print("Введите полный путь к файлу: ");
            s = in.nextLine();
            if ("".equals(s)) {
                throw new IllegalArgumentException();
            }
            File file = new File(s);
            if (!file.exists()) {
                System.out.println("Такого объекта файловой системы не существует");
            } else {
                try {
                    FileReader file1 = new FileReader(s);
                    BufferedReader br = new BufferedReader(file1);
                    String line;
                    boolean letter = false;
                    int numW = 0;
                    while ((line = br.readLine()) != null) {
                        if (line.length() == 0) {
                            continue;
                        }
                        line = line + ".";
                        for (int i = 0; i < line.length()-1; i++) {
                            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z' || line.charAt(i) >= 'A' && line.charAt(i) <= 'Z' || line.charAt(i) >= 'а' && line.charAt(i) <= 'я' || line.charAt(i) >= 'А' && line.charAt(i) <= 'Я') {
                                letter = true;
                            } else if ('\\' == line.charAt(i) && line.charAt(i+1) == 'n'){
                                if (letter){
                                    numW++;
                                }
                                letter = false;
                                i++;
                            }else {
                                if (letter){
                                    numW++;
                                }
                                letter = false;
                            } 
                        }
                    }
                    System.out.printf("Ответ: %d\n", numW);
                } catch (FileNotFoundException e) {
                    System.out.println("Что-то не так с чтением файла");
                    continue;
                } catch (IOException e) {
                    System.out.println("Что-то не так с BufferedReader");
                }
                break;
            }
        } while (true);
    }

}
