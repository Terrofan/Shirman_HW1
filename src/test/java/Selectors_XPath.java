import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selectors_XPath extends TestBase{


    @Test
    public void PikabuElementsTest() throws InterruptedException {
        openSite("https://pikabu.ru/");
        driver.findElement(By.xpath("//input[@minlength='3'][@name='username'][@class='input__input']")).click();
        driver.findElement(By.xpath("//input[@minlength='3'][@name='username'][@class='input__input']")).sendKeys("Nikita");
        driver.findElement(By.xpath("//input[@name='password'][@minlength='3']")).click();
        driver.findElement(By.xpath("//input[@name='password'][@minlength='3']")).sendKeys("Shirman");
        driver.findElement(By.xpath("//*[@class='button__title']")).click();
    }






}
