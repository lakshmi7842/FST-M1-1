package mymavenproject.mymavenproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class asd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LakshmiTatakuntla\\Documents\\Selenium\\chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		Thread.sleep(1000);

		/*
		//Login //a[@href='/account/login?ret=/']
		WebElement login = driver.findElement(By.xpath("//*[@class='dHGf8H']"));
		if(login.isDisplayed()) {
			login.click();
		}
		else{
			
			System.out.println("Element is not present");
		}
		*/
		
		WebElement loginsection = driver.findElement(By.xpath("//*[@class='_1XBjg- row']"));
		
		if(loginsection.isDisplayed()) {
		
		Thread.sleep(1500);
		//login Info
		WebElement username = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		username.clear();
		username.sendKeys("7013936128");
		
		WebElement password =driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		password.sendKeys("Chinni@123");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(5000);
		
	     Actions actions = new Actions(driver);
	
	  //driver.findElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul/li[1]/span[@class='_1QZ6fC _3Lgyp8']")).click();
	     //actions.moveToElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul/li[1]/span[@class='_1QZ6fC _3Lgyp8']"));
	     WebElement e = driver.findElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul/li[1]/span[@class='_1QZ6fC _3Lgyp8']"));
	     actions.moveToElement(e).perform();
	     Thread.sleep(3000);
	}
		
		else {
			
			System.out.println("No login section");
		}
	
		driver.close();
	}
	
	
}

