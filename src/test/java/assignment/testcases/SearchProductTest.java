package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.searchPage;
import assignment.utilities.ReadingPropertiesFile;

public class SearchProductTest extends basePage {
	
	@Test
	public void searchProduct() {
		
		driver.findElement(searchPage.input_textbox).sendKeys(ReadingPropertiesFile.getProperty("searchproduct"));
		test.log(LogStatus.INFO, "Input textbox got popped up");
		
		driver.findElement(searchPage.btn_search).click();
		test.log(LogStatus.INFO, "Search button got clicked");
		
		
		test.log(LogStatus.PASS, "Search Product Testcase Passed Successfully");
		
		System.out.println("Search Product Testcase Passed");
	}

}
