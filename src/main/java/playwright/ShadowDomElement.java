package playwright;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class ShadowDomElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		//1. page---DOM---Shadow-dom----Element
		//   page---DOM---Iframe----shadom-dom----elements
		
		//page.navigate("https://books-pwakit.appspot.com/");
		
	    //page.locator("book-app[apptitle='BOOKS'] #input").fill("Read books");
		
		
		//2.  page---DOM---Iframe----shadom-dom----elements
		page.navigate("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(40000);
		page.frameLocator("#pact").locator("div#snacktime #tea").fill("Ginger masal tea");
	}

}
