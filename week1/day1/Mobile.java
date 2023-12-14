package week1.day1;

public class Mobile {

	void makeCall() {
		String mobileModel = "Iphone XR";
		float mobileWeight = 102.5f;
		System.out.println("Making a call using " + mobileModel +", " +mobileWeight);		
	}
	
	void sendMsg() {
		boolean isFullyCharged = true;
		int mobileCost = 500;
		System.out.println("Is the mobile fully charged? " +isFullyCharged +"\n" +"Cost of the mobile is " +mobileCost);
	}
	
	public static void main(String[] args) {

		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println("This is my mobile");

	}

}
