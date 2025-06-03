
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Helloselenium {
  public static void main(String[] args) {
    
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");

    // Perform testing and assertions
   System.out.println(driver.getTitle());

    // Close the browser
    // Feel free to comment out the line below
    // so it doesn't close too quickly
   driver.findElement(By.linkText("About Us")).click();
   System.out.println("new page title: " + driver.getTitle());
    driver.quit();
  }
}
