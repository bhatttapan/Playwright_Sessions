package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ParentChildElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		//page.navigate("https://www.orangehrm.com/en/book-a-free-demo/");
		
		//Locator loc = page.locator("select#Form_getForm_Country:has(option[value='India'])");
		//loc.allInnerTexts().forEach(e -> System.out.println(e));
		
		page.navigate("https://www.amazon.com/");
		Locator loc = page.locator("div.navFooterLinkCol:has(a[href='https://www.amazon.jobs'])");
		loc.allInnerTexts().forEach(e ->System.out.println(e));
		
		//List<String> footelinks = page.locator("//div[@class='navFooterLinkCol navAccessibility'][1]/ul").allInnerTexts();
		//for(int i=0; i<footelinks.size(); i++) {
			//System.out.println(footelinks.get(i));
	//	}
		
	}

}
