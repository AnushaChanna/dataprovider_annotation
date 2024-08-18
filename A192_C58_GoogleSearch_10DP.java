package dataprovider_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A192_C58_GoogleSearch_10DP 
{
	WebDriver driver;
	
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{"grotrchminds"},{"modi"},{"india"},{"automation"},{"august15"},{"facebook login "},{"flipkart"},{"amazon"}};
	}
	
	@Test(dataProvider = "data1")
	public void googlesearch(String input) throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys(input + Keys.ENTER);
		Thread.sleep(2000);
	}
}
