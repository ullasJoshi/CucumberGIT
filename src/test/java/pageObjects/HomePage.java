package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.xpath("//*[@class='search-keyword']");
	
	By product = By.cssSelector("h4.product-name");
	
	public void getSearch(String Name){
		
		//driver.findElement(search).sendKeys(Name);
		
		driver.findElement(search).sendKeys(Name);
		
		System.out.println(Name);
	}
   
	public WebElement getSearch(){
		
		//driver.findElement(search).sendKeys(Name);
		
	return	driver.findElement(By.xpath("//*[@class='search-keyword']"));
		
		
	}
    public WebElement getProduct(){
		
		
		return driver.findElement(product);
	}
	

}
