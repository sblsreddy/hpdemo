package com.home.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SridharsJSONConvertor {
    private ObjectMapper mapper;

    public static Map<String, List<String>> groupValues(List<LinkedHashMap<String, String>> listLHM) {
        //Converting List<LinkedHashMap<String, String>> to Map<String, List<String>>
        //Map<String, List<String>> map = new HashMap<>();
         /*   for(Map.Entry<String, String> entry : listLHM.entrySet()){
                String sName = entry.getKey("stateName");
                String cName = entry.getValue("countyName");
                map.computeIfAbsent(sName, k -> new ArrayList<>()).add(cName);
            }*/
        // Group items by state string
        Map<String, List<String>> result = listLHM.stream()
                .collect(Collectors.groupingBy(
                        map -> map.get("stateName"),
                        Collectors.mapping(
                                map -> map.get("countyName"),
                                Collectors.toList()
                        )
                ));
        return result;
    }

    public Map<String, List<String>> convertJsonToObject(String json) throws IOException {
        mapper = new ObjectMapper();
        System.out.println("Deserializing JSON to Object:");
        List<LinkedHashMap<String, String>> stateObjList = (List<LinkedHashMap<String, String>>) mapper.readValue(json, Object.class);
        System.out.println("After Deserialization : " + stateObjList.size());

        Map<String, List<String>> resultMap = groupValues(stateObjList);
        //System.out.println("resultMap : " + resultMap.size());
        resultMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // Optional: sort by state name
                .forEach(entry ->
                        System.out.printf("Category: %-20s | Size: %d%n",
                                entry.getKey(), entry.getValue().size())
                );
        return resultMap;
    }

    public String convertObjectToJson(Object object) throws JsonProcessingException {
        String jsonString = " ";
        mapper = new ObjectMapper();
        String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        return jsonString;
    }
}
