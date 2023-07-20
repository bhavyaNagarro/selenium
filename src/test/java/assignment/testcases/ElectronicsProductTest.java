package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.electronicsProduct;

public class ElectronicsProductTest extends basePage {
	
	@Test
	public void electronicsProduct() {
		driver.findElement(electronicsProduct.a_electronics).click();
		test.log(LogStatus.INFO, "Electronics link tage got clicked from navbar");
		
		test.log(LogStatus.FAIL, "Electronics testcase got failed.");
		
		System.out.println("Electronics Testcase Passed");
	}

}
