package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        int maxAB = max(a,b);
        //этим же методом ищем самое большое
        //среди первой пары и c
        int max = max(maxAB,c);

        //аналогичный выбор делаем минимального
        //значения с помощью метода min
        int minAB = min(a,b);
        int min = min(minAB, c);

        //если число меньше максимума и больше минимума - печатаем
        if ((a>min)&&(a<max)) System.out.println(a);
        if ((b>min)&&(b<max)) System.out.println(b);
        if ((c>min)&&(c<max)) System.out.println(c);
    }

    private static int min(int a, int b)
    {
        //метод поиска минимального
        if (a < b) return a;
        else return b;
    }

    private static int max(int a, int b)
    {   //метод поиска максимального
        if (a > b) return a;
        else return b;
    }
}
