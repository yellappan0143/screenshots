package com.selenium.screenshorts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementScreenShorts {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(20000);
		
//		 Grocery image
		WebElement groceryImg = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		File tempgroceryImg = groceryImg.getScreenshotAs(OutputType.FILE);
		File permgroceryImg= new File("./flipkartimageshots/"+timeStamp+"grocery.png");
		FileUtils.copyFile(tempgroceryImg, permgroceryImg);
		
		// Moblie image
		WebElement mobileImg = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		File tempmobileImg = mobileImg.getScreenshotAs(OutputType.FILE);
		File permmobileImg= new File("./flipkartimageshots/"+timeStamp+"Mobile.png");
		FileUtils.copyFile(tempmobileImg, permmobileImg);

		// Fashion image
		WebElement FashionImg = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		File tempFashionImg = FashionImg.getScreenshotAs(OutputType.FILE);
		File permFashionImg= new File("./flipkartimageshots/"+timeStamp+"Fashion.png");
		FileUtils.copyFile(tempFashionImg, permFashionImg);

		// Electronics image
		WebElement ElectronicsImg = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		File tempElectronicsImg = ElectronicsImg.getScreenshotAs(OutputType.FILE);
		File permElectronicsImg= new File("./flipkartimageshots/"+timeStamp+"Electronics.png");
		FileUtils.copyFile(tempElectronicsImg, permElectronicsImg);

		// Home and Furniture image
		WebElement HomeAndFurnitureImg = driver.findElement(By.xpath("//img[@alt='Home & Furniture']"));
		File tempHomeAndFurnitureImg = HomeAndFurnitureImg.getScreenshotAs(OutputType.FILE);
		File permHomeAndFurnitureImg= new File("./flipkartimageshots/"+timeStamp+"Home&Furniture.png");
		FileUtils.copyFile(tempHomeAndFurnitureImg, permHomeAndFurnitureImg);
		

		// Appliances image
		WebElement AppliancesImg = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		File tempAppliancesImg = AppliancesImg.getScreenshotAs(OutputType.FILE);
		File permAppliancesImg= new File("./flipkartimageshots/"+timeStamp+"Appliances.png");
		FileUtils.copyFile(tempAppliancesImg, permAppliancesImg);

		// beauty Toys image
		WebElement beautyToysImg = driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"));
		File tempbeautyToysImg = beautyToysImg.getScreenshotAs(OutputType.FILE);
		File permbeautyToysImg= new File("./flipkartimageshots/"+timeStamp+"Beauty-Toys&More.png");
		FileUtils.copyFile(tempbeautyToysImg, permbeautyToysImg);

		// travel image
		WebElement travelImg = driver.findElement(By.xpath("//img[@alt='Travel']"));
		File temptravelImg = travelImg.getScreenshotAs(OutputType.FILE);
		File permtravelImg= new File("./flipkartimageshots/"+timeStamp+"Travel.png");
		FileUtils.copyFile(temptravelImg, permtravelImg);

		// Two wheelers imagemm
		WebElement TwowheelersImg = driver.findElement(By.xpath("//img[@alt='Two Wheelers']"));
		File tempTwowheelersImg = TwowheelersImg.getScreenshotAs(OutputType.FILE);
		File permTwowheelersImg= new File("./flipkartimageshots/"+timeStamp+"TwoWheelers.png");
		FileUtils.copyFile(tempTwowheelersImg, permTwowheelersImg);
		
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
