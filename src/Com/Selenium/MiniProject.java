package Com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement okk = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		okk.click();
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		
		WebElement confirm = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		a.moveToElement(confirm).build().perform();
		WebElement click = driver.findElement(By.xpath("(//span[text()='More'])[1]"));
		a.click(click).build().perform();
		WebElement choose = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		choose.clear();
		WebElement choose1 = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		choose1.sendKeys("4");
		WebElement chosen2 = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s =new Select(chosen2);
		s.selectByVisibleText("M");
		WebElement find = driver.findElement(By.name("Blue"));
		a.click(find).build().perform();
		WebElement found = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		a.click(found).build().perform();
		Thread.sleep(4000);
	    WebElement drove = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    a.click(drove).build().perform();
	    WebElement driven = driver.findElement(By.xpath("//input[@name='quantity_1_4_0_0']"));
	   driven.clear();
	   WebElement driven1 = driver.findElement(By.xpath("//input[@name='quantity_1_4_0_0']"));
	   driven1.sendKeys("3");
	   WebElement drink = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	   a.click(drink).build().perform();
	  
	   Thread.sleep(5000);
//=================================================================	   
	   
//	   WebElement drank = driver.findElement(By.xpath("//input[@id='email_create']"));
//	   drank.sendKeys("afc004praveenkumar@gmail.com");
//	    WebElement dunk = driver.findElement(By.name("SubmitCreate"));
//	   a.click(dunk).build().perform();
//	   Thread.sleep(7000);
//	   WebElement run = driver.findElement(By.xpath("//input[@id='id_gender1']"));
//	  a.click(run).build().perform();
//	  WebElement name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
//	  name.sendKeys("Praveen");
//	  WebElement name2 = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
//	  name2.sendKeys("kumar");
//	  WebElement pass = driver.findElement(By.id("passwd"));
//	  pass.sendKeys("Praveen12@");
//	  WebElement day = driver.findElement(By.name("days"));
//	  day.sendKeys("29");
//	  Thread.sleep(8000);
//	  WebElement month = driver.findElement(By.id("months"));
//	  month.sendKeys("April");
//	  WebElement year = driver.findElement(By.id("years"));
//	  year.sendKeys("2000");
//	  WebElement walk = driver.findElement(By.id("newsletter"));
//	  a.click(walk).build().perform();
//	  WebElement walked = driver.findElement(By.id("optin"));
//	  a.click(walked).build().perform();
//	  WebElement companyname = driver.findElement(By.id("company"));
//	  companyname.sendKeys("Tccs");
//	  WebElement addes = driver.findElement(By.id("address1"));
//	  addes.sendKeys("shrgushgo;rjgo;iefjgl;ang");
//	  WebElement addes2 = driver.findElement(By.id("address2"));
//	  addes2.sendKeys("89,9th floor,ambathur,");
//	  WebElement city = driver.findElement(By.id("city"));
//	  city.sendKeys("chennai");
//	  Thread.sleep(9000);
//	  WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
//	  Select s1 =new Select(state);
//	  s1.selectByVisibleText("California");
//	  WebElement postl = driver.findElement(By.id("postcode"));
//	  postl.sendKeys("12345");
//	  WebElement fast = driver.findElement(By.xpath("//select[@id='id_country']"));
//	  Select s2=new Select(fast);
//	  s2.selectByVisibleText("United States");
//	  Thread.sleep(11000);
//	  WebElement  bold = driver.findElement(By.xpath("//textarea[@class='form-control']"));
//	 bold.sendKeys("chennai,ambathur,athipet,tnhpishgpoearjgopwarjgfiojopirgfpoiagfisjfdbngapsiohuf");
//	  WebElement put = driver.findElement(By.id("phone"));
//	 put.sendKeys("9994418337");
//	 WebElement wet = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
//	 wet.sendKeys("9994418336");
//	 WebElement cut = driver.findElement(By.id("alias"));
//	 cut.sendKeys("88,south street");
//	 WebElement knight = driver.findElement(By.name("submitAccount"));
//	a.click(knight).build().perform();
//	 WebElement ran = driver.findElement(By.name("processAddress"));
//	 a.click(ran).build().perform();
      
	  WebElement man = driver.findElement(By.id("email"));
	  man.sendKeys("afc004praveenkumar@gmail.com");
	  WebElement man1 = driver.findElement(By.id("passwd"));
	  man1.sendKeys("Praveen12@");
	  Thread.sleep(7000);
	  WebElement police = driver.findElement(By.id("SubmitLogin"));
	  a.click(police).build().perform();
	  WebElement slow = driver.findElement(By.name("processAddress"));
	  a.click(slow).build().perform();
	 WebElement feel = driver.findElement(By.id("cgv"));
	 a.click(feel).build().perform();
	 WebElement felt = driver.findElement(By.name("processCarrier"));
	 a.click(felt).build().perform();
	 WebElement imagine = driver.findElement(By.className("cheque"));
	 a.click(imagine).build().perform();
	 WebElement girl = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	 a.click(girl).build().perform();
	 
	 
	  
	  
	  
	  
	 
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	 
	   
	   
	    
		

		
	
	
		
		
		
	
	    
	   
		

	}

}
