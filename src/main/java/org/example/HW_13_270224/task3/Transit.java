package org.example.HW_13_270224.task3;


//3)* Найти маршрут из заданного списка билетов, желательно используя Map.
//Учитывая список билетов, найти маршрут по порядку, используя данный список.
//Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//Выход:
//Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon

import java.lang.reflect.Member;
import java.security.KeyStore;
import java.util.Map;
import java.util.TreeMap;

public class Transit {
    public static void main(String[] args) {
        Map<String,String> cityTransit = new TreeMap<>();
        cityTransit.put("Berlin","London");
        cityTransit.put("Tokyo","Seoul");
        cityTransit.put("Mumbai","Berlin");
        cityTransit.put("Seoul","Mumbai");
        String startCity = getStartTransit(cityTransit);
        for (Map.Entry<String ,String> entry: cityTransit.entrySet()){
            for (Map.Entry<String ,String> entry1: cityTransit.entrySet()){
                if (startCity == entry1.getKey()){
                    startCity = entry1.getValue();
                    System.out.println(entry1.getKey()+ " -->> " + entry1. getValue());
                }
        }

    }}

    public static String getStartTransit(Map<String, String> cityTransit){
        String startCity = null;
        for (Map.Entry<String ,String> entry: cityTransit.entrySet()){
            startCity = entry.getKey();
            for (Map.Entry<String ,String> entry1: cityTransit.entrySet()){
                if (startCity == entry1.getValue()) {
                    startCity = entry1.getKey();
                }
                break;
            }
        }
        return startCity;
    }
}
