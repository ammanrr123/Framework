package config;

import java.util.concurrent.TimeUnit;
import static executionEngine.DriverScript.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import executionEngine.DriverScript;
//import org.openqa.selenium.firefox.FirefoxDriver;
import utility.Log;

public class Actionkeywords {

		public static WebDriver driver;
	
	//All the methods in this class now accept 'Object' name as an argument
	public static void openBrowser(String object,String data){	
		try{
			if(data.equals("Mozilla")) {
				driver=new FirefoxDriver();
				Log.info("Moxilla browser opened");
			}
			else if(data.equals("IE")) {
				driver=new InternetExplorerDriver();
				Log.info("Moxilla browser opened");
			}
			else if(data.equals("chrome"))
			{
				
		System.setProperty("webdriver.chrome.driver","C://Users//ammanrr//Downloads//chromedriver.exe");
   	    driver = new ChromeDriver(); 
   	    driver.manage().window().maximize();
   	    driver.manage().deleteAllCookies();
   	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	    Log.info("chrome browser opened");
		}}catch(Exception e){
			Log.info("Not able to open Browser --- " + e.getMessage());
			DriverScript.bResult = false;
			}
		}

	public static void Navigate(String object,String data)
	{	try {
		Log.info("Navigate to URL");
		
		driver.get(Constants.URL);}
		catch(Exception e) {
			Log.info("Not able to navigate --- " + e.getMessage());
			DriverScript.bResult = false;
		}
		}

	
	
	public static void input_UserName(String object,String data){try {
		Log.info("Enter userID");
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data); 
		}catch(Exception e){
			 Log.error("Not able to Enter UserName --- " + e.getMessage());
			 DriverScript.bResult = false;
		 	}}

	public static void input_Password(String object,String data){
		try {
		Log.info("Enter password");
		driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			 Log.error("Not able to Enter Password --- " + e.getMessage());
			 DriverScript.bResult = false;
		 	}}

	public static void waitFor(String object) throws Exception{
		try {
		Log.info("waiting");
		Thread.sleep(5000);
		}catch(Exception e){
			 Log.error("Not able to Wait --- " + e.getMessage());
			 DriverScript.bResult = false;
        	}}

	public static void click_Login(String object,String Data)
	{
		try {
		Log.info("Click on log button");
		driver.findElement(By.xpath(OR.getProperty(object))).click();
	}catch(Exception e){
		 Log.error("Not able to login --- " + e.getMessage());
		 DriverScript.bResult = false;
   	}}
	public static void closeBrowser(String object,String Data){
		try {
		Log.info("Closing the browser");
		driver.quit();
		}catch(Exception e){
			 Log.error("Not able to Close the Browser --- " + e.getMessage());
			 DriverScript.bResult = false;
        	}}

}