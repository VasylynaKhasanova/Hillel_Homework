package com.homework14;

import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = getProperties();
    public static final String BASE_URL = properties.getProperty("base.url");

    private static Properties getProperties()  {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
