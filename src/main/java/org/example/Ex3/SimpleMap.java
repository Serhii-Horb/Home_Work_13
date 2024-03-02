package org.example.Ex3;

import java.util.*;

/* Найти маршрут из заданного списка билетов, желательно используя Map.
Учитывая список билетов, найти маршрут по порядку, используя данный список.
Вход:
«Berlin» -> «London»
«Tokyo» -> «Seoul»
«Mumbai» -> «Berlin»
«Seoul» -> «Mumbai»
Выход:
Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon */
public class SimpleMap {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Berlin", "London");
        Ticket ticket2 = new Ticket("Tokyo", "Seoul");
        Ticket ticket3 = new Ticket("Mumbai", "Berlin");
        Ticket ticket4 = new Ticket("Seoul", "Mumbai");

        Map<String, String> ticketsMap = new HashMap<>();
        ticketsMap.put(ticket1.getStartingPoint(), ticket1.getEndPoint());
        ticketsMap.put(ticket2.getStartingPoint(), ticket2.getEndPoint());
        ticketsMap.put(ticket3.getStartingPoint(), ticket3.getEndPoint());
        ticketsMap.put(ticket4.getStartingPoint(), ticket4.getEndPoint());
        System.out.println(ticketsMap);

        optimalRoute(ticketsMap, ticket2);

    }

    private static void optimalRoute(Map<String, String> ticketsMap, Ticket ticket) {
        String pointStart = ticket.getStartingPoint();
        String pointEnd;
        while (ticketsMap.containsKey(pointStart)) {
            pointEnd = ticketsMap.get(pointStart);
            System.out.println(pointStart + " " + pointEnd);
            pointStart = pointEnd;
        }
    }
}

