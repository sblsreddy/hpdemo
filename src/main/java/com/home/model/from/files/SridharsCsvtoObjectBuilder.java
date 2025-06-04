package com.home.model.from.files;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SridharsCsvtoObjectBuilder {
    public static void main(String[] args) {
        // Get the absolute path to the resources directory
        String resourcesPath = new File("src/main/resources").getAbsolutePath();

        // Path to the CSV file
        String csvFilePath = resourcesPath + "/FipsStateCounty.csv";
        Map<String, List<String>> result = convertCSVToMap(csvFilePath);

        // Print results
//        result.forEach((state, counties) -> {
//            System.out.println("State: " + state + ", Counties: " + counties.size());
//            // System.out.println("Counties: " + counties);
//            //System.out.println("---");
//        });
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // Optional: sort by state name
                .forEach(entry ->
                        System.out.printf("Category: %-20s | Size: %d%n",
                                entry.getKey(), entry.getValue().size())
                );


    }

    public static Map<String, List<String>> convertCSVToMap(String filePath) {
        Map<String, List<String>> stateCountyMap = new HashMap<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();

            // Skip header if present
            boolean skipHeader = true;
            for (String[] record : records) {
                if (skipHeader) {
                    skipHeader = false;
                    continue; // Skip first row if it's a header
                }

                if (record.length >= 3) {
                    String id = record[0].trim();
                    String state = record[1].trim();
                    String county = record[2].trim();

                    stateCountyMap.computeIfAbsent(state, k -> new ArrayList<>()).add(county);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stateCountyMap;
    }
}
