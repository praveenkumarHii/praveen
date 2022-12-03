package Com.Selenium;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
	//	Dimension size = new Dimension(500, 400);
      //  driver.manage().window().setSize(size);
        driver.manage().window().maximize();
        
        List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
        
        ArrayList<Integer>a = new ArrayList<Integer>();
        
        for (int i = 0; i<allprice.size(); i++) {
        	
        	String replaceAll = allprice.get(i).getText().replaceAll("Rs. ","");
                               	
			int parseInt = Integer.parseInt(replaceAll);
			
			a.add(parseInt);
		} 
			
        int size = a.size();
        
        System.out.println(size);
        
        System.out.println(Collections.max(a));

	}

}
