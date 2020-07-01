package com.test;

import com.pojo.browser.browser;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class login extends browser {

    WebDriver driver;
    Properties pFile = new Properties();


    public WebDriver login() {
        try {
            FileInputStream file = new FileInputStream("src/main/resources/data.properties");
            pFile.load(file);
            String browser = pFile.getProperty("browser");
            String Url = pFile.getProperty("url");
            driver = browser(browser, Url, driver);

        } catch (Exception e) {
            System.out.println("Some Error");
        }
        return driver;
    }
}
