package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FillformUsingRelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		//Thread.sleep(40000);
		
		page.locator("input:below(label:text('User Email'))").first().fill("bhatt.tapan1@gmail.com");
		
	}

}
