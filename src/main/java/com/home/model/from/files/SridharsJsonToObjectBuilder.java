package com.home.model.from.files;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.home.util.SridharsJSONConvertor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class SridharsJsonToObjectBuilder {

    public static void main(String[] args) {

        SridharsJSONConvertor sridharsJsonConvertor = new SridharsJSONConvertor();
        try {
            // Get the absolute path to the resources directory
            String resourcesPath = new File("src/main/resources").getAbsolutePath();

            // Path to the JSON file
            String jsonFilePath = resourcesPath + "/AllStateCountiesFromGit.json";
            // Check if the file exists
            File jsonFile = new File(jsonFilePath);
            if (jsonFile.exists()) {
                // Read the contents of the file
                String jsonContent = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
                Map<String, List<String>> stateCountiesListmap = sridharsJsonConvertor.convertJsonToObject(jsonContent);
                System.out.println("State and CountyList map looks like : " + stateCountiesListmap.size());

            } else {
                System.out.println("JSON file does not exist at the specified path.");
            }
        } catch (JsonProcessingException e) {
            System.out.println("JsonProcessingException: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
            throw new RuntimeException(e);
        }

    }


}
