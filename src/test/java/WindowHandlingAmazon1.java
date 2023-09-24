import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAmazon1 {
    public static void main(String[] args){
       // public class WindowHandlingAmazon {
           // public static void main(String[] args) {
               // WebDriver driver;
               // WebDriverManager.chromedriver().setup();
               // driver = new ChromeDriver();

                //driver.get("https://www.amazon.in/");

                //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung s 22");
                //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
                //driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
                //String currentWindowId = driver.getWindowHandle();
                //System.out.println("currentWindow "+currentWindowId);

                //driver.getWindowHandles();


               // driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();



        WebDriver driver;
        WebDriverManager.Chromedriver().setup();
        driver = new ChromeDriver();

        driver.findElement(By.xpath("")).sendKeys("");









    }
}