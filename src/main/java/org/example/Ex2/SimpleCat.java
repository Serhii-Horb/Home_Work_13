package org.example.Ex2;

import java.util.*;

/* У вас есть приют для животных, в которых живут коты.
Есть объект Cat с данными: имя, возраст, вес, порода.
1 создайте Map, ключом которого будет имя, а значением объект Cat.
2 информация о котах должна храниться в упорядоченном виде по имени.


5* найдите кота с самым большим весом и возрастом одновременно. */
public class SimpleCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 2, 5.7, "Сиамская кошка");
        Cat cat2 = new Cat("Том", 3, 4.2, "Дворовой");
        Cat cat3 = new Cat("Мурка", 4, 6.7, "Шотландская кошка");
        Cat cat4 = new Cat("Васька", 10, 8.0, "Дворовой");
        Cat cat5 = new Cat("Тимка", 8, 12.3, "Персидская кошка");


        Map<String, Cat> catMap = new TreeMap<>();
        catMap.put(cat1.getName(), cat1);
        catMap.put(cat2.getName(), cat2);
        catMap.put(cat3.getName(), cat3);
        catMap.put(cat4.getName(), cat4);
        catMap.put(cat5.getName(), cat5);
        System.out.println(catMap);

        sortingByBreed(catMap, "Дворовой");
        sortingByWeight(catMap, 19.2);

    }


    // 3 выведите имена котов, порода которых равна N (на ваше усмотрение).
    private static void sortingByBreed(Map<String, Cat> catMap, String breed) {
        for (Map.Entry<String, Cat> entry : catMap.entrySet()) {
            if (entry.getValue().getBreed().equals(breed)) {
                System.out.println(entry.getValue());
            }
        }
    }

    // 4 выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
    private static void sortingByWeight(Map<String, Cat> catMap, double weight) {
        List<Cat> catList = new ArrayList<>();
        for (Map.Entry<String, Cat> entry : catMap.entrySet()) {
            if (entry.getValue().getWeight() > weight) {
                catList.add(entry.getValue());
            }
        }
        if (!catList.isEmpty()) {
            System.out.println(catList);
        } else {
            System.out.println("Список пуст");
        }
    }
}
