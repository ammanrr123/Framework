import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testapp {
	public static void main(String[] args) throws Exception {
       // System.setProperty("webdriver.ie.driver", "C:\\Users\\ammanrr\\Downloads\\IEDriverServer.exe");
       // WebDriver driver = new InternetExplorerDriver();
        
        System.setProperty("webdriver.chrome.driver","C://Users//ammanrr//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Generated by Selenium IDE
		  driver.get("https://www.msci.com/end-of-day-data-search");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id='_accepttermsbuttonsportlet_WAR_cookiemanager_']/button[1]")).click();
		  driver.switchTo().frame(0);
		  driver.findElement(By.linkText("EAFE")).click();
		  driver.findElement(By.id("container-inner")).click();
		  
		  driver.findElement(By.linkText("Download Data")).click();
		 
		 

}
}