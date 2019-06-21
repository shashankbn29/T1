

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	String 	url="https://www.gmail.com";
		driver.get(url);
		
		
		
		WebElement link = driver.findElement(By.linkText("My Account"));
        link.click();

        Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.close();
	
	
	
	
	
	
	
	}

}
