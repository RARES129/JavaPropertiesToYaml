package org.example;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.*;

public class JavaPropertiesToYaml {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: mvn exec:java -Dexec.args=\"src/main/resources/<example.properties> src/main/resources/<example.yaml>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (InputStream input = new FileInputStream(inputFile)) {
            Properties properties = new Properties();
            properties.load(input);

            // Here we are converting the .properties file into a Map
            Map<String, Object> map = new LinkedHashMap<>();
            for (String key : properties.stringPropertyNames()) {
                map.put(key, properties.getProperty(key));
            }

            // Here we have the YAML config
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            options.setPrettyFlow(true);

            // Here we write in the .yaml file the Map made above
            Yaml yaml = new Yaml(options);
            try (FileWriter writer = new FileWriter(outputFile)) {
                yaml.dump(map, writer);
            }

            System.out.println("Converted successfully to: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
