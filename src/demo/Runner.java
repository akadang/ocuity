package demo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Runner extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@resource-id='logonIdentifier']").click();
		driver.findElementByXPath("//*[@resource-id='logonIdentifier']").sendKeys("newautodealer51@fake-box.com");
		driver.findElementByXPath("//android.widget.EditText[@text='Password']").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("P@ssword27");
		driver.findElementByXPath("//android.widget.Button[@text='Sign in']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}

}
