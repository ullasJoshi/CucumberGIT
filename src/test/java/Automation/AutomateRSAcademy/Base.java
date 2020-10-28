package Automation.AutomateRSAcademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException{

		prop = new Properties();
		FileInputStream fis = new FileInputStream ("D:\\My Learnings\\Selenium Udemy\\AutomateRSAcademy\\src\\test\\java\\Automation\\AutomateRSAcademy\\global.properties");
		prop.load(fis);


		System.setProperty("webdriver.chrome.driver", "D:\\My Learnings\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
