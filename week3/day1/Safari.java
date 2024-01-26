package week3.day1;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println("Reader mode is ON");

	}
	
	public void fullScreenMode() {
		System.out.println("Full Screen Mode is ON");

	}
	
	public static void main(String[] args) {
		
		Safari sa = new Safari();
		sa.readerMode();
		sa.fullScreenMode();
		sa.closeBrowser();
		sa.browserName = "Safari Browser";
		System.out.println(sa.browserName);
		
	}
}
