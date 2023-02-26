package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunctionFirefox {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.geckodriver.driver","C:\\software\\Driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://login.yahoo.com");
        driver.findElement(By.id("login-username")).sendKeys("hemant8943@yahoo.com");
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.id("login-passwd")).sendKeys("v7Tw9DUHdQxnrUm");
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/div/div[3]/div/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[1]/a")).click();
        driver.findElement(By.id("message-to-field")).sendKeys("unifytesting57@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[1]/div[3]/div/div/input")).sendKeys("My Project");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div/div[1]")).sendKeys(" Hello Snehalbhai,\n How are you? I hope you well. I am submitting my project here. Can you please " +
                "provide your feedback after your \n checking? \n Kind Regards, \n \n Hemant.");
   //     driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]")).sendKeys(" Hi I am submitting my homework here.");
    }
}
