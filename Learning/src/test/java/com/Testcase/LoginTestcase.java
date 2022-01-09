package com.Testcase;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Baseclass.Libraryclass;
import com.Pages.Loginpage;

public class LoginTestcase  extends Libraryclass{
	//WebDriver driver;
		Loginpage face;
		
		@BeforeMethod
		public void Launchapp() throws IOException
		{
		LanchApplication();
		}

		@Test
		public void loginfacebook1()
		{
		face=new Loginpage(driver);
		face.loginfacebook("Admin", "admin123");
		face.button();
		}

		@AfterMethod
		public void closeapp() {
		teardown();
		}

		}

