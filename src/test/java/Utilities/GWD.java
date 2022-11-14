package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    public static WebDriver driver;

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // WebDriver 1 WebbDriver 2
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // chrome , firefox ...

    public static WebDriver getDriver() {
        // extend report türkçe bilgi çalışmaması sebebiyle kondu
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");


        if (threadBrowserName.get()==null)
            threadBrowserName.set("chrome");  // paralel çalıştırma yoksa chrome ile başlat


        if (threadDriver.get() == null) {

            String browserName = threadBrowserName.get();
            switch (browserName) {
                case "chrome":
//                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

                case "firefox":
//                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

//                case "safari":
//                    WebDriverManager.safaridriver().setup();
//                    threadDriver.set(new SafariDriver());
//                    break;
//
//                case "edge":
//                    WebDriverManager.edgedriver().setup();
//                    threadDriver.set(new EdgeDriver());
//                    break;
//
//                case "opera":
//                    WebDriverManager.operadriver().setup();
//                    threadDriver.set(new OperaDriver());
//                    break;
//
//                case "brave":
//
//                    break;
            }
        }

        return threadDriver.get();
    }


    public static void quitDriver() {
        Bekle(5);

        if (threadDriver.get() != null) {
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }

    }


    public static void Bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
