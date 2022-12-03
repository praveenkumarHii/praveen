package Com.Selenium;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrobDown {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.leafground.com/");
//		//driver.get("https://www.google.com/search?q=demo.automation&oq=&aqs=chrome.0.35i39i362l8.696423j0j7&sourceid=chrome&ie=UTF-8");
//		driver.manage().window().maximize();

//		 driver.get("https://www.facebook.com/");
//		 driver.manage().window().maximize();
//		 WebElement creat= driver.findElement(By.xpath("(//a[text()='Create New Account'])[1]"));
//		 creat.click();
//		WebElement day = driver.findElement(By.name("birthday_day"));
//		Select s = new Select(day);
//		s.selectByValue("28");
//		
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://www.cars.com/");
//		driver1.manage().window().maximize();		
//==================================================================================
		// navigation method

//driver.navigate().to("https://www.lion.com/");
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
//driver.close();
//driver.quit();

//		thises Maximize size
//  Dimension d= new Dimension(500,400);
		// driver.manage().window().setSize(d);
//===========================================================================
		// MultidropWdown
	//	WebElement driver1 = driver.findElement(By.xpath("//img[@alt=\"ListBox\"]"));
		//driver1.click();
//
//		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
//		Select s = new Select(dropdown1);
//		s.selectByValue("1");
//        WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
//        Select s2 = new Select(dropdown2);
//        s2.deselectByIndex(3);
//
//		WebElement s = driver.findElement(By.xpath("//img[@alt=\"ListBox\"][1]"));
//		s.click();
//		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"dropdown1\"][1]"));
//		Select s1 = new Select(dropdown1);
//		s1.selectByValue("3");
//		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name=\"dropdown2\"][1]"));
//		Select s2 = new Select(dropdown2);
//		s2.selectByIndex(4);
//		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
//		Select s3 = new Select(dropdown3);
//		s3.selectByVisibleText("Appium");
//		WebElement dropdown4 = driver.findElement(By.xpath("//select[@class=\"dropdown\"][1]"));
//		Select s4 = new Select(dropdown4);
//		s4.selectByValue("1");
//		WebElement dropdown5 = driver.findElement(By.xpath("(//select)[5]"));
//		Select s5 = new Select(dropdown5);
//		s5.selectByVisibleText("Loadrunner");
////multiple dropdown		
//		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
//		Select s6 = new Select(multi);
//		s6.selectByValue("1");
//		s6.selectByIndex(3);
//		s6.selectByVisibleText("Appium");
//		boolean multiple = s6.isMultiple();
//		System.out.println("multiple");
//		s6.deselectByIndex(1);
//		s6.deselectByValue("4");
//		s6.selectByIndex(3);
//		s6.selectByValue("2");
//		s6.selectByVisibleText("Appium");
//		s6.deselectByValue("1");
//
//		List<WebElement> options = s6.getOptions();
//		for (WebElement WebElement : options) {
//			System.out.println(WebElement.getText());
//
//		}
//
//		List<WebElement> allSelectedOptions = s6.getAllSelectedOptions();
//		for (WebElement WebElement1 : options) {
//			System.out.println(WebElement1.getText());
//
//		}
//		WebElement firstSelectedOption = s6.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error2.png");
//		FileUtils.copyFile(screenshotAs, destination);
	
		
		
	}
}
