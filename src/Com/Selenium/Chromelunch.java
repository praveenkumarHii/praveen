package Com.Selenium;

import java.io.File;
import java.io.IOException;

import javax.crypto.interfaces.DHPrivateKey;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;//predifind
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.StringUtil;

public class Chromelunch {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//Day -1
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// up casting
		// driver.get("https://duckduckgo.com/?q=royal+enfield+classic+350&t=newext&atb=v327-5&ia=web");
		// driver.manage().window().maximize();// maximize
		driver.get("https://www.facebook.com/");
		// driver.get("https://www.amazon.in/");
//========================================================================		
// // Navigation Day -2

		// driver.navigate().to("https://www.google.com/search?q=verna+1.6&oq=verna+1.6&aqs=chrome.."
		// + "69i57j0i512l2j0i457i512j0i512l6.21216j0j4&sourceid=chrome&ie=UTF-8");

		// driver.navigate().back();
		// driver.navigate().forward();
		// driver.navigate().refresh();
		// driver.close();
		// driver.quit();
		// dimension

		// Dimension Size= new Dimension(500,400);

		// driver.manage().window().setSize(Size);

		// String title =driver.getTitle();
		// System.out.println(title);
//=============================================================================
// //Day -3 Webelement Methods

		// WebElement email = driver.findElement(By.id("email"));
		// email.sendKeys("ragavanragavan262@gmail.com");

		// WebElement email=driver.findElement(By.name("email"));
		// email.sendKeys("praveenkumar2942000@gmail.com");

		// WebElement password =driver.findElement(By.name("pass"));

		// password.sendKeys("12345678");

		// WebElement login = driver.findElement(By.name("login"));

		// login.click();
		// WebElement login =driver.findElement(By.name("login"));
		// login.click();

		// webelement task
		// String url = driver.getCurrentUrl();
		// System.out.println(url);

		// Point p = new Point(500,400);
		// driver.manage().window().setPosition(p);

		// String pagesource =driver.getPageSource();
		// System.out.println(pagesource);
//
//		 boolean displayed = password.isDisplayed();
//		 System.out.println(password.isDisplayed());
//		 boolean enabled = password.isEnabled();
//		 System.out.println(enabled);
//		 System.out.println(password.isEnabled());
//		 System.out.println(password.isEnabled());
//		 System.out.println(password.isSelected());
//======================================================================================
//	// 4 Xpath

		// WebElement name = driver.findElement(By.className("//input[email='email']"));
		// name.sendKeys();
		WebElement creat = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		creat.click();
       Thread.sleep(3000);
		WebElement frame = driver.findElement(By.name("firstname"));
		frame.sendKeys("kumar");
		WebElement names = driver.findElement(By.name("lastname"));
		names.sendKeys("thomas");
		WebElement remail = driver.findElement(By.name("reg_email__"));
		remail.sendKeys("praveenkumar294200@gmail.com");
		WebElement returns = driver.findElement(By.name("reg_email_confirmation__"));
		returns.sendKeys("praveenkumar294200@gmail.com");

	WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("praveen");

		WebElement days = driver.findElement(By.id("day"));
		days.sendKeys("19");

		WebElement month1 = driver.findElement(By.id("month"));
		month1.sendKeys("may");
		WebElement year2 = driver.findElement(By.id("year"));
		year2.sendKeys("2000");

		WebElement friend = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][2]"));

		friend.click();
//=========================================================================
//day- 5 screenshot

	//	TakesScreenshot ts = (TakesScreenshot) driver;
	//	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);// use the return type and ts.get value used//outputtype
																// use in type after show the 3 value

	//	File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium\\PraveenSreen\\error1.png");// screen
	//	FileUtils.copyFile(screenshotAs, destination);// use fileutil.copyfile it show (s,d) // shot
       // FileUtils.copyFile(screenshotAs, destination);																									// copy
//===========================================================================							                                              									// path
		// loction
// Task-Click AND Send Keys		

		// driver.get("https://www.amazon.in/");
//		 driver.manage().window().maximize();
//		 WebElement tree = driver.findElement(By.xpath("//input[@dir=\"auto\"][1]"));
//		 tree.sendKeys("realmearzo50a");
//		 WebElement give = driver.findElement(By.xpath("//input[@value=\"Go\"][1]"));
//		 give.click();
//================================================================================
//  single-DROPDOWN day-6

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("12");

	}

}
