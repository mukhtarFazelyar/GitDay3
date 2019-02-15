package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Orange {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void seup(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void testCleanup(){

        driver.get("http://google.com");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void testSetup(){
        driver.close();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();

    }

      @Test
    public void test1(){
          Assert.assertEquals(driver.getTitle(),"google","google verification");

      }
      @Test
    public void googleloginVerification(){
           Assert.fail("fail on purpose");


      }
}
