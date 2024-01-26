package week3.day1;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("enterUsername --> LoginTestData");

	}
	
	public void enterPassword() {
		System.out.println("enterPassword --> LoginTestData");

	}
	
	public static void main(String[] args) {
		
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.navigateToHomePage();
		
	}
	
	
}
