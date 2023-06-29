package testngpackage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class droppable {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");	
	}
	
	@Test
	public void test()	
	{
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
		act.dragAndDrop (drag,drop);
		act.perform();
		String exp="Dropped!";
		 String actualtext=drop.getText();
		    if(actualtext.equals(exp))
		      {
		      System.out.println("pass");
		      }
		    else
		    {
		      System.out.println("fail");
		    }
		
				
		

	}

}
