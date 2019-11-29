package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        String actualresult = driver.getTitle();
        String expectedresult = "amazon";
        if(actualresult.equals(expectedresult)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.close();
    }
}
