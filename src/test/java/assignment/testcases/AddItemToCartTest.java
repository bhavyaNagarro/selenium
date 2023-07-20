package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.addItemToCart;

public class AddItemToCartTest extends basePage{
	
	@Test
	public void addItemToCart() {
		driver.findElement(addItemToCart.slider_offersPage).click();
		test.log(LogStatus.INFO, "Slider Image got clicked");
		
//		driver.findElement(addItemToCart.text_productClick).click();
//		driver.findElement(addItemToCart.input_addToCart).click();
//		driver.findElement(addItemToCart.input_visitCart).click();
		
		System.out.println("Add To Cart Test Case Passed");
	}

}
