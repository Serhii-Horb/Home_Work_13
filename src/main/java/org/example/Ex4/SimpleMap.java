package org.example.Ex4;

import java.util.*;
/* Сгруппируйте слова с одинаковым набором символов, желательно используя Map.
Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
Выход:
student, students,
cat, act,
dog, god,
flow, wolf */

public class SimpleMap {
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        groupWords(words);
    }

    public static void groupWords(String[] words) {
        Map<String, List<String>> groupedWords = new HashMap<>();

        for (String word : words) {
            Set<Character> uniqueCharacters = new HashSet<>();
            for (char c : word.toCharArray()) {
                uniqueCharacters.add(c);
            }
            String uniqueCharactersString = uniqueCharacters.toString();
            groupedWords.computeIfAbsent(uniqueCharactersString, k -> new ArrayList<>()).add(word);
        }
        for (List<String> group : groupedWords.values()) {
            System.out.println(String.join(", ", group));
        }
    }
}
