package Com.Selenium;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
//import org.seleniumhq.jetty9.util.security.Password;

//import com.sun.tools.sjavac.CopyFile;

public class Browser {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\" + "eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//
		ChromeDriver driver = new ChromeDriver();
//		 driver.get("https://www.facebook.com/");
		
//		driver.manage().window().maximize();

		// navigation method
//		
//		driver.navigate().to("");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.close();
//		driver.quit();
//=======================================================================
////		//minimize
////		Dimension size =new Dimension(500,400);
////		driver.manage().window().setSize(size);
////		String title = driver.getTitle();
////		System.out.println(title);
////		Point position = new Point(500,400);
////		driver.manage().window().getPosition();
////=======================================================================		
//		// webElement Method
//
//		// WebElement email = driver.findElement(By.id("email"));
//		// email.sendKeys("praveenkumar2942000@gmail.com");
//
//		// WebElement password = driver.findElement(By.name("pass"));
//		// password.sendKeys("12345678");
//		// WebElement login = driver.findElement(By.name("login"));
//		// login.clear();
//
//		// boolean displayed = Password.isdisplayed();
//		// System.out.println(password.isDisplayed());
//		// System.out.println();
//
////		WebElement page = driver.findElement(By.xpath("//a[@button='Create New']"));
////		page.click();
////		Thread.sleep("2000");
//============================================================================		

		// These is Project
		
         driver.get("https://adactinhotelapp.com/");
         driver.manage().window();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("praveenkumarr");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("praveenraja");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(2000);
		WebElement locat = driver.findElement(By.name("location"));
		Select s = new Select(locat);
		s.selectByValue("Brisbane");
		WebElement hot = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hot);
		s1.selectByIndex(2);
		WebElement room = driver.findElement(By.name("room_type"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Super Deluxe");
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(rooms);
		s4.selectByIndex(3);
		WebElement checkin = driver.findElement(By.xpath("(//input[@name='datepick_in'])[1]"));
		checkin.clear();
		WebElement day = driver.findElement(By.xpath("//input[@name='datepick_in'][1]"));
		checkin.sendKeys("11/08/2022");
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out'][1]"));
		checkout.clear();
		WebElement checkout2 = driver.findElement(By.xpath("//input[@name='datepick_out'][1]"));
		checkout.sendKeys("13/08/2022");
		WebElement room1 = driver.findElement(By.xpath("//select[@name='adult_room'][1]"));
		Select s6 = new Select(room1);
		s6.selectByVisibleText("3 - Three");
		WebElement room2 = driver.findElement(By.xpath("//select[@name='child_room'][1]"));
		Select s7 = new Select(room2);
		s7.selectByVisibleText("4 - Four");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();		
		WebElement select1 = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"][1]"));
		select1.click();		
		WebElement condinue = driver.findElement(By.id("continue"));
		condinue.click();
		WebElement name = driver.findElement(By.xpath("//input[@name=\"first_name\"][1]"));
		name.sendKeys("praveen");
		WebElement last = driver.findElement(By.xpath("//input[@id=\"last_name\"][1]"));
		last.sendKeys("love");
		WebElement address = driver.findElement(By.xpath("//textarea[@name=\"address\"][1]"));
		address.sendKeys("8/88,8th block, 9th flor,athipet,ambatthur,chenai 6000121.");
		WebElement card = driver.findElement(By.xpath("//input[@id=\"cc_num\"][1]"));
		card.sendKeys("1234568909657123");
		WebElement type = driver.findElement(By.xpath("//select[@id=\"cc_type\"][1]"));
		Select s11 =new Select(type);
		s11.selectByIndex(3);
		WebElement month = driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"][1]"));
		Select s12=new Select(month );
		s12.selectByVisibleText("February");
		WebElement year = driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"][1]"));
		Select s13 =new Select(year);
		s13.selectByValue("2012");
		WebElement bold = driver.findElement(By.xpath("//input[@id=\"cc_cvv\"][1]"));
		bold.sendKeys("4352");
		WebElement man = driver.findElement(By.xpath("//input[@id=\"book_now\"][1]"));
		man.click();
		Thread.sleep(5000);
		WebElement log= driver.findElement(By.xpath("//input[@id=\"my_itinerary\"][1]"));
	    log.click();		
		Thread.sleep(6000);
		WebElement log2 = driver.findElement(By.xpath("//input[@id=\"logout\"][1]"));
		log2.click();
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error3.png");
//	   FileUtils.copyFile(screenshotAs, dest);
//=============================================================================================		
//	   
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//	       File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error5.png");
//	       FileUtils.copyFile(source, destination);
	       
	       
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}


