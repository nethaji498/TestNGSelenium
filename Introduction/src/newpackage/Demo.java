package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		
		// Initialize browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*System.setProperty("webdriver.geko.driver", "Path");
		WebDriver driver=new FirefoxDriver();*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_3.150.1.\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		
		// Open Google
		driver.get("http://google.com"); //hit the URL on the browser
		
			
		//Title of Page
		System.out.println(driver.getTitle());  //validate page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct URL
		//System.out.println(driver.getPageSource()); //Page source
		
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();	
		
		// Close browser
		driver.close(); //it closes current browser
		//driver.quit();  //it closes all the browsers opened by Selenium
	}

}
