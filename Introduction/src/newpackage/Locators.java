package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		//driver.findElement(By.className("inputtext")).sendKeys("hello world	"); //multiple values = 1st elements it takes
		/*driver.findElement(By.id("email")).sendKeys("9502475789");
		driver.findElement(By.name("pass")).sendKeys("India@123");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("9502475789");
 		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("9502475789");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		
	}

}
