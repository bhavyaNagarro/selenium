package assignment.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.addPincode;
import assignment.utilities.ReadingPropertiesFile;

public class AddPinCodeTest extends basePage {
	
	@Test
	public void addPinCode() {
		driver.findElement(addPincode.span_addPincode).click();
		test.log(LogStatus.INFO, "Add pincode button got clicked");
		
		driver.findElement(addPincode.input_applyPin).sendKeys(ReadingPropertiesFile.getProperty("pincode"));
		test.log(LogStatus.INFO, "Add Input textbox popped up");
		
		driver.findElement(addPincode.input_applyPin).click();
		test.log(LogStatus.INFO, "Apply code button got clicked");
		
		test.log(LogStatus.PASS, "Add pincode testcase passed");
		
		System.out.println("Add Pincode Testcase Passed");
	}
}
