package PKG;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response {
ChromeDriver  driver;
  
  @Before
  public void setup()
  {
    
  driver=new ChromeDriver();
  driver.get("https://www.facebook.com/");
  
  }

  @Test
  public void test1() throws Exception
  {
     List<WebElement> links=driver.findElements(By.tagName("a"));
     System.out.println("total no of links="+links.size());
     
     for (WebElement u:links)
     {
      String link=u.getAttribute("href");
      verify(link);
     }
}

  private void verify(String link) {
    try {
      URL n=new URL(link);
      HttpURLConnection con=(HttpURLConnection)n.openConnection();
      con.connect();
      if(con.getResponseCode()==200)
      {
        System.out.println("response code is 200---"+link);
      }
      else
      {
        System.out.println("response code is 400---"+link);
      }
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}
			
		
	  
