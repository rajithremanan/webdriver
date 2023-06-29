package testngpackage;
import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ebayexpli {
	  ChromeDriver driver;
	  @BeforeTest
	  public void setup()
	  {
	    driver=new ChromeDriver();
	  }
	  @BeforeMethod
	  public void urlloads()
	  {
	    driver.get("https://www.ebay.com/");
	  }
	  @Test
	  public void test1()
	  {
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	    Actions act = new Actions(driver);
	    act.moveToElement(electronics);
	    act.perform();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();

	    }
	    
	}

