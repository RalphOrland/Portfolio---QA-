import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileRegistrationAutomation {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Launch the profile registration page
        driver.get("https://example.com/profile-registration");

        // Find the input fields and submit button
        WebElement nameInput = driver.findElement(By.id("name"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement phoneInput = driver.findElement(By.id("phone"));
        WebElement addressInput = driver.findElement(By.id("address"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        // Enter the registration details
        nameInput.sendKeys("John Doe");
        ageInput.sendKeys("25");
        emailInput.sendKeys("johndoe@example.com");
        phoneInput.sendKeys("1234567890");
        addressInput.sendKeys("123 Street, City");

        // Click the submit button
        submitButton.click();

        // Wait for the registration confirmation
        // You can add explicit waits or assertions here to validate the registration success

        // Close the browser
        driver.quit();
    }
}

