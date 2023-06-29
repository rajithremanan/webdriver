package PKG;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://GOOGLE.com");
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		
	}

}
