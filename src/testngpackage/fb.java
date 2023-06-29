package testngpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb {
ChromeDriver driver;
	

    @BeforeTest
  public void setup()
  {
    
  driver=new ChromeDriver();
  driver.get("https://www.facebook.com/login/");
    

  }
  @Test
  public void test()
  {
	 

	  driver.findElement(By.name("email")).sendKeys("9539501623");
	  driver.findElement(By.name("pass")).sendKeys("RAJith##");
	  driver.findElement(By.name("login")).click();
	  String exp="https://www.facebook.com/";
	  String actual=driver.getCurrentUrl();
	  if(actual.equals(exp))
	  {
		  System.out.println("login successfull");
	  }
	  else
	  {
		  System.out.println("login fail");
	  }
  }
}
  