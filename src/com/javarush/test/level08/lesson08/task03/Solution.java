package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> a = new HashMap<String, String>();
        a.put("косяков", "вася");
        a.put("косякор", "петя");
        a.put("бород", "коля");
        a.put("факин", "женя");
        a.put("пукин", "женя");
        a.put("лысый", "боря");
        a.put("дубин", "гена");
        a.put("шубин", "маша");
        a.put("валин", "тоня");
        a.put("сукач", "коля");
        return a;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int i = 0;
        for (Map.Entry <String, String>  b : map.entrySet())
        {
            String g = b.getValue();
            if (g.equals(name)) {
                i +=1;
            }
        }return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int h = 0;
        for (Map.Entry <String, String>  b : map.entrySet())
        {
            String g = b.getKey();
            if (g.equals(lastName)) {
                h +=1;
            }
        }return h ;
    }
}
