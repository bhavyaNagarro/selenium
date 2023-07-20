package assignment.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.kindlePage;

public class KindlePageTest extends basePage {
	
	@Test
	public void KindlePage() {
		driver.findElement(kindlePage.a_sidebar).click();
		test.log(LogStatus.INFO, "Homepage sidebar button got clicked");
		
		driver.findElement(kindlePage.a_kindlebooks).click();
		test.log(LogStatus.INFO, "Kindlebooks text got clicked");
		
		driver.findElement(kindlePage.a_sortPrimeEdition).click();
		test.log(LogStatus.INFO, "Prime edition text got clicked");
		
		test.log(LogStatus.PASS, "Kindle Details Page testcase passed");
		
		System.out.println("Kindle Page Test Case Passed");
		
	}

}
