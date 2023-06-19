package com.WebUni.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

public class Driver {

    private Driver() {
    }

   static WebDriver driver;

    public static WebDriver getDriver() {



        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser.toLowerCase(Locale.ROOT)) {
                case "chrome":
                    /*WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                     */
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(option);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        //Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Driver.getDriver().manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
