package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles",Keys.ENTER);
	    
        List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        //create a list
        List<Integer> list = new ArrayList<Integer>();
        
        //iterate through for each loop
      for (WebElement each : allPrices) {
    	  String text = each.getText();
    	  //replace the "," in order to consider it as an Integer. if not, it will throw NumberFormatException
    	  String replacedString = text.replaceAll(",", "");
    	  //convert replaced string to a int data type - call Integer class and use parseInt method 
    	  int mobilPrices = Integer.parseInt(replacedString);
    	  //add mobile prices into the list
    	  list.add(mobilPrices);
       
      }
      
      //sort the list
      Collections.sort(list);
      System.out.println(list);
      System.out.println("The lowest mobile price is : " +list.get(0));
   
    
    

}

}
