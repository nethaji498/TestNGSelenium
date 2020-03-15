package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceE2E {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   /* driver.get("https://www.rediff.com/");
	    
	    driver.findElement(By.cssSelector("a[title*='Sign in']")).click();  //CSS regular expression
	    driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("Nethaji User");  ////Xpath regular expression
	    driver.findElement(By.cssSelector("input#password")).sendKeys("Password");   //CSS
	    driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();  //Xpath regular expression
	    
	    driver.close();  */
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Nethaji Subhash Chnadra Bose");
	    driver.findElement(By.cssSelector("input[value*='Google']")).click();
	    
	    driver.close();

	}

}
