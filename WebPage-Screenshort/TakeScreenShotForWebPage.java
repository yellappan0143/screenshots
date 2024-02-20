package com.selenium.screenshorts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotForWebPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String Timestamp = LocalDateTime.now().toString().replace(':', '-');
		
		driver.get("https://www.facebook.com/");
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File tempFile = ts.getScreenshotAs(OutputType.FILE);
		 File permFile = new File("./defectsshots/"+ Timestamp+"fblogin.png");
		 FileUtils.copyFile(tempFile, permFile);
		 
		driver.manage().window().minimize();
		driver.quit();
		
	}

}

