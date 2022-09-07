package Utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicStaticDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;


    static {
        KalanOncekileriKapat();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

      //  System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
       // System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
     //   driver = new ChromeDriver();

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        driver = new FirefoxDriver();
        //driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli
    }

    public static void BekleKapat() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void KalanOncekileriKapat () {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
        } catch (Exception ignored) {

        }

    }
}