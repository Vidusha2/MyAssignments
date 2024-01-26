package week3.day1;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println("Take Snap");

	}
	
	public void clearCookies() {
		System.out.println("Cookies cleared");

	}
	
	public static void main(String[] args) {
		
		Edge ed = new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.navigateBack();
		ed.browserName = "Edge Browser";
		System.out.println(ed.browserName);
		
	}
}
