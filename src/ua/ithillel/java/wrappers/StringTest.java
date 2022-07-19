package ua.ithillel.java.wrappers;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        // Задание №2 пункт 1 - 2

        String str1 = "Произвольная строка)";
        String str2 = new String("Hello World!!!!");
        char[] data = {'q', 'w', 'e', 'r', 't', 'y'};
        String str3 = new String(data);

        byte[] arr = {66, 121, 116, 101, 32, 115, 116, 114, 105, 110, 103};
        String str4 = new String(arr);

        StringBuilder builder = new StringBuilder();
        builder.append("Строка")
                .append(" созданая")
                .append(" при помощи")
                .append(" StringBuilder");
        String str5 = builder.toString();
        System.out.println(str5);

        // Задание №2 пункт 3

        String str6 = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitArr = str6.split(",");

        int WordLength = 0, indexMax = 0;
        String maxWord = null;

        for (int i = 0; i < fruitArr.length; i++) {
            if (fruitArr[i].length() > WordLength) {
                WordLength = fruitArr[i].length();
                indexMax = i;
                maxWord = fruitArr[indexMax].toLowerCase();
            }
        }
        System.out.println(maxWord);

        maxWord = maxWord.substring(0, 3);
        System.out.println("maxWord после сокращения: " + maxWord);

        String str7 = "   Я_новая_строка      ";
        str7 = str7.trim();
        str7 = str7.replace('_', ' ');
        System.out.println(str7);

        Scanner scan = new Scanner(System.in);
        String str8 = scan.nextLine();
        System.out.println("Вы ввели: " + str8);
        String[] strArr = str8.split(" ");

        if (strArr[0].equals("Запуск")) {
            System.out.println("Запускаем процесс");
        }

        if (strArr[strArr.length - 1].equals("завершен")) {
            System.out.println("Процесс завершен");
        }

        str8 = str8.toLowerCase();
        if (str8.contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        //Задание №2 пункт 4:

        StringBuilder builder1 = new StringBuilder();
        builder1.append(str1)
                .append(str2)
                .append(str3)
                .append("\n")
                .append(str4)
                .append(str5)
                .append(str6)
                .append("\n")
                .append(str7)
                .append(str8).reverse();
        String str9 = builder1.toString();
        System.out.println(str9);
    }
}
