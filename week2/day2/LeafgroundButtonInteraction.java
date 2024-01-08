package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click and confirm
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//verify the title of the page
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		if(getTitle.equals("Dashboard")) {
			System.out.println("The title of the page is Dashboard");
		} else {
			System.out.println("not Dashboard");
		}
		
		driver.navigate().back();
		
		//Confirm if the button is disabled
		WebElement disabledButton = driver.findElement(By.xpath("//button[@disabled='disabled']"));
		
		if(disabledButton.isEnabled()) {
			System.out.println("The button is Enabled");
		} else {
			System.out.println("The button is Disabled");
		}
		
		//Find the position of the Submit button
		WebElement submitButton = driver.findElement(By.xpath("//span[text()='Submit']"));
		Point position = submitButton.getLocation();
		System.out.println("The position of the Submit button is: " +position.getX() +", " +position.getY());
		
		//Find the Save button color
		WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
		String backgroundColor = saveButton.getCssValue("background");
		System.out.println("The Background color of the Save button is: " +backgroundColor);
		
		//Find the height and width of Submit button
		WebElement sizeOfSubmit = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension heightAndWidth = sizeOfSubmit.getSize();
		
		System.out.println("The height of the Submit button is: " +heightAndWidth.getHeight());
		System.out.println("The width of the Submit button is: " +heightAndWidth.getWidth());
				
		driver.close();
				
	}

}
