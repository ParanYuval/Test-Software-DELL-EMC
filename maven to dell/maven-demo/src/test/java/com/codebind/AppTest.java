package com.codebind;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	@Test
	public void test() {
		//open chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuval\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 	//Chrome moodle				
		driver.get("https://is.sce.ac.il/nidp/idff/sso?id=45&sid=1&option=credential&sid=1&target=https://portal.sce.ac.il/menu/index.php");
		driver.manage().window().maximize();
	    assertEquals("ברוכים הבאים לפורטל שירותי המידע האישי", driver.getTitle());
	    driver.findElement(By.name("Ecom_User_ID")).clear();
	    driver.findElement(By.name("Ecom_User_ID")).sendKeys("yuvalpa");
	    driver.findElement(By.name("Ecom_Password")).clear();
	    driver.findElement(By.name("Ecom_Password")).sendKeys("Yuv1991");
	    driver.findElement(By.name("enter")).click();
	    assertEquals("", driver.getTitle());
	    assertEquals("פורטל שירותי המידע האישי", driver.getTitle());
	    driver.findElement(By.partialLinkText("Moodle")).click();
	    assertEquals("מכללת סמי שמעון - למידה מתוקשבת", driver.getTitle());
	    driver.findElement(By.partialLinkText("בסיסי נתונים")).click();
	    assertEquals("קורס: בסיסי נתונים", driver.getTitle());
	  
	 	//Chrome moodle gmail			  
	    driver.get("https://www.google.com"); 
		driver.manage().window().maximize();
    
	    driver.findElement(By.linkText("Gmail")).click();
	    driver.findElement(By.id("identifierId")).sendKeys("paran.yuval1@gmail.com");
	    driver.findElement(By.cssSelector("content.CwaK9")).click();
	    driver.findElement(By.name("password")).sendKeys("fgkdso");
	    driver.close();
	}

	private static void assertEquals(String string, String title) {
		// TODO Auto-generated method stub
		
	}
	}


