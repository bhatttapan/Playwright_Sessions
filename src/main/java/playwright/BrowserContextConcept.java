package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create playwright server 
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bcon1 = browser.newContext();
		Page p1 = bcon1.newPage();
		p1.navigate("https://www.facebook.com/");
		p1.fill("#email", "bhatt.tapan1@gmail.com");
		System.out.println(p1.title());
		
		
		BrowserContext bcon2 = browser.newContext();
		Page p2 = bcon2.newPage();
		p2.navigate("https://playwright.dev/java/docs/intro");
		System.out.println(p2.title());
		
		//p1.close();
		//bcon1.close();
		
		//p2.close();
		//bcon2.close();
		
		
	}

}
