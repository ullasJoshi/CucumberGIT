package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {

	public WebDriver driver;

	public CheckOut(WebDriver driver) {

		this.driver=driver;
	}


	By IncBtn = By.xpath("//*[@class='increment']");
	By AddCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By CartIcon = By.xpath("//*[@class='cart-icon']");
	By ProceedCheckOut = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By ProductName = By.xpath("//*[@class='product-name']");

	public WebElement addProduct(){		

		return driver.findElement(IncBtn);
	}
	public WebElement addToCart(){		

		return driver.findElement(AddCart);
	}
	public WebElement Cart(){		

		return driver.findElement(CartIcon);
	}

	public WebElement proceedCheckOut(){		

		return driver.findElement(ProceedCheckOut);
	}

	public WebElement productName(){		

		return driver.findElement(ProductName);
	}

}
