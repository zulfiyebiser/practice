package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBasicNavigation {
    public static void main(String[] args) throws Throwable {
        // to set up chrome driver
        WebDriverManager.chromedriver().setup();
        //to create an object of chrome driver
        ChromeDriver driver = new ChromeDriver();
        //to maximize window
        driver.manage().window().maximize();
        //to call web page
        driver.get("http://google.com");

        Thread.sleep(1000);

        driver.navigate().to("http://instagram.com");

        Thread.sleep(1000);
        // navigate back to the previous URL
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
