package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bx1 = browser.newContext();
		Page page = bx1.newPage();
		page.navigate("https://orangehrm.com/en/book-a-free-demo/");
		
		Page popup = page.waitForPopup(() -> {
			page.locator("//img[@alt='facebook logo']").click();
		});
		
		System.out.println("the title of the popup is :" +popup.title());
		 popup.close();
		 System.out.println("the title of the parent page is :"+page.title());
		 page.close();
	
		//page.navigate("https://www.amazon.com");
		
		/*
		 * Page popup = page.waitForPopup(() -> {
		 * page.locator("//img[@alt='facebook logo']").click(); });
		 * 
		 * System.out.println("the title of the popup is :" +popup.title());
		 * popup.close();
		 * System.out.println("the title of the parent page is :"+page.title());
		 * page.close();
		 */
		
		
		/*
		 * Page popup = page.waitForPopup(() ->{
		 * page.locator("a[target='_blank']").click(); });
		 * 
		 * popup.waitForLoadState(); popup.navigate("https://www.facebook.com");
		 * System.out.println("the title of the page is: "+popup.title());
		 * popup.close();
		 * System.out.println("the title of the parent window is:"+page.title());
		 * page.close();
		 */
		
		
		
		
		/*
		 * BrowserContext bx2 = browser.newContext();
		 * 
		 * Page page1 = bx1.newPage(); Page page2 = bx2.newPage();
		 * 
		 * page1.navigate("https://www.facebook.com");
		 * page2.navigate("https://www.amazon.com");
		 */
	}

}
