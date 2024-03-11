package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Constants.constants;

public class BaseClass {
	
	static String   browsername;
	
	
	public static WebDriver driver;
	
	public static WebDriver initializeDriver() 
	{
		try {
			browsername=ReadDataFromProperty.readDatafromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(GetDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(GetDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(GetDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}

		return driver;
		
	}
	
	
	public static void getTitleofPage()
	{
	String title=	driver.getTitle();
	System.out.println(title);
	}
	
	
	public static void scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(0,500)","");
	}
	
	public static void AddHarcodedwait() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	
	public static void takeScreenShot() throws IOException
	{
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File SrcFile=srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(constants.SCREENSHOTPATH);
		FileUtils.copyFile(SrcFile, DestFile);
		
	}
	
	
	public static void AddImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
