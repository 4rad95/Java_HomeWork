package org.example.HW_13_270224.task4;

//4)* Сгруппируйте слова с одинаковым набором символов, желательно используя Map.
//Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
//вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//Выход:
//student, students,
//cat, act,
//dog, god,
//flow, wolf

import java.util.Map;
import java.util.TreeMap;

public class Words {
    public static void main(String[] args) {

        String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf","tree","tron"};

        for (int i = 0; i < words.length; i=i+2) {
            System.out.print(words[i]+ " & " + words[i+1] +"  ");
            System.out.println(checkMap(words[i+1],createMap(words[i])));
        }
    }
    public static Map<String,Integer> createMap(String word) {
        Map<String,Integer> symbols = new TreeMap();
        for (char ch: word.toCharArray()) {
            String str = String.valueOf(ch);
            if(symbols.get(str) == null ){
                symbols.put(String.valueOf(ch),1);
            }
        }
        return symbols;
    }

    public static boolean checkMap(String word, Map<String,Integer> symbols) {
        for (char ch: word.toCharArray()) {
                symbols.remove(String.valueOf(ch));
        }
        if (symbols.isEmpty()) {
            return true;
        }
        else {return false;}

    }
}
