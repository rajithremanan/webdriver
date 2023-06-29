package PKG;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countdate {
	private static final String DateTimeFormatter = null;
	ChromeDriver driver;
	private WebElement dateElement;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void dropdown()
	{
		WebElement  date =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select selectData=new Select(date);
        selectData.selectByVisibleText("27");
        WebElement  month =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
          Select selectMonth =new Select(month);
          selectMonth.selectByVisibleText("JUL");
          WebElement  Year =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
            Select selectYear =new Select(Year);
            
            selectYear.selectByVisibleText("2010");
            List<WebElement>li=selectData.getOptions();
            System.out.println("Count of days=" +li.size());
            List<WebElement>mi=selectMonth.getOptions();
            System.out.println("Count of month=" +mi.size());
            List<WebElement>si=selectYear.getOptions();
            System.out.println("Count of year=" +si.size());
}
}
