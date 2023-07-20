package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.customerService;

public class CustomerServiceTest extends basePage {
	
	@Test
	public void customerService() {
		driver.findElement(customerService.btn_sidebar).click();
		test.log(LogStatus.INFO, "Homepage sidebar got clicked");
		
		driver.findElement(customerService.txt_customerservice).click();
		test.log(LogStatus.INFO, "Customer Service text got clicked from slider");
		
		test.log(LogStatus.PASS, "Customer Service Testcase Passed");
		
		System.out.println("Customer Service Test passed");
	}

}
