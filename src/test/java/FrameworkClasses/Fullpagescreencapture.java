package FrameworkClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class Fullpagescreencapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./Resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);				
		WebDriver driver = new ChromeDriver();
	    driver.get("http://news.google.com");
	    driver.manage().window().maximize();
	    Shutterbug.shootPage(driver,ScrollStrategy.BOTH_DIRECTIONS).withName("FullCapture").save("./Screenshot");
	    //driver.quit();

	}

}
