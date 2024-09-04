package playwright;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://playwright.dev/java/docs/trace-viewer-intro#opening-the-trace");
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Installation")).click();
      
      page.pause();
      
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Writing tests").setExact(true)).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Generating tests").setExact(true)).click();
      Page page1 = page.waitForPopup(() -> {
        page.getByLabel("GitHub repository").click();
      });
      page1.close();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("What's Next").setExact(true)).click();
    }
  }
}