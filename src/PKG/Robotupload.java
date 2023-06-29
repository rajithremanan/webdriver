package PKG;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Robotupload {
	 ChromeDriver Driver;
	  @BeforeTest
	  public void setup()
	    {
	    Driver=new ChromeDriver();
	    }
	  @Test
	  public void fileupload()throws Exception
	  {
	     Driver.get("https://www.ilovepdf.com/excel_to_pdf");
	     Driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	     
	     fileupload("C:\\Users\\RAMJITH\\Downloads\\software testing\\new\\data1.xlsx");
	  }
	  public void  fileupload(String p)throws AWTException {
	    StringSelection strSelection= new StringSelection(p);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	    
	    Robot robot = new Robot();
	        
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_V);
	        
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
}

}