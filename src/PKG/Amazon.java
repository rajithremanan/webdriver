package PKG;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	@Before
	
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
public void test1()
{
		  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		  driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
		  
}
}
