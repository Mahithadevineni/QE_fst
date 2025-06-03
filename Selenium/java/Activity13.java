import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {

        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

       
            // Navigate to the webpage
            driver.get("https://training-support.net/webelements/tables");

            // Get and print the title
            String title = driver.getTitle();
            System.out.println("Page title: " + title);

            // Locate table
            WebElement table = driver.findElement(By.xpath("//table"));

            // Get all rows in the table
            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
            int rowCount = rows.size();

            // Get all columns in the first row
            List<WebElement> cols = table.findElements(By.xpath(".//tbody/tr[1]/td"));
            int colCount = cols.size();

            System.out.println("Number of rows: " + rowCount);
            System.out.println("Number of columns: " + colCount);

            // Print all values in the third row
            List<WebElement> thirdRowCells = table.findElements(By.xpath(".//tbody/tr[3]/td"));
            System.out.print("Third row values: ");
            for (WebElement cell : thirdRowCells) {
                System.out.print(cell.getText() + " ");
            }
            System.out.println();

            // Print value at second row second column
            WebElement cellValue = table.findElement(By.xpath(".//tbody/tr[2]/td[2]"));
            System.out.println("Value at second row, second column: " + cellValue.getText());

        
            // Close the browser
            driver.quit();
        }
    }




