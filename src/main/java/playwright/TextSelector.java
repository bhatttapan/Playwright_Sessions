package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		page.navigate("https://www.orangehrm.com/en/book-a-free-demo/");
		
		Locator locator = page.locator("text=Privacy Policy");
		System.out.println(locator.count());
		for(int i=0; i<locator.count(); i++) {
			String text = locator.nth(i).textContent();
			System.out.println(text);
			if(text.contains("Service Privacy Policy")) {
				locator.nth(i).click();
				break;
			}
		}
		
		String text = page.locator("div.demo-page-slider-content h1:has-text('Manage Your People and Operations in One Place')").textContent();
		System.out.println(text);
		
		String text1 = page.locator("div h4:has-text('We Just Need a Few Details.')").textContent(null);
		System.out.println(text1);
		
		//page.locator("div button:has-text('Book a Free Demo')").click();
		
		String text2 = page.locator("div h3:has-text('Our Clients From Around the World')").textContent();
		System.out.println(text2);
		
		
		
	}

}
