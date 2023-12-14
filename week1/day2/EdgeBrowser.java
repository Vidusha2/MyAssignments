package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser obj1 = new Browser();
		String data = obj1.launchBrowser("Edge");
		System.out.println(data);
		obj1.loadUrl();

	}

}
