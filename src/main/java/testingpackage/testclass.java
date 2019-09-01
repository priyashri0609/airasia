package testingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testclass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","/Users/priya/Downloads/geckodriver 3" ); 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seek.com.au/");
		//
		driver.findElement(By.linkText("Sign in")).click();
	}//////
	//
	

}
