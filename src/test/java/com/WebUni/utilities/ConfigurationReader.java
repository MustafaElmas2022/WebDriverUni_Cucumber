package com.WebUni.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    static Properties properties;

    static {

        try {
            String path ="configuration.properties";
            FileInputStream file = null;  // FileInputStream dosya okumamiza yardimci olur.
            file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
