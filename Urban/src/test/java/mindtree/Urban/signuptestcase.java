package mindtree.Urban;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signuptestcase {

	@Test
	public static void Test3() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.urbanladder.com/");
	       driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span/ul/li[2]/a")).click(); 
			   Thread.sleep(5000);
			
			   WebElement  a1= driver.findElement(By.xpath("//input[@id='spree_user_email']"));
			   a1.click();
			   a1.sendKeys("hdgc@gmail.com");
			  WebElement w2=driver.findElement(By.xpath("//input[@class='textfield required input_authentication']"));
			  w2.click();
			  w2.sendKeys("abcd@123");
			  driver.findElement(By.xpath("//input[@class='button primary signup']")).click();

	}

}
