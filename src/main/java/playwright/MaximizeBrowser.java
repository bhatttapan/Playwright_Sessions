package playwright;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dm.getHeight();
		int width = (int)dm.getWidth();
		System.out.println(height+" "+width);
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext(new Browser.NewContextOptions().setViewportSize(height, width));
		Page page = browser.newPage();
		page.navigate("https://www.amazon.com");

	}

}
