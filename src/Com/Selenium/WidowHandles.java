package Com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WidowHandles {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		Thread.sleep(4000);
		WebElement TodayDeals = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
		a.contextClick(TodayDeals).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		a.contextClick(mobiles).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']"));
		a.contextClick(electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String praveen : windowHandles) {
//			System.out.println(driver.switchTo().window(praveen).getTitle());
//
//		}
//		String mobile = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n"
//				+ "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in\r\n"
//				+ "Mobile Phones: Buy New Mobiles Online at Best Prices in India";
//				
//				
//		for (String praveenkumar : windowHandles) {
//			if (driver.switchTo().window(praveenkumar).getTitle().equalsIgnoreCase(mobile)) {
//
//				break;

//			}
//		}

	}

}
