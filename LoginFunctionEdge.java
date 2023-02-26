package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class LoginFunctionEdge {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.edge.driver","C:\\software\\Driver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.findElement(By.id("consent_prompt_submit")).click();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(30));
     //   Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"haas-v2\"]/div[3]/div/div[3]/a[2]")).click();
        driver.findElement(By.id("email-address")).sendKeys("hemant894@googlemail.com");
        WebDriverWait wait1 = new WebDriverWait(driver,ofSeconds(20));
      //  Thread.sleep(1000);
        driver.findElement(By.id("current-password")).sendKeys("TescoLillie6045*");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);


    }
}
