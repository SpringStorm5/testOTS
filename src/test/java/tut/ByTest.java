package tut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by springstorm on 1/7/18.
 */
public class ByTest {
    WebDriver driver = new ChromeDriver();
    public void logintutby() {

         driver.get("https://www.tut.by/");
        //driver.findElement(By.id("authorize")).click();
        driver.findElement(org.openqa.selenium.By.linkText("Войти")).click();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(org.openqa.selenium.By.xpath(".//*[@class='i-holder'][1]"));
        element.click();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.findElement(org.openqa.selenium.By.xpath("//*[@class=\"i-holder\"]/input[1]")).sendKeys("springstorm@tut.by");
        driver.findElement(org.openqa.selenium.By.xpath("//*[@class=\"b-hold\"][2]/div/input")).sendKeys("6279508Rino");
    }


    public void yandex() {

        driver.findElement(org.openqa.selenium.By.xpath("//*[@class=\"b-hold\"][3]/input")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(org.openqa.selenium.By.xpath("//*[@class=\"b-topbar-i\"]/li[3]/a")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(org.openqa.selenium.By.linkText("Войти в Яндекс.Почту")).click();
        driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
        driver.findElement(org.openqa.selenium.By.xpath("//*[@class=\"passport-Domik-Form-Field\"]/label[1]/input")).sendKeys("springstorm@tut.by");
        driver.findElement(org.openqa.selenium.By.xpath("//*[@class=\"passport-Domik-Form-Field\"][2]/label[1]/input")).sendKeys("6279508Rino");
        driver.findElement(org.openqa.selenium.By.className("passport-Button-Text")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//span[@class=\"mail-NestedList-Item-Info-Link-Text\"]")));
        //String a = driver.findElement(By.xpath("//*[@id=\"nb-1\"]/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/span/a/span/span/span/span[2]")).getText();
        String a = driver.findElement(org.openqa.selenium.By.xpath("//span[@class=\"mail-NestedList-Item-Info-Extras\"]")).getText();
        a = a.substring(3);
        System.out.printf("Входящих писем: %s", a);

    }

    public void exit() {
        driver.close();
        driver.quit();
    }
}

