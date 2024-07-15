package Assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bikewale {
    public static void main(String[] args) throws InterruptedException {
    	
    	
    	 // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions act = new Actions(driver);
        
        
        // Open the bikewale Website 
        driver.get("https://www.bikewale.com/");
        
        
        Thread.sleep(1000);
        
        // Maximize the window
        driver.manage().window().maximize();
        
     // Step 1: Check if you are landed on the correct page or not 
        assert driver.getTitle().contains("Luma") : "Test Case 1 Failed: Incorrect page";
       
        Thread.sleep(1000);
        
        // Print the URL and title of the page
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		
		String Title = driver.getTitle();
		System.out.println(Title);


        // Select City
        WebElement SelectLocationButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[2]/div[2]/div")));
        SelectLocationButton.click();

        WebElement EnterCity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[7]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]/div/input"));
        EnterCity.sendKeys("144003");

        Thread.sleep(1000);

        WebElement ClickOnCity= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[7]/div[2]/div[2]/div[2]/div/div/div[2]/div/ul/li"));
        ClickOnCity.click();

        // Scroll down 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)", "");
        
        Thread.sleep(4000);


        // Select On TVS Company
        WebElement SelectCompany = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/section/div/div/div[2]/div[1]/div/div/div/div[1]/div/ul/li[6]/a/div[1]/div/img")));
        SelectCompany.click();
        
        Thread.sleep(4000);

        // Top Comparisons 
        WebElement TopComparisons=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/div/span/div")));
        TopComparisons.click();
        
        
        Thread.sleep(4000);
    
        // Reviews
        WebElement Reviews= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/ul/li[4]/div/span")));
        Reviews.click();

        
        Thread.sleep(4000);
        
        
        // Header Menu
        WebElement HeaderMenu= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[1]/div/span")));
        act.click(HeaderMenu).perform();
        
        Thread.sleep(2000);
  
        //New Bikes 
        WebElement NewBikes= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/div/div/nav/ul/li[2]/div[1]/div[1]/div")));
        act.click(NewBikes).perform();
       
        Thread.sleep(3000);
        
        //New Launch
        WebElement NewLaunch= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/div/div/nav/ul/li[2]/div[2]/div/div/ul/li[7]/a/span")));
        NewLaunch.click();

        Thread.sleep(2000);
        
        // Header Menu
        WebElement headerMenue= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/header/div/div[1]/div/span")));
        headerMenue.click();
        

        // Select Home
        WebElement Home1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/div/div/nav/ul/li[1]/div/div/a/span")));
        act.click(Home1).perform();
        
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(0,1200)", "");
        
        Thread.sleep(2000);
        
     
        // click on Body Style
        WebElement BodyStyle= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/section/div/div/div[1]/div/ul/li[4]/div/span")));
        BodyStyle.click();
        
        Thread.sleep(2000);

        // Click on cruiser
        WebElement SelectCruiser= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/section/div/div/div[2]/div[4]/div/div/ul/li[3]/a")));
        SelectCruiser.click();
        
        Thread.sleep(2000);

        // Select the Bike 
        WebElement SelectBike= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/section[2]/div/ul/li[2]/div/div[2]/div[2]/a/h3/span")));
        SelectBike.click();


    }
}