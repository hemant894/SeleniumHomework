package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class LoginFuncitonChrome {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver" ,"C:\\software\\Driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, ofSeconds(20));
     //   Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("hemant8943@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Abc098£");
        WebDriverWait wait1=new WebDriverWait(driver,ofSeconds(30));
     //   Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        JavascriptExecutor ja=(JavascriptExecutor) driver;
        ja.executeScript("window.scrollBy(0,5000)");
    }
}
