package testngpackage;
import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreport {

	WebDriver driver;
	  String baseurl="https://www.facebook.com";
	  ExtentHtmlReporter reporter;
	  ExtentTest test;
	  ExtentReports extent;

	    @BeforeTest
	    public void beftest()
	    {
	      //reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/myreport.html");
	      reporter=new ExtentHtmlReporter("./reports/reports.html");
	      reporter.config().setDocumentTitle("Automationreport");
	      reporter.config().setReportName("functional test");
	      reporter.config().setTheme(Theme.STANDARD);
	      extent=new ExtentReports();
	      extent.attachReporter(reporter);
	      extent.setSystemInfo("hostname", "localhost");
	      extent.setSystemInfo("os", "windows10");
	      extent.setSystemInfo("testername", "abc");
	      extent.setSystemInfo("Browser Name", "chrome");
	      
	      driver=new ChromeDriver();  
	  
	    }
	    
	    @BeforeMethod
	    public void setup() {
	      
	      driver.get(baseurl);
}
}