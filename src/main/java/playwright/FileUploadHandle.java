package playwright;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class FileUploadHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		/*
		 * page.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");
		 * 
		 * //select just one file
		 * 
		 * page.setInputFiles("input#filesToUpload", Paths.get("applogin.jason"));
		 * Thread.sleep(1400); page.setInputFiles("input#filesToUpload", new Path[0]);
		 * 
		 * 
		 * //select multiple files
		 * 
		 * page.setInputFiles("input#filesToUpload", new Path[] {
		 * Paths.get("applogin.jason"), Paths.get("pom.xml"), Paths.get("trace.zip") });
		 * Thread.sleep(1400); 
		 * page.setInputFiles("input#filesToUpload", new Path[0]);
		 */

		page.navigate("https://cgi-lib.berkeley.edu/ex/fup.html");
		page.setInputFiles("//input[@name='upfile']", new FilePayload("Tapan.txt","text/plain","Tapan is working in lab".getBytes(StandardCharsets.UTF_8)));
		page.locator("//input[@type='submit']").click();
		
		
		
	}

}
