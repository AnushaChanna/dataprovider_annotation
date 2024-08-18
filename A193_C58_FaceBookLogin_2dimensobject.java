package dataprovider_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A193_C58_FaceBookLogin_2dimensobject
{
	WebDriver driver;

	@Test(dataProvider="data1")
	public void facebookLogin9(String username,String password)
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement UN= driver.findElement(By.name("email"));
		UN.sendKeys(username);
				
		WebElement PW= driver.findElement(By.name("pass"));
		PW.sendKeys(password);
		
		WebElement button= driver.findElement(By.name("login"));
		button.click();		
	}
	
	@DataProvider(name="data1")
	public Object[][] login()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="9912117833";
		data[0][1]="Anusha@1996";
		
	/*	WebElement a=driver.findElement(By.id("//input[@dir='ltr']"));
		Assert.assertEquals(a.isDisplayed(),true,"please try later");*/
		
		data[1][0]="9912117833";
		data[1][1]="Anshdbj";
		
	/*	WebElement a=driver.findElement(By.id("//input[@dir='ltr']"));
		Assert.assertEquals(a.isDisplayed(),false,"please try later");*/
		
		return data;
	}
	
	
	
	
	
	
	
}
