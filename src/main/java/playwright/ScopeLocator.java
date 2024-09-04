package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.LocatorOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ScopeLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		//page.navigate("https://datatables.net/extensions/select/examples/checkbox/checkbox.html");
		page.navigate("https://primeng.org/");
		
		/*
		 * Locator row = page.locator("table#dt-selectdt-select"); row.locator(":scope",
		 * new Locator.LocatorOptions().setHasText("Airi Satou")).locator(
		 * "//input[@class='dt-select-checkbox']").click();
		 * 
		 * row.locator(":scope").allInnerTexts().forEach(e -> System.out.println(e));
		 */
		
		Locator row = page.locator("p-table.p-elemen tr");
		row.locator(":scope", new Locator.LocatorOptions().setHasText(" James Butt ")).locator(".p-checkbox-box").click();
		
		row.locator(":scope").allInnerTexts().forEach(e -> System.out.println(e));
		
	}

}
