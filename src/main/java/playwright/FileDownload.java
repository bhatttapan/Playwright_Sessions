package playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://chromedriver.storage.googleapis.com/index.html?path=2.0/");
		
		Download download = page.waitForDownload(() -> {
			page.locator("//a[text()='chromedriver_win32.zip']").click();
		});
        
		System.out.println(download.failure());
		System.out.println(download.url());
		
		String path = download.path().toString();
		System.out.println(path);
		
		download.saveAs(Paths.get("Tapan_chrome.zip"));
		System.out.println(download.suggestedFilename());
	}

}
