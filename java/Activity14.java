import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        // Optional: Set path to geckodriver if not in system PATH
        // System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");

        WebDriver driver = new FirefoxDriver();

        try {
            // Open the URL
            driver.get("https://training-support.net/webelements/tables");

            // Get and print page title
            String title = driver.getTitle();
            System.out.println("Page title: " + title);

            // Find number of rows in tbody
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
            // Find number of columns in thead
            List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));

            System.out.println("Number of rows: " + rows.size());
            System.out.println("Number of columns: " + columns.size());

            // Find and print Book Name in 5th row (first column)
            String bookNameBeforeSort = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[5]/td[1]")).getText();
            System.out.println("Book Name in 5th row before sorting: " + bookNameBeforeSort);

            // Click the "Price" header to sort the table by price ascending
            WebElement priceHeader = driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[4]"));
            priceHeader.click();

            // Wait for the sorting to take effect - wait for stale element or just wait for a small time
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.stalenessOf(rows.get(0)));

            // After sorting, find and print Book Name in 5th row again
            String bookNameAfterSort = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[5]/td[1]")).getText();
            System.out.println("Book Name in 5th row after sorting: " + bookNameAfterSort);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
    
}
