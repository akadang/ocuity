package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir,"com.dmi.ocuityaiqa.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equals("real")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}else if (device.equals("emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Akash");		
		}
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.dmi.ocuityaiqa");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"crc64044c1e8b932cd6ca.MainActivity");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
