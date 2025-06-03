import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7 {
    public static void main(String[] args) {

        // Create a WebDriver instance (Firefox in this case)
        WebDriver driver = new FirefoxDriver();

        // Create a WebDriverWait instance
        

        // Navigate to the URL
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Get and print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        
            // Locate the input text field using XPath
            WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));

            // Check and print if the input field is enabled before clicking
            System.out.println("Is input field enabled before clicking? " + inputField.isEnabled());

            // Locate the "Enable Input" button and click it
            WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable Input']"));
            enableButton.click();

            // Wait until the input field is enabled
            

            // Check and print if the input field is enabled after clicking
            System.out.println("Is input field enabled after clicking? " + inputField.isEnabled());

        
            
        
            // Close the browser
            driver.quit();
        
    }
}