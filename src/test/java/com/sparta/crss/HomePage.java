package com.sparta.crss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {
    WebDriver webDriver;
    String link = "http://localhost:9292/";
//    String link = "http://127.0.0.1:9292/";

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

    //TODO: condense into overloaded findBox() method
    public static void findBoxById(WebDriver webDriver, String boxName) {
        webDriver.findElement(By.id(boxName));
    }

    //TODO: condense into overloaded findBox() method
    public static void findBoxByName(WebDriver webDriver, String boxName) {
        webDriver.findElement(By.name(boxName));
    }

    //TODO: remove redundant methods
    public static void findFirstNameBox(WebDriver webDriver) {
        findBoxById(webDriver, "firstName");
    }

    public static void enterFirstName(WebDriver webDriver, String name) {
//        findFirstNameBox(webDriver).sendKeys(name);
        WebElement firstName = webDriver.findElement(By.id("firstName"));
        firstName.sendKeys(name);
    }

    public static void findLastNameBox(WebDriver webDriver) {
        findBoxById(webDriver, "lastName");
    }

    public static void enterTextIntoBox(WebDriver webDriver, String boxId, String input) {
        webDriver.findElement(By.id(boxId)).sendKeys(input);
    }
}
