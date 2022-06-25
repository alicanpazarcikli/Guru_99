package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {

    private static Properties prop=new Properties();

    static {

        String pathForPropertiesFile="src/test/resources/configuration.properties";

        try {
            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);

            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Properties file not found");
        }

    }

    public static String getProperties(String keyword){
        return prop.getProperty(keyword);
    }

    public static void main(String[] args) {
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("userName"));
        System.out.println(prop.getProperty("Password"));
    }









}
