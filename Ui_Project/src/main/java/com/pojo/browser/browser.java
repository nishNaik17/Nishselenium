package com.pojo.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin2.main.client.MozillaServiceDelegate;

import java.io.FileInputStream;
import java.util.Properties;

public class browser {

     public WebDriver browser(String browser,String Url,WebDriver driver) {
//        WebDriver driver;
        try{
            switch (browser){
                case "chrome":
                    driver = new ChromeDriver();
                    Thread.sleep(1000);
                    driver.get(Url);
                    Thread.sleep(1000);
                    driver.manage().window().fullscreen();
                    Thread.sleep(1000);
                    break;
                case "mozilla":
                    driver = (WebDriver) new MozillaServiceDelegate();
                    Thread.sleep(1000);
                    driver.get(Url);
                    Thread.sleep(1000);
                    driver.manage().window().fullscreen();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error in the properties file");

        }
        return driver;
    }

}
