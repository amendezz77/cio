package automationCio;

import static org.junit.Assert.*;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class compraTest {

	private WebDriver driver;
	task task;
	@Before
	public void setUp() throws Exception {
		task =new task(driver);
		driver = task.chromeDriverConnection();
		task.visit("https://www.demoblaze.com/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		task.compraProduc();
	}

	
	 
}
