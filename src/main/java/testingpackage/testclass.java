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
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("priyadharshinikp7@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shri#123");
		driver.findElement(By.xpath("<button class=\"__STYLE_GUIDE__Button__root___1Gfy1qg Signin-button __STYLE_GUIDE__Button__root_isPink___3GItr7v\" type=\"submit\" data-automation=\"signin-submit\">Sign In</button>")).submit();
		
	}
	

}
