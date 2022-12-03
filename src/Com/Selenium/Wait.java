package Com.Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	
	@SuppressWarnings("unchecked")
	public static <Webdriver> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//		WebElement creat = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		creat.click();
//		WebDriver wait = (WebDriver) new WebDriverWait(driver, 30);
//		    ((FluentWait<WebDriver>) wait).until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("praveen");
		
		driver.findElement(By.id("email")).sendKeys("praveenkumar294200@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("praveenraja");
		driver.findElement(By.name("login")).click();
	 FluentWait<Webdriver> Wait  =new FluentWait<Webdriver>((Webdriver) driver)
			 .withTimeout(Duration.ofSeconds(10))
			 .pollingEvery(Duration.ofSeconds(2))
			 .withMessage("FB.this is custom message")
			 .ignoring(NoSuchElementException.class);
		
	}
}
