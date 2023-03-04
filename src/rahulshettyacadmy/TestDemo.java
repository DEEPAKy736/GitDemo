package rahulshettyacadmy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

	
	@Test
	public void titlecheck() throws MalformedURLException
	{
		
		MutableCapabilities caps = new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https://www.bstackdemo.com"),caps);
		
		driver.get("https://rahulshettyacademy.com");
		Assert.assertTrue(driver.getTitle().matches("rahulshettyacademy.com"));
	}
}
