import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class YandexAccountExitTest extends AccountExitTest {
    ChromeDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\yandexdriver.exe");
        driver = new ChromeDriver();
        setWebDriver(driver);
    }
}
