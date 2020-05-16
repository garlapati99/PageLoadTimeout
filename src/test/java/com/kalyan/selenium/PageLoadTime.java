package com.kalyan.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.WebDriver.Timeouts;

public class PageLoadTime {

    private WebDriver driver;

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/garlapati/workspace/lib/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://learn-automation.com/core-java-topics-for-selenium/");
        driver.manage().window().maximize();
        Timeouts timeouts = driver.manage().timeouts();
        timeouts.pageLoadTimeout(3, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }

}
