package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base {

	@Test
	public void webElementCommands() {
		
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys("Hello");
	    WebElement showMessageButton = driver.findElement(By.cssSelector("button#button-one"));
        showMessageButton.click();
	}
 
	@Test
	public void testingTwoInput() {
	    WebElement valueA = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement valueB = driver.findElement(By.xpath("//input[@id='value-b']"));
	    valueA.sendKeys("2");
	    valueB.sendKeys("3");
	    WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));		
	    getTotal.click();
	}
}
