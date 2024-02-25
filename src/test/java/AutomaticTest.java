import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaticTest {
    @Test
    public void Search(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://visione-del-paradiso.onrender.com");
        String title = browser.getTitle();
        System.out.println(title);
        browser.close();
    }
}