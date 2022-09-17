package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

            //1- Setting up the web driver manager
            //We create our "Browser Driver"
            WebDriverManager.chromedriver().setup();

            //2- Create instance of the chrome driver
        //This is the line opening an empty
            WebDriver driver = new ChromeDriver();

            //3- Test if driver is working as expected
            driver.get("https://www.tesla.com");

            //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // Stop code execution for 3 seconds
          Thread.sleep(3000);


          // use selemium to navigate back
        driver.navigate().back();


        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

         // use selenium to navigate refresh
        driver.navigate().refresh();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate ().to ();
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the mgoogle page
        currentTitle =driver.getTitle();

        //get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());


        System.out.println("currentTitle = " + currentTitle);

        //get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this will close the currently opened window
        driver.close();


         //this will close all of the opened window
        driver.quit();

    }


}
