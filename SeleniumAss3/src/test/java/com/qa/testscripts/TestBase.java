package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.FlipkartLinks;

public class TestBase{

WebDriver driver;
FlipkartLinks flipOR;

@Parameters({"Browser","Url"})
@BeforeClass
public void SetUp(String Browser,String Url){
	if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.get(Url);
	driver.manage().window().maximize();
	flipOR=new FlipkartLinks(driver);
	}
	else if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win32\\geckodriver.exe" );
		 	driver=new FirefoxDriver();
	        driver.get(Url);
			driver.manage().window().maximize();
	}
	
	else if(Browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","D:\\edgedriver_win64\\msedgedriver.exe" );
		driver=new EdgeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
	else if(Browser.equalsIgnoreCase("opera")) {
		System.setProperty("webdriver.opera.driver", "D:\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		driver=new OperaDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
}
@AfterClass
public void tearDown() {
	driver.close();
}
}