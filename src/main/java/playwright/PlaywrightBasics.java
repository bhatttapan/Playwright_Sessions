package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		
		
	    Browser browser = playwright.chromium().launch(lp);
	    Page page = browser.newPage();
	    
	    page.navigate("https://playwright.dev/java/docs/intro");
	    
	    String pagetitle = page.title();
	    System.out.println("The title of the page is :" +pagetitle);
	    
	    String pageurl = page.url();
	    System.out.println("The url of the page is :" +pageurl);
	    
	    browser.close();
	    playwright.close();
	    

	}

}
