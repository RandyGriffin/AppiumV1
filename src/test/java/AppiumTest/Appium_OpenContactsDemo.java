package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Appium_OpenContactsDemo {

	public static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		appiumTest1();
	}
	
	public static void appiumTest1() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("deviceName", "Android");
		caps.setCapability("automationName", "uiAutomator2");
		caps.setCapability("appPackage", "com.android.contacts");
		caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		 
		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url,caps);
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
 	}
}
