package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidusha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thirunavukkarasu");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vidusha");
		
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		
		driver.findElement(By.name("description")).sendKeys("Creating a Lead");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sweety.vidu7@gmail.com");
		
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("+44");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7459277492");
				
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByVisibleText("New York");
				
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("Updating my Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
				
	}

}
