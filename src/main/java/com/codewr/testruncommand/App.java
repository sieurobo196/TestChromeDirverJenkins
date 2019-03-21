package com.codewr.testruncommand;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        try {
//            String exePath = "/usr/local/chromedriver";
//            System.setProperty("webdriver.chrome.driver", exePath);
             System.setProperty("webdriver.chrome.driver",
                    String.format("/usr/local/bin/chromedriver", "root"));
            // Create a new instance of the Firefox driver
//            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("window-size=1100,900");

//            DesiredCapabilities cap = DesiredCapabilities.chrome();
//            cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");

            WebDriver driver = new ChromeDriver(chromeOptions);
//            WebDriver driver = new ChromeDriver(chromeOptions);
//            WebDriver driver = new ChromeDriver(cap);
            //Launch the google.com Website
            driver.get("http://google.com");
//            driver.get("http://www.mailinator.com/");
//            driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("cutx");
//            driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
            //Wait for 5 Sec
            Thread.sleep(10000);
            // Close the driver
            driver.close();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
