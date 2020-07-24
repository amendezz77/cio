package automationCio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class task extends basetest {
	WebDriver driver;
	By login = By.xpath("//a[.='Log in']");
	By inputUser = By.cssSelector("#loginusername");
	By inputPassword = By.cssSelector("#loginpassword");
	By btnLogin = By.xpath("//button[.='Log in']");
	By samsungGalaxy = By.xpath("//a[.='Samsung galaxy s6']");
	
	
	public task(WebDriver driver) {
		//super(driver);
	}
	
	
	public void compraProduc() throws InterruptedException
	{
		
		click(login);
		Thread.sleep(2000);
		if(isDisplayed(inputUser))
		{
			type("amendezz",inputUser);
			Thread.sleep(2000);
			type("Escuela123",inputPassword);
			Thread.sleep(2000);
			click(btnLogin);
			Thread.sleep(2000);
			MovetoElementClick(samsungGalaxy);
		}
	}
	
	
	public  void getscreenshot() throws InterruptedException
    {
           File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
           try {
               FileUtils.copyFile(scrFile, new File("C:\\BACK UP DISCO D\\scr.png"));
           }
           catch(IOException e) {
        	   e.printStackTrace();
           }
    }
}
