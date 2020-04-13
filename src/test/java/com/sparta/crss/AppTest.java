package com.sparta.crss;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    static WebDriver webDriver = new ChromeDriver();

    @BeforeAll
    public static void setup() throws MalformedURLException {
        new HomePage(webDriver);
        HomePage.thisIsFromStackOverflow();
    }

    @Test
    public void testTest()
    {
        assertEquals("test", "test");
    }


}
