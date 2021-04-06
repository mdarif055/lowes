package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SampleAppliTest {

    public static WebDriver driver;
    public static WebDriver browser;
    public static String testname;
    private String Stringactual;
    public static Eyes eyes;
     //System.setProperty("webdriver.chrome.driver", "C:\\Users\\QE636BX\\Sufiyan\\AppliTools\\chromedriver_win32\\chromedriver.exe");

        @Before
        public void Set_Up () {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\QE636BX\\Sufiyan\\AppliTools\\chromedriver_win32\\chromedriver.exe");
            browser = new ChromeDriver();
            driver = new ChromeDriver();
            //Eyes eyes;
            eyes = new Eyes();
            eyes.setApiKey("PLX3dMjEI6tdOwF97McfRS4sc3WzwaawHMbMrePW3TPw110");
            driver = eyes.open(browser, "lowes", testname, new RectangleSize(1000, 600));
        }

        @Rule
        public TestWatcher watcher = new TestWatcher() {
            @Override
            protected void starting(Description description) {
                testname = description.getDisplayName();
            }
        };

        @After
        public void Teardown () {
            eyes.abortIfNotClosed();
            driver.quit();
        }


        @Test
        public void ABVersionlowes_test () {
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\QE636BX\\Sufiyan\\AppliTools\\chromedriver_win32\\chromedriver.exe");
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
           driver.navigate().to("https://www.lowes.com/");
           // driver.navigate().to("https://www.selenium.dev/");

          //  driver.navigate().to("https://www.google.com//");
            eyes.checkWindow("Version A");
           // System.setProperty("webdriver.chrome.driver", "C:\\Users\\QE636BX\\Sufiyan\\AppliTools\\chromedriver_win32\\chromedriver.exe");
         //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
           // driver.findElement(By.id("search-query")).sendKeys("TV");
          //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          //  driver.findElement(By.xpath("//*[@id=\"frmQuickSearch\"]/section/button/svg")).click();
//            driver.navigate().to("https://www.google.com//");
//            eyes.checkWindow("Version B");
            eyes.close();
        }

    @Test
    public void CDVersionlowes_test () {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\QE636BX\\Sufiyan\\AppliTools\\chromedriver_win32\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://www.walmart.com/");
        // driver.navigate().to("https://www.selenium.dev/");

        //  driver.navigate().to("https://www.google.com//");
        eyes.checkWindow("Version C");
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\QE636BX\\Sufiyan\\AppliTools\\chromedriver_win32\\chromedriver.exe");
        //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // driver.findElement(By.id("search-query")).sendKeys("TV");
        //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //  driver.findElement(By.xpath("//*[@id=\"frmQuickSearch\"]/section/button/svg")).click();
            driver.navigate().to("https://www.amazon.com/");
            eyes.checkWindow("Version D");
        eyes.close();
    }


    @Test
    public void eLearning_bitsTest () {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://elearn.bits-pilani.ac.in/user/courses/");
        eyes.checkWindow("eLearningTest");
    }




}



