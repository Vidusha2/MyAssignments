package week3.day1;

public class RadioButton extends Button {

	public void selectRadioButton() {
		System.out.println("SelectRadioButton --> RadioButton");

	}
	
	public static void main(String[] args) {
		
		RadioButton rb = new RadioButton();
		rb.click();
		rb.setText("Hi");
		rb.submit();
		rb.selectRadioButton();
		
	}
	
}
