package day27; 
import java.time.Duration; 
public class FluentWaitDemo { 
public static void main(String[] args) throws InterruptedException { 
WebDriver driver=new ChromeDriver(); 
//Fluent wait declaration 
Wait<WebDriver> mywait-new FluentWait<WebDriver> (driver) 
I 
.withTimeout(Duration.ofSeconds(30)) 
.pollingEvery (Duration.ofSeconds(5)) 
.ignoring (NoSuchElementException.class); 
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
ge().window().maximize() driver.manage().window().maximize(); 
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin"); 
driver.close(); 
  WebDriver driver-new ChromeDriver(); 
//Fluent wait declaration 
Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver) 
.withTimeout(Duration.ofSeconds(30)) 
.pollingEvery (Duration.ofSeconds (5)) 
.ignoring (NoSuchElementException.class); 
I 
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); driver.manage().window().maximize(); 
WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() { 
public WebElement apply(WebDriver driver) ( 
return driver.findElement(By.xpath("//input[@placeholder="Username']")); 
} 
}); 
txtUsername.sendKeys("Admin");

}
}
