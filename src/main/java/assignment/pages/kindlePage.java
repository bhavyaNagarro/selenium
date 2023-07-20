package assignment.pages;

import org.openqa.selenium.By;

public class kindlePage {
	
	public static By a_sidebar = By.xpath("//A[@id='nav-hamburger-menu']");
	
	public static By a_kindlebooks = By.xpath("(//A[@href=''])[3]//DIV");
	
	public static By a_sortPrimeEdition = By.xpath("//A[@href='/dp/B07FRJTZ4T?ref_=nav_em_sbc_k_KiNew_0_2_4_2'][text()='All-new Kindle']");

}
