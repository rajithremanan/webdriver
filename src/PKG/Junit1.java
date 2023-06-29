package PKG;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit1 {
	ChromeDriver driver;
	
			    @Before
			  public void setup()
			  {
			    
			  driver=new ChromeDriver();
			  driver.get("https://www.facebook.com");
			    

			  }
			  @Test
			  public void test1()
			  {
				  driver.findElement(By.name("email")).sendKeys("9539501623");
				  driver.findElement(By.name("pass")).sendKeys("RAJith##33");
				  driver.findElement(By.name("login")).click();
				  
			    String actualtitle=driver.getTitle();
			    System.out.println(actualtitle);
			  }
			  private void click() 
			  {
				// TODO Auto-generated method stub
				
			}
			
			  

			}
	

