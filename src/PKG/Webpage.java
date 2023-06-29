package PKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {

	ChromeDriver  driver;
	@Before
	  public void setup()
	  {
	    
	  driver=new ChromeDriver();
	  driver.get("file://C:/Users/RAMJITH/Downloads/software%20testing/webpagescrpit.html");
	  }
	  @Test
	  public void test1()
	  {
		  driver.findElement(By.xpath("html/body/input[1]")).click();
		  Alert a=driver.switchTo().alert();
		  String text=a.getText();
		  System.out.println(text);
			a.accept();	  
				  		  
				  
		  driver.findElement(By.xpath("html/body/input[2]")).sendKeys("rocky",Keys.ENTER);
		  driver.findElement(By.xpath("html/body/input[3]")).sendKeys("R",Keys.ENTER);
		  driver.findElement(By.xpath("html/body/input[4]")).click();
		  
	  }
	    
	
}
