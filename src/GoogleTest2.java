import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest2 {
	
	
	
	
	@Test
	public void HomePageCheck() throws MalformedURLException 
	
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("Firefox");
		//caps.setPlatform("");
	//	caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	//	caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.224.124:4444"),caps);
		
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
