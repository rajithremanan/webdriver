package PKG;


import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webpagescreenshot {

	
	
	ChromeDriver  driver;
	  
	  @Before
	  public void setup()
	  {
	    
	  driver=new ChromeDriver();
	  driver.get("file://C:/Users/RAMJITH/Downloads/software%20testing/webpagescrpit.html");
	    
	  }
	  @Test
	  
	  
	  public void test1() throws IOException 
	  {
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileHandler.copy(src,new File("C:\\Users\\RAMJITH\\Downloads\\software testing\\screnshot.png"));
				  
				  WebElement button=driver.findElement(By.xpath("html/body/input[1]"));
				  File src1= button.getScreenshotAs(OutputType.FILE);
				  FileHandler.copy(src1, new File("./Screenshpt/error.png"));
		  
		  
		  
		  
		  
	  }
}
