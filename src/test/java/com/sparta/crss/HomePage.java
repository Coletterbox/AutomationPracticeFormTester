package com.sparta.crss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver webDriver;
    String link = "http://localhost:9292/";

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        setUp(webDriver);
        webDriver.get(link);
    }

    public void setUp(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    public static String getUrl(WebDriver webDriver, String text) {
        webDriver.findElement(By.linkText(text)).click();
        return webDriver.getCurrentUrl();
    }
}
