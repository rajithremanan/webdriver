package PKG;
import org.openqa.selenium.chrome.ChromeDriver;
public class Expected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://GOOGLE.com");
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		String exp="google.com";
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
