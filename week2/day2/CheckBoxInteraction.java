package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on Basic checkbox
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		
		//click on Notification checkbox
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		//verify the expected message
		WebElement message = driver.findElement(By.xpath("//span[text()='Checked']"));
		String displayedMessage = message.getText();
		System.out.println("The displayed message is: " +displayedMessage);
		
		String expectedMessage = "Checked";
		
		if(displayedMessage.equals(expectedMessage)) {
			System.out.println("The expected message is displayed as " +displayedMessage);
		} else {
			System.out.println("The expected message is not displayed");
		}
		
		//click on the favourite language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//click on the tri-state checkbox
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		
		//verify tri-state option chosen
		WebElement tristateOption = driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p"));
		String displayState = tristateOption.getText();
		System.out.println("The chosen Tri-state option is: " +displayState);
		
		//click on the toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		//verify toggle switch message
		WebElement toggleMessage = driver.findElement(By.xpath("//span[text()='Checked']"));
		String displayedToggleMsg = toggleMessage.getText();
		System.out.println("The displayed Toggle Switch Message is: " +displayedToggleMsg);
		
		String expectedToggleMsg = "Checked";
		
		if(displayedToggleMsg.equals(expectedToggleMsg)) {
			System.out.println("The expected Message is displayed as " +displayedToggleMsg);
		}
		
		//verify checkbox is disabled
		WebElement disabledCheckbox = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		
		if(disabledCheckbox.isEnabled()) {
			System.out.println("The checkbox is enabled");
		} else {
			System.out.println("The checkbox is disabled");
		}
		
		//select multiple options
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		//selecting london,paris,amsterdam
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Amsterdam']/preceding-sibling::div")).click();
		//closing the dropdown pop up
		driver.findElement(By.xpath("//a[contains(@class,'selectcheckboxmenu')]")).click();
		
		//printing all the cities selected from the dropdown list
		WebElement selectedCities = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
		String getCities = selectedCities.getText();
		System.out.println("The selected Cities are:");
		System.out.println(getCities);
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();
				
	}

}
