package FrameworkClasses;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

@Listeners(FrameworkClasses.CustomRep.class)
public class Verbose_Thread {
	WebDriver driver = null;
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }
  
  @Test    
  public void executSessionOne(){
          //First session of WebDriver
	  String exePath = "./Resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
          driver = new ChromeDriver();
          //Open URL
          System.out.println("Test Case executSessionOne with Thread Id:- "	+ Thread.currentThread().getId());
          driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
          Assert.fail();
          //find user name text box and fill it
          
          
      }
      
  @Test    
      public void executeSessionTwo(){
          //Second session of WebDriver
	  String exePath = "./Resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
      WebDriver driver = new ChromeDriver();
          //Open URL
      System.out.println("Test Case executSessionTwo with Thread Id:- "	+ Thread.currentThread().getId());
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      //find user name text box and fill it
      
      
      }
      
  @Test    
      public void executSessionThree(){
          //Third session of WebDriver
	  String exePath = "./Resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
      WebDriver driver = new ChromeDriver();
          //Open URL
      System.out.println("Test Case executSessionThree with Thread Id:- "	+ Thread.currentThread().getId());
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      //find user name text box and fill it
      
      
      }   

}
