package com.ITlearn.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broswerfactoryclass {
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
		//or
		//public static   WebDriver broswerLaunch(String bname){
		
		//if(bname.equalsIgnoreCase("chrome"));{
		//WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
		//}
		//else if(bname.equalsIgnoreCase("edge")) {
			//WebDriverManager.edgedriver().setup();
			//driver= new EdgeDriver();
			
		//}
//		else {
			//System.out.println(" Invalid broswer");
		//}
			
		//return driver;
	//swtich
	public  static WebDriver broswerLaunch(String bname) {
		switch(bname) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			default:
				System.out.println("Invalid broswer");
			
		}
		return driver;
	}
		
		public static void urllaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		public static void implictwait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
				
	}
		public static void sendkeys(WebElement e , String value) {
			e.sendKeys(value);
			


}
}
