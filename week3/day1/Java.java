package week3.day1;

public class Java {

	public void reportStep(String msg, String status) {
		System.out.println("Message is: " +msg);
		System.out.println("Status is: " +status);
		
	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message is: " +msg);
		System.out.println("Status is: " +status);
		System.out.println("Snapshot taken: " +snap);

	}
	
	public static void main(String[] args) {
		
		Java rs = new Java();
		rs.reportStep("Greetings", "Busy");
		rs.reportStep("Celebrate", "Available", true);
		
	}
}
