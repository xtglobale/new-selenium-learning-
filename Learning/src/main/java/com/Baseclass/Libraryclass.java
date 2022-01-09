package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Libraryclass {
	 public static WebDriver driver;
		public static Properties prop;
		public void LanchApplication()  throws IOException

		{
		FileInputStream File=new FileInputStream("C:\\Users\\dpparimi\\Downloads\\learning-selenium-master\\learning-selenium-master\\src\\test\\resources\\Config.property\\config.property");
		prop=new Properties();
		prop.load(File);
		String browser = prop.getProperty("browser");


		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
		WebDriverManager.chromedriver().setup();

		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		}

		public void teardown()
		{
		driver.quit();
		}
		} 


