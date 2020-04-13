package com.sparta.crss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {
    WebDriver webDriver;
    String link = "http://localhost:9292/";
//    String link = "http://127.0.0.1:9292/";

    public static RemoteWebDriver thisIsFromStackOverflow() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:9292/"), capability);
        return driver;
    }

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
