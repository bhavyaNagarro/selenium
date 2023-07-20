package assignment.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.changeLanguage;

public class ChangeLanguageTest extends basePage {
	
	@Test
	public void changeLanguage() {
		driver.findElement(changeLanguage.btn_hindilanguage).click();
		test.log(LogStatus.INFO, "Change Languae from english to hindi got clicked");
		
		test.log(LogStatus.FAIL, "Change Language testcase got failed");
		
		System.out.println("Change Language Test passed");
	}

}
