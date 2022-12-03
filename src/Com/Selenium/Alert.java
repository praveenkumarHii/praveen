package Com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class Alert {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		 driver.get("");
         driver.manage().window().maximize();
		// driver.get("https://www.amazon.in/");

//====================================================================================		
		// driver.get("https://demo.automationtesting.in/Alerts.html");
		// driver.manage().window().maximize();
//		WebElement open = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][1]"));
//		open.click();
//		WebElement ask = driver.findElement(By.xpath("//a[@href='Alerts.html'][1]"));
//		ask.click();
//
//		WebElement asked = driver.findElement(By.xpath("(//button[@class='btn btn-danger'])"));
//		asked.click();
//	    driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		WebElement confirm1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		confirm1.click();
//		WebElement confirm2 = driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
//		confirm2.click();
//		driver.switchTo().alert().accept();
//        WebElement pain = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//        pain.click();
//        WebElement luck = driver.findElement(By.xpath("//button[@class='btn btn-info'][1]"));
//        luck.click();
//        driver.switchTo().alert().getText();
//        driver.switchTo().alert().sendKeys("praveen");
//        driver.switchTo().alert().accept();
//        TakesScreenshot ts = (TakesScreenshot)driver; 
//        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//        File destination=new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error6.png");
//        FileUtils.copyFile(screenshotAs, destination);
		// ============================================================================================

//================================================================================================
		// Single Frame-1
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.manage().window().maximize();
//		WebElement single = driver.findElement(By.id("singleframe"));
//		driver.switchTo().frame(single);
//		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
//		text1.sendKeys("praveenlove");
//		driver.switchTo().defaultContent();
//		WebElement cliam = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		cliam.click();
//		WebElement open1 = driver.findElement(By.xpath("  //a[@class='dropdown-toggle'][1]"));
//		open1.click();
//
//		WebElement open = driver.findElement(By.xpath("//a[@href='Frames.html']"));
//		open.click();
		// WebElement open2 =
		// driver.findElement(By.xpath("//a[@class='analystic'][1]"));
		// open.click();???????
//	   //MultiFrame-2
//		
//		WebElement men = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width:600px'])[1]"));
//		driver.switchTo().frame(men);
//		WebElement end = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 250px;width: 400px'])[1]"));
//		driver.switchTo().frame(end);
//		WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
//		text2.sendKeys("ROSE");
//		 
//		// TakeScreenShot Method
//		
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File destination =new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error7.png");
//		FileUtils.copyFile(screenshotAs, destination);
//=====================================================================================================		

		// Action-Day-10

	Actions a = new Actions(driver);
	WebElement from_element= driver.findElement(By.id("droppable"));
	WebElement to_element = driver.findElement(By.id("draggable"));
	a.clickAndHold(from_element);
	a.moveToElement(from_element);
	a.release(to_element).build().perform();
	a.dragAndDrop(from_element, to_element).build().perform();

		
//		WebElement moblies = driver.findElement(By.xpath("(//a[@data-csa-c-content-id='nav_cs_mobiles'])[1]"));
//		a.contextClick(moblies).build().perform();
// Actions a =new Actions(driver);
//	WebElement vijay = driver.findElement(By.id("draggable"));
//	a.clickAndHold(vijay);
//	a.moveToElement(vijay);
//	WebElement Ajith = driver.findElement(By.id("droppable"));
//	a.release(Ajith).build().perform();
//	
//	TakesScreenshot ts =(TakesScreenshot)driver;
//	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//	File destination =new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error8.png");
//	FileUtils.copyFile(screenshotAs, destination);
//=====================================================================================================	
		// Robot Day-11
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		Actions a = new Actions(driver);
//	
//	Robot r = new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	WebElement todaydeals = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2'][1]"));
//    a.contextClick(todaydeals).build().perform();
//    r.keyPress(KeyEvent.VK_DOWN);
//    r.keyRelease(KeyEvent.VK_DOWN);
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);
//    WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5'][1]"));
//    a.contextClick(electronics).build().perform();
//    r.keyPress(KeyEvent.VK_DOWN);
//    r.keyRelease(KeyEvent.VK_DOWN);
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyPress(KeyEvent.VK_ENTER);
//    
//    //this type used for console print .
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String praveen : windowHandles) {
//			System.out.println(driver.switchTo().window(praveen).getTitle());
//
//		}
//		String mobile="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n"
//				+ "";
//		for (String praveenkumar : windowHandles) {
//			if(driver.switchTo().window(praveenkumar).getTitle().equalsIgnoreCase(mobile)) {
//				
//				break;
//			}
//====================================================================================================    

		// Today Task -11 Robot

//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//
//		Actions a = new Actions(driver);
//		Robot r = new Robot();
//		WebElement log_cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z'][1]"));
//		log_cancel.click();
//		Thread.sleep(4000);
//		WebElement grocery = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[2]"));
//		a.contextClick(grocery).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement mobiles = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[3]"));
//		a.contextClick(mobiles).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement travel = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[8]"));
//		a.contextClick(travel).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//	
////	day_12 Windows Handles
//
//	Set<String> windowHandles = driver.getWindowHandles();
//	for (String praveen : windowHandles) {
//		System.out.println(driver.switchTo().window(praveen).getTitle());
//
//	}
//	String mobile="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n"
//			+ "";
//	for (String praveenkumar : windowHandles) {
//		if(driver.switchTo().window(praveenkumar).getTitle().equalsIgnoreCase(mobile)) {
//			
//			break;
//		}
//====================================================================================================
//	TakesScreenshot ts =(TakesScreenshot)driver;
//	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//	File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error9.png");
//	FileUtils.copyFile(screenshotAs, destination);

	}
}

