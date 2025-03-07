package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Choose Your location as "Chennai" - location is already chosen so no need to choose again
		Thread.sleep(3000);
		//Click on Cinima under Quick Book
		WebElement cinema = driver.findElement(By.xpath("//span[text()='Cinema']"));
		cinema.click();
		//Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		//choose cinema
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		//select date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//select movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='KINGSTON']")).click();
		//select time
		driver.findElement(By.xpath("//span[text()='07:35 PM']")).click();
		//click book button
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(2000);
		//Click any one available seat
		driver.findElement(By.xpath("//span[@id='CL.CLUB|K:23")).click();
		// Click Proceed Button
		driver.findElement(By.xpath("//div[@class='register-btn']/button[text()='Proceed']")).click();
		
		
		
		
	}

}
