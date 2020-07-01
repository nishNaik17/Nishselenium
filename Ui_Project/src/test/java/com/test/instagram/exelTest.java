package com.test.instagram;

import com.pojo.pageObject.instagram.instaPageObject;
import com.test.login;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exelTest {

    WebDriver driver;

    @Test
    public void instaCheck() throws IOException {
        login instlogin = new login();
        FileInputStream fis = new FileInputStream("");

        XSSFWorkbook xls = new XSSFWorkbook(fis);


        try {
            this.driver = instlogin.login();
            instaPageObject lgnp = new instaPageObject(driver);
            lgnp.getUserName().sendKeys("nishanthnaik");
            Thread.sleep(500);
            lgnp.getPassword().sendKeys("Arsenal@4321");
            Thread.sleep(500);
            lgnp.getLoginButton().click();
            Thread.sleep(50000);
        }catch (Exception e){
            System.out.println("Some Error");
        }finally {
            driver.close();
            driver.quit();
        }

    }

}
