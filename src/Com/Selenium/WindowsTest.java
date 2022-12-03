package Com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		Thread.sleep(4000);
		WebElement log_close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		log_close.click();
		WebElement mobiles = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[1]"));
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement fashion = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[2]"));
		a.contextClick(fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronic = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[3]"));
		a.contextClick(electronic).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement beauty = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[4]"));
		a.contextClick(beauty).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement furniture = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[7]"));
		a.contextClick(furniture).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement travel = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[8]"));
		a.contextClick(travel).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);		

		Set<String> windowHandles = driver.getWindowHandles();

		for (String praveen : windowHandles) {

			System.out.println(driver.switchTo().window(praveen).getTitle());
		}
			String flight ="Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
			
		
		for (String praveen : windowHandles) {
			
			if(driver.switchTo().window(praveen).getTitle().equalsIgnoreCase(flight)) {  //why to use in equalignorecase?String it change the small,caps
			break;
		}

	}

	}
}
