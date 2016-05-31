package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, n1;
        boolean isTrue = true;
        String num1;

        while(isTrue)
        {
            num1 = reader.readLine();
            n1 = Integer.parseInt(num1);
            sum = sum + n1;
            if(n1==-1)
            {
                System.out.println(sum);
                isTrue = false;
            }
        }
    }


}
