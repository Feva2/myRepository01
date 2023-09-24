import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class doubleWindowTesting {

    public static void main(String[] args) {
        WebDriver Driver;
        WebDriverManager.chromedriver().setup();
        Driver = new ChromeDriver();

        Driver.get("https://www.amazon.in/");
       // Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).
        WebDriver driver = Driver;
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung s 22");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
        String currentWindowId = driver.getWindowHandle();
        System.out.println("currentWindow "+currentWindowId);

        //driver.getWindowHandles();


        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

        Driver.close();
    }





}
