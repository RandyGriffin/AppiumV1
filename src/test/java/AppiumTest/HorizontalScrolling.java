package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class HorizontalScrolling {

	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();

	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // real mobile device for this test

	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

	        dc.setCapability(MobileCapabilityType.APP, "C:\\APK\\AndroidUI.apk");
	                                                                               

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        AndroidDriver driver = new AndroidDriver(url, dc);

	       //Progress bar/Horizontal scrolling
	        
	        WebElement obj=driver.findElementById("com.android.androidui:id/seekBar1");
	        
	        String val1=driver.findElementById("com.android.androidui:id/textProgress").getText();
	        
	        System.out.println(val1); 
	        TouchAction action=new TouchAction((MobileDriver) driver);
	        
	        action.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,250,250)).release().perform(); // moved value from 0 to 50

	        String val2=driver.findElementById("com.android.androidui:id/textProgress").getText();
	        System.out.println(val2); 
	}

}
