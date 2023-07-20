package assignment.pages;

import org.openqa.selenium.By;

public class addToCartFailed {
	public static By input_textbox = By.xpath("//input[@id='twotabsearchtextbox']");
	public static By btn_search = By.xpath("//input[@id='nav-search-submit-button']");
	public static By text_productdetail = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][text()='Apple iPhone 13 (128GB) - Green']");
	public static By div_insideButton = By.xpath("(//div[@class='a-accordion-inner accordion-row-content'])[2]");
	public static By btn_addtocart = By.xpath("//input[@id='add-to-cart-button']");
	public static By btn_movetocartpage = By.xpath("(//input[@class='a-button-input'])[19]");
}
