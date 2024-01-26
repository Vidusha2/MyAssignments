package week3.day1;

public class Browser {

	String browserName;
	float browserVersion;
	
	public void openURL() {
		System.out.println("Open the URL");
		
	}
	
	public void closeBrowser() {
		System.out.println("Close the browser");

	}
	
	public void navigateBack() {
		System.out.println("Navigate back");

	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.openURL();
		br.closeBrowser();
		br.navigateBack();
		
	}
}
