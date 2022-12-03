package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/java-mcq");
		driver.manage().window().maximize();
		WebElement diffrent = driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
		System.out.println(diffrent.getText());
		WebElement bold = driver.findElement(By.xpath("//a[@href='java-programs']"));
		bold.click();
		WebElement praveen = driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
		System.out.println(praveen.getText());
		
		
		

	}

}
