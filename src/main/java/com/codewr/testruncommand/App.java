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
        int count = 0;
        while (true) {
            try {
                System.out.println("Running...." + ++count);
                Thread.sleep(1000);
                if (count == 20) {
                    break;
                }
            } catch (InterruptedException ex) {
                System.out.println("Systemctl " + ex);
            }
        }
    }
}
