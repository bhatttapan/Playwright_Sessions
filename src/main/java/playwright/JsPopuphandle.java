package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JsPopuphandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.onDialog(dialog -> {
			String msg = dialog.message();
			System.out.println(msg);
			dialog.accept("Hi this Tapan here learning and earning in lab");
		});
		
		
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		
		page.locator("//button[text()='Click for JS Alert']").click();
		Thread.sleep(1500);
		String text = page.locator("//p[@id='result']").textContent();
        System.out.println(text);
		
		
		page.locator("//button[text()='Click for JS Confirm']").click();
		Thread.sleep(1500);
		String text1 = page.locator("//p[@id='result']").textContent();
        System.out.println(text1);
        
        
		page.locator("//button[text()='Click for JS Prompt']").click();
		Thread.sleep(1500);
		String text2 = page.locator("//p[@id='result']").textContent();
        System.out.println(text2);
        
        page.close();
        browser.close();
        playwright.close();

	}

}
