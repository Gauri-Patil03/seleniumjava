package mindtree.Urban;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchtestCase {

	@Test
	public static void Test2() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.urbanladder.com/");
	       Actions actions=new Actions(driver);
	       //driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[3]/a")).click();
	       WebElement  element=driver.findElement(By.id("search"));
	       element.sendKeys("bedroom");
	       element.sendKeys(Keys.ENTER);

	}

}
