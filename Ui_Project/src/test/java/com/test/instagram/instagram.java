package com.test.instagram;

import com.pojo.pageObject.instagram.instaPageObject;
import com.test.login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class instagram {

    WebDriver driver;

    @Test
    public void instaCheck(){
        login instlogin = new login();

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
