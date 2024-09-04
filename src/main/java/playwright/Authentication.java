package playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brContext = browser.newContext();
		
		Page page = brContext.newPage();
		//page.navigate("https://accounts.google.com/v3/signin/challenge/pwd?TL=AKeb6mz1HtkJErer_OxcuYNkPAp3hZ_2yzG4bddXvMSKUYhbhwXGHfaL0onu_1lF&checkConnection=youtube%3A315&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ddm=0&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en&ifkv=Ab5oB3oEXZoHvrNKCOn8MUE_Z9jYJJJMQhFglVAMHs0BoTKEeDVIU3zAG1L7fahQkctF43UKPy3V&ltmpl=default&osid=1&pstMsg=1&rm=false&scc=1&service=mail&ss=1");
		page.navigate("http://www.automationpractice.pl/index.php");
		
		
		page.locator("xpath=//a[@class='login']").click();
		page.locator("//input[@id='email']").fill("bhatt.tapan04@gmail.com");
		page.locator("//input[@id='passwd']").fill("Automationpractice@1");
		
		//page.locator("xpath=//input[@id='pass']").fill("tapanbhatt");
		page.locator("xpath=//button[@id='SubmitLogin']").click();
		
		brContext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.jason")));
		
	}

}
