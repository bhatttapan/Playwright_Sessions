package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DevToolsElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		page.navigate("https://www.amazon.com/");
		List<String> allLinks = page.locator("a:has-text('Amazon')").allInnerTexts();
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i));
		}
		
		Locator footerlinks = page.locator("//div[@class='navFooterLinkCol navAccessibility']/ul)");
		footerlinks.allInnerTexts().forEach(e ->System.out.println(e));
		
	}

}
