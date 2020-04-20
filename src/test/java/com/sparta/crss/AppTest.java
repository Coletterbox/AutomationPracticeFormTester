package com.sparta.crss;

//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;

import com.sparta.crss.page.HomePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.*;


public class AppTest {
    static WebDriver webDriver = new ChromeDriver();

    @BeforeAll
    public static void setup() {
        new HomePage(webDriver);
    }

    @Test
    public void testTest() {
        assertEquals("test", "test");
    }

    @Test
    public void testNameField() {
        HomePage.enterFirstName(webDriver, "Bob");
    }

    @Test
    public void testFields() {
        HomePage.enterTextIntoBox(webDriver, "lastName", "Smith");
    }
}
