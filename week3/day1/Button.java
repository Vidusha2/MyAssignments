package week3.day1;

public class Button extends WebElement{

	public void submit() {
		System.out.println("submit --> Button");

	}
	
	public static void main(String[] args) {
		
		Button bt = new Button();
		bt.click();
		bt.setText("Good Day! How are you");
		bt.submit();
		
	}
	
	
}
