package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		WebElement countryCode = driver.findElement(By.name("phoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("+44");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("7459277492");
				
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//capture the first LeadID
		WebElement firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String leadID = firstLead.getText();
		System.out.println("Captured LeadID is: " +leadID);
        		
		firstLead.click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter the captured LeadID
		WebElement capturedLeadID = driver.findElement(By.xpath("//input[@name='id']"));
		capturedLeadID.sendKeys(leadID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//Confirmation of successful deletion
		WebElement noRecords = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String recordsText = noRecords.getText();
		System.out.println(recordsText);
		
		if (recordsText.equals("No records to display")) {
			System.out.println("Lead deletion successful");
		} else {
			System.out.println("Lead deletion verification failed");
		}
				
		System.out.println(driver.getTitle());
		
		driver.close();
				
	}

}
