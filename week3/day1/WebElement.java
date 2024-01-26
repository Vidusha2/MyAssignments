package week3.day1;

public class WebElement {

	public void click() {
		System.out.println("click --> WebElement");

	}
	
	public void setText(String text) {
		System.out.println("setText --> WebElement : " +text);

	}
	
	public static void main(String[] args) {
		
		WebElement we = new WebElement();
		we.click();
		we.setText("Good Day");
		
	}
	
	
	
}
