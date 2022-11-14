package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckboxRadioButtonTextField {

	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();

	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // real mobile device for this test

	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

	        dc.setCapability(MobileCapabilityType.APP, "C:\\APK\\AndroidUI.apk");
	                                                                               

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        AndroidDriver driver = new AndroidDriver(url, dc);
	        
	        //views option
	        ((WebElement) driver.findElementsById("android:id/text1").get(10)).click();  //Identify views button and click on it. //resource id: android:id/text1

	        //controls option
	        ((WebElement) driver.findElementsById("android:id/text1").get(4)).click();
	        
	        //dark theme option
	        //driver.findElementsById("android:id/text1").get(1).click();   
	        driver.findElementByAccessibilityId("2. Dark Theme").click(); //another way to do it using text instead of resource id
	        
	        
	        
	        //Text Box
	        driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Randy");
	        
	        //checkbox1
	        driver.findElementById("io.appium.android.apis:id/check1").click();
	        
	        
	        //Radio button 1
	        driver.findElementById("io.appium.android.apis:id/radio1").click();

	        // code clicks on views -> controls -> dark theme -> textbox -> checkbox1 -> radio button1 
	}

}
