package com.companyName.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    private static final Properties properties=new Properties();
    static {
        try(InputStream input=PropertiesLoader.class
                .getClassLoader()
                .getResourceAsStream("application.properties")){
            if (input==null) throw new RuntimeException("application properties not found under resources");
            properties.load(input);
        }catch (IOException e){throw new RuntimeException("Failed to load the application properties");}
    }
    public static String get(String KEY){
        return properties.getProperty(KEY);
    }
    public static String get(String KEY,String defaultValue){
        return properties.getProperty(KEY,defaultValue);
    }
}
