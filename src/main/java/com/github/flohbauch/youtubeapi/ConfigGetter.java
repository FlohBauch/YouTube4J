package com.github.flohbauch.youtubeapi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigGetter {

    static final String configFile = "config/api.cfg";

    public static String settings(String key) throws IOException {
        Properties mySettings = new Properties();
        mySettings.load(new FileInputStream(configFile));

        // getProperty() returns a String
        return mySettings.getProperty(key);
    }
}
