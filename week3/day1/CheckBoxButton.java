package week3.day1;

public class CheckBoxButton extends Button{

	public void clickCheckButton() {
		System.out.println("clickCheckButton --> CheckBoxButton");

	}
	
	public static void main(String[] args) {
		
		CheckBoxButton cb = new CheckBoxButton();
		cb.submit();
		cb.clickCheckButton();
		cb.click();
		cb.setText("Hello There");
		
	}
}
