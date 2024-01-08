package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vidusha");
		driver.findElement(By.name("lastname")).sendKeys("Thirunavukkarasu");
		driver.findElement(By.name("reg_email__")).sendKeys("07459277492");
		driver.findElement(By.id("password_step_input")).sendKeys("D@260204");
		
		WebElement dateDD = driver.findElement(By.id("day"));
		Select date = new Select(dateDD);
		date.selectByIndex(2);
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month = new Select(monthDD);
		month.selectByVisibleText("Feb");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year = new Select(yearDD);
		year.selectByValue("1993");
		
		driver.findElement(By.xpath("(//label[text()='Female']/following::input)[1]")).click();
		
		System.out.println(driver.getTitle());		

	}

}
