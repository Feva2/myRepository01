package windowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        //Switch Window
        //Click on "Add-to-Cart" Button on Second Window

        //Browser Open
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Provide URL
        driver.get("https://www.amazon.in/");
        //Browser Maxed
        driver.manage().window().maximize();
        //Delete Cookies
        driver.manage().deleteAllCookies();

        //String firstWindow = driver.getWindowHandle();

        //Search Box Write "Samsung S22"
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung S22");
        //Click on the Search Button
        driver.findElement(By.id("nav-search-submit-button")).click();
        //Select First Option
        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

        //Second Window
        Set<String> s = driver.getWindowHandles();
        ArrayList ar = new ArrayList<>(s);

        driver.switchTo().window((String) ar.get(1));

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Actions act = new Actions(driver);
        driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
        //act sendkeys (Keys.Escapes).build().performs
        driver.switchTo().window((String) ar.get(0));

        driver.findElement(By.xpath(" //input[@id='nav-search-submit-button']")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        //New Laptop Click
        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
        Thread.sleep(3000);
//        Thread.sleep(1000);
//        driver.findElement(By.id("add-to-cart-button")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        //Worked Properly


        Set<String> abc = driver.getWindowHandles();
        ArrayList xyz = new ArrayList<>(abc);

        driver.switchTo().window((String) xyz.get(0));
        System.out.println("Window Laptop: " + xyz.get(2));
        driver.switchTo().window((String) xyz.get(2));
        //driver.switchTo().window((String) xyz.get(1));

//        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-button")).click();

        Thread.sleep(2000);
        //Actions act1 = new Actions(driver);

        driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();

        driver.switchTo().window((String) xyz.get(1));
        Thread.sleep(2000);
        driver.close();

        // Thread.sleep(2000);
        //driver.quit();
        //Thread.sleep(4000);
        //driver.close();


    }
}
