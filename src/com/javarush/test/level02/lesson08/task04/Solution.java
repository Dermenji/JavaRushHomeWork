package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        //напишите тут ваш код
        if (min(a, b) < c && min(a,b) < d)
        {
            return min(a, b);
        }
        else if (c < min(a,b) && c < d)
        {
            return c;
        }
        else if (d < min(a, b) && d < c)
        {
            return d;
        }
        return a;
    }

    public static int min(int a, int b)
    {
        //напишите тут ваш код
        if(a<b)
            return a;
        else return b;

    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}