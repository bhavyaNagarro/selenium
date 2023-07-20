package assignment.pages;

import org.openqa.selenium.By;

public class filterPrice {
	public static By a_todaydeals = By.xpath("//A[@href='/deals?ref_=nav_cs_gb']");
	public static By span_pricefilter = By.xpath("//SPAN[text()='₹500 to ₹1,000']");
}
