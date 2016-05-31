package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int b = 0;
        int n = Integer.parseInt(reader.readLine());
        int z = n;
        if (n == 1)
        {
            int c = Integer.parseInt(reader.readLine());
            maximum = c;
        }
        else
        {
            while (n > 0)
            {
                int a = Integer.parseInt(reader.readLine());

                if (n == z)
                {
                    b = a - 1;
                }
                if (a > b)
                {
                    maximum = a;
                    b = a;
                }
                else{
                    maximum = b;
                }

                n--;
            }
        }
//напишите тут ваш код
        System.out.println(maximum);
    }

}
