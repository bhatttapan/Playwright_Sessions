package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AmazonExperiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		//page.navigate("https://www.amazon.com/");
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		
		/*Locator locate = page.locator("//div[@class='navFooterLinkCol navAccessibility'][1]/ul");
		List<String> listlinks = locate.allInnerTexts();
		for(String e : listlinks) {
			System.out.println(e);
			
		String linkname = page.locator("//a[contains(text(),'Investor Relations')]").textContent();	
		System.out.println(linkname);
		
		//page.locator("//span[@class='action-inner']").click();
		page.locator("//input[@id='twotabsearchtextbox']").fill("iphone");
		
		String text = page.locator("//a[text()='Amazon Science']").textContent();
		System.out.println(text);*/
		
		/*
		 * System.out.println(
		 * "------------------------------------------------------------------");
		 * List<String> allLinks =
		 * page.locator("//a[contains(text(),'Amazon')]").allInnerTexts(); for(String
		 * e1: allLinks) { System.out.println(e1); }
		 * 
		 * System.out.println(allLinks.size());
		 */
		
		Locator loc = page.locator("//table[@id='resultTable']//input");
		System.out.println(loc.count());
		for(int i=0; i<loc.count(); i++) {
			loc.nth(i).click();
		}
		
		
		}
	
	}


