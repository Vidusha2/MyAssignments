package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//select fav browser
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding::span[1]")).click();
		
		//click on again and verify if it is unselected
		WebElement unselectableRD = driver.findElement(By.xpath("//label[text()='Chennai']/preceding::span[1]"));
		unselectableRD.click();
		unselectableRD.click();
		        
		//identify the radio button selected by default
		WebElement defaultRD = driver.findElement(By.xpath("//input[@value='Option3']/following::span"));
		if(defaultRD.isSelected()) {
			WebElement selectedRD = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
			String Text = selectedRD.getText();
			System.out.println("The selected radio button is: " +Text);
		}
		
		//select age group if not selected
		WebElement ageGroupRD = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div"));
		if(!ageGroupRD.isSelected()) {
	       System.out.println("Radio button is not selected, performing click");
	       ageGroupRD.click();
	    } else {
			System.out.println("Radio button is already selected, cannot perform click");
		}
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
