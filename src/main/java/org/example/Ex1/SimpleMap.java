package org.example.Ex1;
/*1) Есть Map, в котором храниться количество жителей по разным городам.


 */

import java.util.*;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> cityMap = new HashMap<>();
        cityMap.put("Днепр", 10000);
        cityMap.put("Лондон", 10000);
        cityMap.put("Париж", 10000);
        cityMap.put("Одесса", 15000);
        cityMap.put("Киев", 150000);
        cityMap.put("Кривой Рог", 8000);
        cityMap.put("Донецк", 12000);
        cityMap.put("Луганск", 5000);
        cityMap.put("Львов", 30000);
        cityMap.put("Ровно", 12000);
        System.out.println(maximumNumberOfInhabitants(cityMap));
        System.out.println(averageNumberOfInhabitants(cityMap));
        equalCity(cityMap);
    }

    // Найдите город с самым большим количеством жителей.
    public static String maximumNumberOfInhabitants(Map<String, Integer> cityMap) {
        String maxCity = " ";
        int maxInhabitants = 0;
        for (Map.Entry<String, Integer> entry : cityMap.entrySet()) {
            String city = entry.getKey();
            int inhabitant = entry.getValue();

            if (inhabitant > maxInhabitants) {
                maxInhabitants = inhabitant;
                maxCity = city;
            }
        }
        return maxCity;
    }

    // Найдите среднее количество жителей по всем городам.
    public static int averageNumberOfInhabitants(Map<String, Integer> cityMap) {
        int numberOfCities = cityMap.size();
        int totalInhabitants = 0;
        for (Map.Entry<String, Integer> entry : cityMap.entrySet()) {
            totalInhabitants += entry.getValue();
        }
        return totalInhabitants / numberOfCities;
    }

    // Найдите все города, у которых количество жителей одинаковое.
    public static void equalCity(Map<String, Integer> cityMap) {

        Map<Integer, List<String>> citiesWithEqualPopulation = new HashMap<>();

        for (Map.Entry<String, Integer> entry : cityMap.entrySet()) {
            String city = entry.getKey();
            Integer population = entry.getValue();
            if (!citiesWithEqualPopulation.containsKey(population)) {
                citiesWithEqualPopulation.put(population, new ArrayList<>(List.of(city)));
            } else {
                citiesWithEqualPopulation.get(population).add(city);
            }
        }
        for (Map.Entry<Integer, List<String>> entry : citiesWithEqualPopulation.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println(entry.getValue() + " : " + entry.getKey() + " - население");
            }
        }
    }
}