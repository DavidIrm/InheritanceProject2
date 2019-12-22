package com.sda.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMapMain {

    public static void main(String[] args) {
/*

        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("Romania","Bucuresti");
        countryMap.put("Italy","Roma");
        countryMap.put("Germany","Berlin");

        System.out.println(countryMap.keySet());

        System.out.println(countryMap.entrySet());
        System.out.println(countryMap.get("Italy"));

        for(Map.Entry<String,String> entry:countryMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
*/

        Map<String, List<String>> advancedCountryMap = new HashMap<>();
        List<String> romanianCityList = new ArrayList<>();
        romanianCityList.add("Bucuresti");
        romanianCityList.add("Timisoara");

        List<String> germanyCityList = new ArrayList<>();
        germanyCityList.add("Berlin");
        germanyCityList.add("Hamburg");


        advancedCountryMap.put("Romania",romanianCityList);
        advancedCountryMap.put("Germany", germanyCityList);

        System.out.println(advancedCountryMap.keySet());
        System.out.println(advancedCountryMap.entrySet());


        // temma inlocui List<String> cu List<City>
        for(Map.Entry<String, List<String>> advancedEntry:advancedCountryMap.entrySet()){
            System.out.println("Key is: "+advancedEntry.getKey()+"" +
                    " and value is: "+advancedEntry.getValue());
        }

        //   countryMap.put("Italy","Roma");
        //   countryMap.put("Germany","Berlin");

    }
}
