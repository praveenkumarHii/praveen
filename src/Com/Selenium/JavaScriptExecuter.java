package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
	//	driver.get("https://www.facebook.com/");
		//driver.get("https://www.album.alexflueras.ro/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;//thise is narrowing type
		/*js.executeScript("window.scrollBy(0,1000)");   //down
		js.executeScript("window.scrollBy(0, -500)");  //up
		js.executeScript("window.scrollBy(4000,0)");    
        js.executeScript("window.scrollBy(-3000, 0)");
		*/
		//WebElement moblies = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		//js.executeScript("arguments[0].click()",moblies);// thise is moblies click open another tab
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		js.executeScript("arguments[0].click()",close);
//		
	WebElement gaming = driver.findElement(By.xpath("(//div[@class='_3-dnWo'])[2]"));
	js.executeScript("arguments[0].scrollIntoView(3000);",gaming);
		
		//task-2
//		
//		WebElement email = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].value='afc004praveenkumar@gmail.com';",email);		
//		WebElement pass = driver.findElement(By.id("pass"));
//		js.executeScript("arguments[0].value='praveenraja999'",pass);
//		WebElement login = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()",login);
//		
//		
		
	}

}
