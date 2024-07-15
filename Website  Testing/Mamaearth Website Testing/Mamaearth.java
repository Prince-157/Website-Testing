package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mamaearth {

    public static void main(String[] args) throws InterruptedException {
    	
        WebDriver driver = new ChromeDriver();

        // Open the mamaearth website
        driver.get("https://mamaearth.in/");

        Thread.sleep(2000);
        
        // Maximize the window
        driver.manage().window().maximize();

        // Step 1: Check if you are landed on the correct page or not 
        assert driver.getTitle().contains("Luma") : "Test Case 1 Failed: Incorrect page";

        Thread.sleep(2000);
        

        // Print the URL and title of the page
      	String Url = driver.getCurrentUrl();
      	System.out.println(Url);
      		
      	// Print title of the page
      	String Title = driver.getTitle();
      	System.out.println(Title);
      	
      	
      	
        Thread.sleep(4000);

        // Click on Face < Face Wash
        WebElement Face = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[2]/a"));
        Face.click();

        Thread.sleep(2000);
        
        // Face Wash
        WebElement faceWash = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[2]/div/div[2]/a[2]" ));
        faceWash.click();

        Thread.sleep(2000);
        
        //Scroll Window 
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");
        
        Thread.sleep(2000);
        
        // sort by
        WebElement sortBy = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[5]/div[2]/span/img"));
        sortBy.click();
        
        Thread.sleep(2000);
        
        //Scroll window
        js.executeScript("window.scrollBy(0,500)","");
        
        
        // teaTree
        WebElement teaTree = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[6]/div/div/button[4]"));
        teaTree.click();
        
        Thread.sleep(2000);
        
        //Scroll window
        js.executeScript("window.scrollBy(0,240)","");
        
        
        // Select any Face wash
        WebElement anyFaceWash = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[8]/div[1]/section/section/div[3]/div[1]/div/div/img"));
        anyFaceWash.click();
        
        
        Thread.sleep(3000);
        
        //  Now Click on the hair < Conditioner
        Actions act = new Actions(driver);
        WebElement hair = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[1]/nav/ul/li[3]/a"));
        act.moveToElement(hair).perform();
        
        Thread.sleep(2000);
        
        // Conditioner
        WebElement conditioner = driver.findElement(By.xpath("//*[text()='Conditioner']"));
        act.click(conditioner).perform(); 
        
        
        // Scroll window 
        js.executeScript("window.scrollBy(0,500)");
        
        Thread.sleep(3000);
        
        //sort by 
        WebElement sortby = driver.findElement(By.xpath("//*[text()='Henna']"));
        sortby.click();

        Thread.sleep(8000); 
        
        // Scroll window 
        js.executeScript("window.scrollBy(0,500)");
        
        //Select the product 
        WebElement selectProduct = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[7]/div[1]/section/section/div[1]/div[1]/div/div/img"));
        act.click(selectProduct).perform();
        
        
        // Product is out of Stock 
        // Add to cart 
        // WebElement addCart = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[7]/div[1]/section/section/div/div[2]/div/div/button/span"));
        // act.click(addCart).perform();    
        
    
    }
}