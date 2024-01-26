package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		- In the search box, type as "bags" and press enter
		WebElement search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		Actions builder = new Actions(driver);
		builder.sendKeys(search, "bags").sendKeys(Keys.RETURN).perform();
		
//		- To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();
		
		Thread.sleep(3000);
//		- Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
//		- Print the count of the items found.
		WebElement count = driver.findElement(By.xpath("//div[@class='length']"));
		String getCount = count.getText();
		System.out.println("The count of the items found: " +getCount);
		
//		- Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> list = new ArrayList<String>();
		
		for (WebElement each : brand) {
			String text = each.getText();
			list.add(text);
		}
		System.out.println("The list of brand of the products are: " +list);
		
//		- Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> list1 = new ArrayList<String>();
		
		for (WebElement each : bagNames) {
			String text1 = each.getText();
			list1.add(text1);
		}
		System.out.println("The list of names of the bags are: " +list1);
		
	}

}
