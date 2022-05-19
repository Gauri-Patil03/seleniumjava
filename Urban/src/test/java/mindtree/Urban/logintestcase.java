package mindtree.Urban;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintestcase {
    @Test
	public static void Test1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.urbanladder.com/");
	       driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		      Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click(); 
		   Thread.sleep(5000);
		   WebElement wb=driver.findElement(By.xpath("//input[@class='email required input_authentication']"));
          wb.click();
          wb.sendKeys("gauripatil@gmail.com");
WebElement w1=driver.findElement(By.xpath("(//*[@id='spree_user_password'])[3]"));
w1.click();
w1.sendKeys("gauri@123");
driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();

	}

}
