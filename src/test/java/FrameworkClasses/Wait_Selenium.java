package FrameworkClasses;

import org.testng.annotations.Test;

import FrameworkClasses.CustomWait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Wait_Selenium {
	
 WebDriver driver = null;
 WebDriverWait wait = null;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  
	
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  String exePath = "./Resources/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);				
	  driver = new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  //wait = new WebDriverWait(driver,40);
	 // WebDriverWait wait=new WebDriverWait(driver, 20);

	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterSuite
  public void afterSuite() {
  }
  
  @Test
  public void LoginTest()
  {
	  
	  //CustomWait.isElementPresnt(driver, ".//*[@name='txtUsername']", 45).sendKeys("Admin");
	  // driver.findElement(By.cssSelector("[name='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.cssSelector("[value='LOGIN']")).click();;
	  //Title page is "OrangeHRM", Expected should come from ext file(prop, excel, csv, DB)
	  //WebElement ele = By.xpath(".//img[@alt='OrangeHRM']");
	  //wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath(".//img[@alt='OrangeHRM']")));
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  	  
	  java.util.List<WebElement> Links = driver.findElements(By.tagName("a"));
	  System.out.println("-Count of Links-->"+Links.size());
	  for(int i=0;i<Links.size();i++)
	  {
		  System.out.println("**Links Text**"+Links.get(i).getText());
	  }
	  
  }
  
  //@Test
  public void LoginTest_CustomWait()
  {
	  driver.findElement(By.cssSelector("[name='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.cssSelector("[value='LOGIN']")).click();;

	  
	  java.util.List<WebElement> Links = driver.findElements(By.tagName("a"));
	  System.out.println("-Count of Links-->"+Links.size());
	  for(int i=0;i<Links.size();i++)
	  {
		  System.out.println("**Links Text**"+Links.get(i).getText());
	  }
	  
  }
  
  

}
