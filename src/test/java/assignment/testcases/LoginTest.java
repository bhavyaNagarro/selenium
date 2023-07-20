package assignment.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.homePage;
import assignment.pages.loginPage;

import assignment.utilities.ReadingPropertiesFile;

public class LoginTest extends basePage {
	@Test
	public void login() {

		driver.findElement(homePage.btn_signIn).click();
		test.log(LogStatus.INFO, "Homepage sign in button got clicked");

		driver.findElement(loginPage.txt_username).sendKeys(ReadingPropertiesFile.getProperty("username"));
		test.log(LogStatus.INFO, "Username Input box popped up");
		
		driver.findElement(loginPage.btn_continue).click();
		test.log(LogStatus.INFO, "Continue button got clicked");
		
		driver.findElement(loginPage.txt_password).sendKeys(ReadingPropertiesFile.getProperty("password"));
		test.log(LogStatus.INFO, "Password Input box popped up");
		
		driver.findElement(loginPage.btn_signIn).click();
		test.log(LogStatus.INFO, "sign in button got clicked");
		
		
		test.log(LogStatus.PASS, "Test case got passed");
		
		System.out.println("Login Test passed");
	}
}
