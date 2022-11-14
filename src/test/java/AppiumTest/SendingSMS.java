package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SendingSMS {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		    DesiredCapabilities dc = new DesiredCapabilities();

	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // Android Emulator

	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

	        dc.setCapability("appPackage", "com.android.messaging");
	        dc.setCapability("appActivity", "com.android.messaging.ui.conversationlist.ConversationListActivity");
	                                                                               

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        AndroidDriver driver = new AndroidDriver(url, dc);

	        Thread.sleep(2000);

	        driver.findElementById("com.android.messaging:id/start_new_conversation_button").click();
	        
	        driver.findElementById("com.android.messaging:id/recipient_text_view").sendKeys("9618156508"); //961-815-6508

	        driver.findElementById("com.android.messaging:id/compose_message_text").sendKeys("Hello");
	        
	        driver.findElementById("com.android.messaging:id/send_message_button").click();
	        
	}

}
