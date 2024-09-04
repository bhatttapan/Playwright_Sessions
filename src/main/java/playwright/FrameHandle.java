package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
        //page.navigate("https://www.londonfreelance.org/courses/frames/");
        
        //String header = page.frameLocator("//frame[@name='main']").locator("h2").textContent();
        //System.out.println(header);
		
		page.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

        page.locator("//img[@title='Vehicle-Registration-Forms-and-Examples']").click();
        page.frameLocator("//iframe[contains(@id,'frame-one')]").locator("#RESULT_TextField-1").fill("Tapan Bhatt");
		
		
	}

}
