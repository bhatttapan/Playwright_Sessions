package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelativeLocators {

	static Page page;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page = browser.newPage();
        page.navigate("https://selectorshub.com/xpath-practice-page/");
        
        selectCheckbox("Joe.Root");
        selectCheckbox("John.Smith");
        
       // String righttext = page.locator("td:right-of(:text('Joe.Root'))").first().textContent();
       // System.out.println(righttext);
        
        System.out.println(getUserRole("Joe.Root"));
        
        String abovetext = page.locator("a:above(:text('Joe.Root'))").first().textContent();
        System.out.println(abovetext);
        
        String belowtext = page.locator("a:below(:text('Joe.Root'))").first().textContent();
        System.out.println(belowtext);
        
        Locator nearElements = page.locator("td:near(:text('Joe.Root'),400)");
        List<String> allnearElements =  nearElements.allInnerTexts();
        for(String e: allnearElements) {
        	System.out.println(e);
        }
        
       
	}
	
	    public static void selectCheckbox(String username) {
	    	page.locator("input[type='checkbox']:left-of(:text('"+username+"'))").first().click();
	    }

	    public static String getUserRole(String username) {
	    	return page.locator("td:right-of(:text('"+username+"'))").first().textContent();
	    }
}
