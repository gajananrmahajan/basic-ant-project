package AntPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AntTest {
	WebDriver driver = null;
	
  @Test
  public void testTitle() {
	  System.out.println(driver.getTitle());
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
