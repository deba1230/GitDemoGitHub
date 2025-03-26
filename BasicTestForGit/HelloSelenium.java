package BasicTestForGit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class HelloSelenium
{
    @Test
    public void openBrowser()
    {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        System.out.println("Again pushed to repo");

    }
}
