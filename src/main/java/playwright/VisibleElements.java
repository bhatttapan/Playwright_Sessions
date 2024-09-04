package playwright;

import com.microsoft.playwright.Playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class VisibleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		page.navigate("https://www.amazon.com/");
		List<String> allLinks = page.locator("a:visible").allInnerTexts();
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i));
		}

		int imgcount = page.locator("xpath=//img >>visible=true").count();
		System.out.println(imgcount);
		
	}

}
