import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {
    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://training-support.net/webelements/alerts");

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Click the button to trigger the SIMPLE alert
        driver.findElement(By.id("simple")).click();

        // Switch focus to alert
        Alert simpleAlert = driver.switchTo().alert();

        // Get alert text and print it
        String alertText = simpleAlert.getText();
        System.out.println("Alert says: " + alertText);

        // Accept the alert
        simpleAlert.accept();

        // Close the browser
        driver.quit();
    }
}
