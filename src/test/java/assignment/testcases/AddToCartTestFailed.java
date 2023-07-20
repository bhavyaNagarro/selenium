package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.searchPage;
import assignment.pages.addToCartFailed;
import assignment.utilities.ReadingPropertiesFile;

public class AddToCartTestFailed extends basePage {
	
	@Test
	public void addToCart() {
		
		driver.findElement(addToCartFailed.input_textbox).sendKeys(ReadingPropertiesFile.getProperty("searchproduct"));
		test.log(LogStatus.INFO, "Input textbox search is popped up");
		
		driver.findElement(addToCartFailed.btn_search).click();
		test.log(LogStatus.INFO, "Search Button is clicked for search the item");
		
		driver.findElement(addToCartFailed.text_productdetail).click();
		test.log(LogStatus.INFO, "Product name text link got clicked");
		
		driver.findElement(addToCartFailed.div_insideButton).findElement(addToCartFailed.btn_addtocart).click();
		test.log(LogStatus.INFO, "Add to cart button got clicked");
		
		//driver.findElement(addToCart.btn_addtocart).click();
		driver.findElement(addToCartFailed.btn_movetocartpage).click();
		test.log(LogStatus.INFO, "Move Item to cart button got clicked");
		
		test.log(LogStatus.FAIL, "Add to Cart testcase failed");
		
		System.out.println("AddToCart Testcase Failed");
		
	}

}
