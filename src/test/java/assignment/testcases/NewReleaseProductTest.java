package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.newReleaseProduct;
import assignment.pages.basePage;

public class NewReleaseProductTest extends basePage {
	
	@Test
	public void newReleaseProduct() {
		
		driver.findElement(newReleaseProduct.header_bestseller).click();
		test.log(LogStatus.INFO, "Bestseller text link got clicked");
		
		driver.findElement(newReleaseProduct.nav_newReleaseProd).click();
		test.log(LogStatus.INFO, "New Release Product textlink got clicked from dropdown");
		
		test.log(LogStatus.PASS, "New Release Testcase Passed Successfully");
		
		System.out.println("New Release Testcase Passed");
	}

}
