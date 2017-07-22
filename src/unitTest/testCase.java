package unitTest;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver","C:\\Java Projects\\BOOTCAMP FILES\\Lib(all Jar files)\\Geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.rajivgiri.cf/";
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }
	@Test
	public void test() throws Exception {
		driver.get(baseUrl + "/");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    driver.findElement(By.linkText("BigBoxApp")).click();
	    driver.findElement(By.cssSelector("form[name=\"StoreSaleServlet\"] > button[type=\"submit\"]")).click();
	    driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
	    driver.findElement(By.cssSelector("form[name=\"DivisionServlet\"] > button[type=\"submit\"]")).click();
	    driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
	    driver.findElement(By.linkText("Contact Me")).click();
	    driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
	    driver.findElement(By.linkText("Log Out")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
