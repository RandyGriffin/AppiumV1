package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Vertical_Scrolling {
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();

	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // real mobile device for this test

	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

	        dc.setCapability(MobileCapabilityType.APP, "C:\\APK\\AndroidUI.apk");
	                                                                               

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        AndroidDriver driver = new AndroidDriver(url, dc);
	        
	        //vertical scrolling
	        ((WebElement) driver.findElementsById("android:id/text1").get(10)).click();  //Identify views button and click on it. 
	        
	        //capturing all the list items
	        AndroidElement list=(AndroidElement)driver.findElementById("android:id/text1");
	        
	        //Scrolling down until we get the element
	        MobileElement listitem = (MobileElement) driver.findElement(
	        		MobileBy.AndroidUIAutomator(
	        				"new UiScrollable(new UiSelector()).scrollIntoView("
	        					+ "new UiSelector().description(\"Switches\"));"));
	        
	        System.out.println(listitem.getLocation());
	        listitem.click();
}
	}
