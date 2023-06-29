package testngpackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class rightclick {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	}
	
	@Test
	public void test()	
	{
		
		 Actions actions = new Actions(driver);
		   WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		   actions.contextClick(right).perform();
		   WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		   element.click();
		   Alert a=driver.switchTo().alert();
		   a.accept();
		   
		   WebElement doubleclk = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		   actions.doubleClick(doubleclk).perform();
		   Alert d=driver.switchTo().alert();
		   System.out.println(d.getText());
		   d.accept();
	
	

}
}
