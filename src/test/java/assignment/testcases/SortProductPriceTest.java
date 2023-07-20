package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.sortProductPrice;
import assignment.utilities.ReadingPropertiesFile;

public class SortProductPriceTest extends basePage {
	
	@Test
	public void sortProductPrice() {
		
		driver.findElement(sortProductPrice.input_textbox).sendKeys(ReadingPropertiesFile.getProperty("searchproduct"));
		test.log(LogStatus.INFO, "Input textbox popped up");
		
		driver.findElement(sortProductPrice.btn_search).click();
		test.log(LogStatus.INFO, "Search button got clicked");
		
		driver.findElement(sortProductPrice.a_sortPrice).click();
		test.log(LogStatus.INFO, "Sort price button got clicked");
		
		
		test.log(LogStatus.PASS, "Sort Product Price Testcase passed");
		
		System.out.println("Sort Product Price Testcase Passed");
	}

}
