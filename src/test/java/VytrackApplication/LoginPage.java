package VytrackApplication;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    // Verify that user can successfully log in to VyTrack application page

    // Step 1. Go to log in page of Vytruck
    // Step 2. Enter Valid Credential
    // Step 3. Click login button
    // Step 4. Verify that user log in successfully

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://qa2.vytrack.com/user/login");

        WebElement input = driver.findElement(By.name("_username"));
        input.sendKeys("User175");
        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");
        WebElement button = driver.findElement(By.id("Log in"));
        button.click();

        String expectedUrl = ("http://qa2.vytrack.com");
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.close();



    }
}
