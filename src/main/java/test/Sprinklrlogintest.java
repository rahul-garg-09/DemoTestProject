package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Sprinklrlogintest extends BaseClass{
	@Test
	public void LoginTest() throws Exception {
		By by;
//		 // 1. Reset App
//	    //    Clear application data and restart (Auto-generated)
//	    GeneratedUtils.sleep(500);
//	    driver.resetApp();
//		// 1. Is 'getStarted' visible?
//		GeneratedUtils.sleep(500);
//		by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
//		driver.findElement(by).isDisplayed();
//
//		// 2. Click 'getStarted'
//		GeneratedUtils.sleep(500);
//		by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
//		driver.findElement(by).click();
//          Thread.sleep(500);
////		// 3. Make a Swipe gesture from ('590','2025') to ('580','2315')
////		GeneratedUtils.sleep(500);
////		(new TouchAction(driver)).press(PointOption.point(590, 2025))
////				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(580, 2315))
////				.release().perform();
//
////		// 4. Make a Swipe gesture from ('604','2008') to ('593','2301')
////		GeneratedUtils.sleep(500);
////		(new TouchAction(driver)).press(PointOption.point(604, 2008))
////				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(593, 2301))
////				.release().perform();
////		GeneratedUtils.sleep(500);
////		by = MobileBy.AccessibilityId("envSwitcher");
////		driver.findElement(by).isDisplayed();
////		// 5. Click 'envSwitcher'
////		GeneratedUtils.sleep(500);
////		by = MobileBy.AccessibilityId("envSwitcher");
////		driver.findElement(by).click();
////
////		// 6. Type 'Prod' in 'envSwitcher'
////		GeneratedUtils.sleep(500);
////		by = MobileBy.AccessibilityId("envSwitcher");
////		driver.findElement(by).sendKeys("Prod");
//
//		// 7. Clear 'emailAddress' contents
//		GeneratedUtils.sleep(500);
//		by = MobileBy.iOSNsPredicateString(
//				"type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
//		driver.findElement(by).clear();
//
//		// 8. Click 'emailAddress'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.iOSNsPredicateString(
//				"type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
//		driver.findElement(by).click();
//
//		// 9. Type 'rahul.garg@sprinklr.com' in 'emailAddress'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.iOSNsPredicateString(
//				"type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
//		driver.findElement(by).sendKeys("rahul.garg@sprinklr.com");
//
//		// 10. Click 'continueButton'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("continueButton");
//		driver.findElement(by).click();
//
//		// 11. Click 'Sprinklr QA ENV - PROD'
//		GeneratedUtils.sleep(500);
//		by = By.xpath(
//				"//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
//		driver.findElement(by).click();
//
//		// 12. Is 'Enter Password' visible?
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("Enter Password");
//		driver.findElement(by).isDisplayed();
//
//		// 13. Click 'Enter Password'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("Enter Password");
//		driver.findElement(by).click();
//
//		// 14. Type 'Sprinklr@1234' in 'Enter Password'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("Enter Password");
//		driver.findElement(by).sendKeys("Sprinklr@1234");
//
//		// 15. Click 'Log in'
//		GeneratedUtils.sleep(500);
//		by = MobileBy.AccessibilityId("Log in");
//		driver.findElement(by).click();
////		by = MobileBy.AccessibilityId("(555) 564-8583");
////		boolean passed = driver.findElement(by).getText().contains("(555) 564-8583");
////		if (passed) {
////			System.out.println("Test Passed");
////		} else {
////			System.out.println("Test Failed");
////		}
		 // 1. Reset App
	    //    Clear application data and restart (Auto-generated)
	    GeneratedUtils.sleep(500);
	    driver.resetApp();

	    // 2. Is 'getStarted' visible?
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
	    driver.findElement(by).isDisplayed();

	    // 3. Click 'getStarted'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther");
	    driver.findElement(by).click();

	    // 4. Clear 'emailAddress' contents
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
	    driver.findElement(by).clear();

	    // 5. Click 'emailAddress'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
	    driver.findElement(by).click();

	    // 6. Type '{{User_Name}}' in 'emailAddress'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND label == 'emailAddress' AND visible == 1");
	    driver.findElement(by).sendKeys("rahul.garg@sprinklr.com");

	    // 7. Click 'Continue'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeOther' AND label == 'Continue' AND visible == 1");
	    driver.findElement(by).click();

	    // 8. Click 'Sprinklr_QA - QA4'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
	    driver.findElement(by).click();

	    // 9. Click 'Enter Password'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("password");
	    driver.findElement(by).click();

	    // 10. Type '{{Password_Value}}' in 'Enter Password'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("password");
	    driver.findElement(by).sendKeys("Sprinklr@123");

	    // 11. Click 'Let's go'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("Log in");
	    driver.findElement(by).click();

	    // 12. Is 'Allow' visible?
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("Allow");
	    driver.findElement(by).isDisplayed();

	    // 13. Click 'Allow'
	    GeneratedUtils.sleep(500);
	    by = MobileBy.AccessibilityId("Allow");
	    driver.findElement(by).click();

		driver.quit();

	}

}
