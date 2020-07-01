package com.pojo.pageObject.instagram;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instaPageObject {

    WebDriver driver;
    public instaPageObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);  // Intialize
    }

    //userName
    @FindBy(name = "username")
    WebElement userName;

    //Password
    @FindBy(name = "password")
    WebElement password;

    //LoginButton
    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    WebElement loginButton;

    public WebElement getUserName(){
        return userName;
    }

    public WebElement getPassword(){
        return password;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }


}
