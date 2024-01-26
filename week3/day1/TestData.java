package week3.day1;

public class TestData {

	public void enterCredentials() {
		System.out.println("enterCredentials --> TestData");

	}
	
	public void navigateToHomePage() {
		System.out.println("navigateToHomePage --> TestData");

	}
	
	public static void main(String[] args) {
		
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
		
	}
	
}
