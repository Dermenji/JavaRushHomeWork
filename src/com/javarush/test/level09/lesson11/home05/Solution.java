package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Character> vovelsList = new ArrayList<>();
        List<Character> otherssList = new ArrayList<>();

        String name = reader.readLine();

        char[] list = name.trim().toCharArray();
        for (int i = 0; i < list.length ; i++)
        {
            if(isVowel(list[i])){
               // System.out.print(list[i] + " ");
                vovelsList.add(list[i]);
            } else {
               // System.out.println();
                //System.out.print(list[i] + " ");
                otherssList.add(list[i]);
            }
        }

        for (Character s : vovelsList){
            System.out.print(s + " ");
        }
        System.out.println();
        for (Character p : otherssList){
            System.out.print(p + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
