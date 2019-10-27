package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        // if you have exception: cannot loas class
        // that means that package name, doesn't match location of the class itself
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        // to maxiize browser
        driver.manage().window().maximize();
        driver.get("http://google.com");

        // we want to navigate, to the different page
        // within same browser
        // we not gonna open new browser or new tap
        driver.navigate().to("http://amazon.com");
        // if you want to comeback, to the previous page
        driver.navigate().back();
        //if i want to know URL of current website
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // selenium cannot close browser automatically
        // for this, we use method close()
        driver.quit();

    }
}
