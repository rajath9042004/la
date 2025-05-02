package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiniTest {

    @Test
    public void simpleTest() {

        // Setup ChromeDriver path - update this to your chromedriver location
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");

            // Print the page title to console
            System.out.println("Successfully opened: " + driver.getTitle());

        } finally {
            // Close browser
            driver.quit();
        }
    }
}