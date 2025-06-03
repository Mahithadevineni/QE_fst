import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        // Optional: Set path to chromedriver if not in PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new FirefoxDriver();

        
            // Open the URL
            driver.get("https://training-support.net/webelements/drag-drop");

            // Get the title of the page and print it
            String title = driver.getTitle();
            System.out.println("Page Title: " + title);

            // Create Actions object
            Actions actions = new Actions(driver);

            // Locate the ball and dropzones
            WebElement ball = driver.findElement(By.id("ball"));
            WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
            WebElement dropZone2 = driver.findElement(By.id("dropzone2"));

            // Drag and drop to Dropzone 1
            actions.clickAndHold(ball).moveToElement(dropZone1).release().build().perform();

            // Verify Dropzone 1 received the ball
            String dropZone1Text = dropZone1.getText();
            if (dropZone1Text.contains("Dropped!")) {
                System.out.println("Ball successfully dropped in Dropzone 1.");
            } else {
                System.out.println("Ball NOT dropped in Dropzone 1.");
            }

             // Optional wait to visually verify

            // Drag and drop to Dropzone 2
            actions.clickAndHold(ball).moveToElement(dropZone2).release().build().perform();

            // Verify Dropzone 2 received the ball
            String dropZone2Text = dropZone2.getText();
            if (dropZone2Text.contains("Dropped!")) {
                System.out.println("Ball successfully dropped in Dropzone 2.");
            } else {
                System.out.println("Ball NOT dropped in Dropzone 2.");
            }

            // Optional wait to view result

        
            
            // Close the browser
            driver.quit();
        
    }
}