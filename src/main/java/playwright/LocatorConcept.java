package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Playwright playwright = Playwright.create();
		Browser  browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bro1 = browser.newContext();
		Page page = bro1.newPage();
		page.navigate("https://www.orangehrm.com/en/book-a-free-demo/");
		
		//Single element with locator
		//Locator locate = page.locator("text = Login");
		//int totalcount = locate.count();
		//System.out.println(totalcount);
		
		//locate.hover();
		//locate.first().click();
		
		
		//Multiple elemetns with locators
		
		Locator countryOptions = page.locator("select#Form_getForm_Country option");
		System.out.println(countryOptions.count());
		
		//List<String> optionsText = countryOptions.allTextContents();
		//for(String e: optionsText) {
			//System.out.println(e);
		//}
		//Thread.sleep(40000);
		page.locator("//input[@name='FullName']").type("Tapan Bhatt");
		
		page.close();
		bro1.close();

	}

}
