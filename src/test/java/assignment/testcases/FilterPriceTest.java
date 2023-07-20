package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.filterPrice;

public class FilterPriceTest extends basePage {
	
	@Test
	public void filterPrice() {
		driver.findElement(filterPrice.a_todaydeals).click();
		test.log(LogStatus.INFO, "Todays deal link got clicked from menu in home page");
		
		driver.findElement(filterPrice.span_pricefilter).click();
		test.log(LogStatus.INFO, "Price Range filter got clicked.");
		
		test.log(LogStatus.PASS, "Filter Price Testcase passed");
		
		System.out.println("FilterPrice Testcase Passed");
	}

}
