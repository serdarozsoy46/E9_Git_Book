package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

public WebDriver driver;

@BeforeMethod
public void setupMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://practice.cydeo.com/dropdown");

}

  @Test
    public void dropdown_task5() throws InterruptedException {

      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://practice.cydeo.com/dropdown");

      Select stateadaropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

      Thread.sleep(1000);
      stateadaropdown.selectByVisibleText("Illinois");

      Thread.sleep(1000);
      stateadaropdown.selectByValue("VA");

      Thread.sleep(1000);
      stateadaropdown.selectByIndex(5);

      String expectedOptionText = "California";
      String actualOptionText = stateadaropdown.getFirstSelectedOption().getText();
      Assert.assertEquals(actualOptionText,expectedOptionText);
  }

@Test
    public void dropdown_task6(){
//    december 1 1923
    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

    //VisibleText
    yearDropdown.selectByVisibleText("1923");
    // value
    monthDropdown.selectByValue("11");
    // index
    dayDropdown.selectByIndex(0);
    // value
    String expectedYear = "1923";
    String expectedMonth = "December";
    String expectedDay = "1";
    // actual value from browser
    String actualYear = yearDropdown.getFirstSelectedOption().getText();
    String actualMonth = monthDropdown.getFirstSelectedOption().getText();
    String actualDay = dayDropdown.getFirstSelectedOption().getText();

    //assertions
    Assert.assertTrue(actualYear.equals(expectedYear));
    Assert.assertEquals(actualMonth,expectedMonth);
    Assert.assertEquals(actualDay,expectedDay);

}
@AfterMethod
    public void teardownMethod(){
    driver.close();
}

    }

