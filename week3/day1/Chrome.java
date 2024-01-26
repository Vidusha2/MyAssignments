package week3.day1;

public class Chrome extends Browser{

	public void openInCognito() {
		System.out.println("Open InCognito");

	}
	
	public void clearCache() {
		System.out.println("Cache cleared");

	}
	
	public static void main(String[] args) {
		
		Chrome ch = new Chrome();
		ch.openInCognito();
		ch.clearCache();
		ch.openURL();
		ch.closeBrowser();
		ch.browserName = "Google Chrome";
		System.out.println(ch.browserName);
		
	}
}
