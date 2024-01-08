package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Vidusha");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select indus = new Select(industryDD);
		indus.selectByIndex(3);
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ownershipDD);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
		Select market = new Select(marketingDD);
		market.selectByIndex(6);
		
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();	
				
		
		
	
	}

}
