package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class Luma {

    public static void main(String[] args) throws InterruptedException {
    	
        WebDriver driver = new ChromeDriver();

        // Open the Luma demo store
        driver.get("https://magento.softwaretestingboard.com/");

        Thread.sleep(2000);
        
        // Maximize the window
        driver.manage().window().maximize();

        // Step 1: Check if you are landed on the correct page or not 
        assert driver.getTitle().contains("Luma") : "Test Case 1 Failed: Incorrect page";

        Thread.sleep(2000);

        // Print the URL and title of the page
      	String Url = driver.getCurrentUrl();
      	System.out.println(Url);
      		
      		
      	String Title = driver.getTitle();
      	System.out.println(Title);
      	
      	
      	
        Thread.sleep(3000);

        // TStep 2: Click on Men <Tops <Jackets
        WebElement menLink = driver.findElement(By.linkText("Men"));
        menLink.click();
        

        Thread.sleep(3000);

        WebElement topsLink = driver.findElement(By.linkText("Tops"));
        topsLink.click();
        
        // Scroll down 
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        
        Thread.sleep(1000);


        // Step 3 Category <Hoodies and sweatshirts
        WebElement categoryHoodies = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[2]/div/div[2]/div/div[1]/div[1]"));
        categoryHoodies.click();

        Thread.sleep(1000);
        

        WebElement HoodieAndSweatshirt = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[2]/a" ));
        HoodieAndSweatshirt.click();

        Thread.sleep(2000);
        
        JavascriptExecutor jsf = (JavascriptExecutor) driver;
        jsf.executeScript("window.scrollBy(0,600)", "");
        
        Thread.sleep(2000);
        
        
        // Click on the price
        WebElement price = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[10]/div[1]"));
        price.click();
                

        // Click on the price range from $50 - $59.99
        WebElement priceFilter = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[10]/div[2]/ol/li[2]/a"));
        priceFilter.click();

        Thread.sleep(2000);
        // Scroll down 
        
        JavascriptExecutor jsi = (JavascriptExecutor) driver;
        jsi.executeScript("window.scrollBy(0,300)", "");
        
        Thread.sleep(1000);
        

        // Test Case 5: Select any hoodies
        WebElement hoodieItem = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img"));
        hoodieItem.click();

        Thread.sleep(2000);
        
        // Scroll down 
        
        JavascriptExecutor ji = (JavascriptExecutor) driver;
        ji.executeScript("window.scrollBy(0,300)", "");
        
        Thread.sleep(1000);
       

        // Select Size XL
        WebElement sizeXL = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
        sizeXL.click();

        Thread.sleep(2000);
        
        
        //Color black  
        WebElement colorBlack = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]"));
        colorBlack.click();

        Thread.sleep(2000);
        
       //Add to cart 
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
        addToCartButton.click();
        
        Thread.sleep(8000);
     
        //view cart
        WebElement viewCart = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
        viewCart.click();
        
        
        Thread.sleep(5000);
        
        //ProceedToCheckout
        WebElement ProceedToCheckout= driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
        ProceedToCheckout.click();

        Thread.sleep(5000);
        


        // Gmail information 
        driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("princemuz198@gmail.com");
        Thread.sleep(10000);

        // First Name
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")).sendKeys("Prince");
        
        Thread.sleep(1000);

        
        // last name
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")).sendKeys("Kumar");
        Thread.sleep(2000);
        
        ji.executeScript("window.scrollBy(0,300)", "");
        
        // company 
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input")).sendKeys("Prince lmt");
        Thread.sleep(2000);
        


        // Street Address 
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div[1]/div/input")).sendKeys("Bihar, Muzaffarpur");
        Thread.sleep(2000);

        // city
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input")).sendKeys("Muzaffarpur");

        Thread.sleep(2000);
        ji.executeScript("window.scrollBy(0,300)", "");
        
        Thread.sleep(5000);
        
        // select state/country dropdown 
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select")).click();
        
        
        Thread.sleep(8000);
        // select country or state 
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select/option[2]")).click();
        
        // zipcode
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input")).sendKeys("842002");
        
        // Showing this error 
        //Provided Zip/Postal Code seems to be invalid. Example: 12345-6789; 12345. If you believe it is the right one you can ignore this notice.
        
      
        ji.executeScript("window.scrollBy(0,300)", "");
        
        Thread.sleep(2000);
        
        // phone number 
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input")).sendKeys("8873384873");
        Thread.sleep(2000);

        
        // select delevery charges 
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[2]/td[1]/input")).click();

        Thread.sleep(4000);
        
        //  next button
        driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
        
        
    }
}