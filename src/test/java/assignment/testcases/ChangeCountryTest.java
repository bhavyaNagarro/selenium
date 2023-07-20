package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.changeCountry;

public class ChangeCountryTest extends basePage {
	@Test
	public void changeCountry() {
		driver.findElement(changeCountry.btn_country).click();
		test.log(LogStatus.INFO, "Change country button got clicked for footer.");
		
		test.log(LogStatus.PASS, "Change Your Country Testcase passed");
		
		System.out.println("Change Country Test passed");
	}
}
