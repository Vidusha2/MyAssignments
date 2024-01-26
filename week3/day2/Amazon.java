package week3.day2;

public class Amazon extends CanaraBank {
	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery --> Payments");
	}

	@Override
	public void upiPayments() {
		System.out.println("Making UPI Payments --> Payments");
	}

	@Override
	public void cardPayments() {
		System.out.println("Making Card Payments --> Payments");
	}

	@Override
	public void internetBanking() {
		System.out.println("Making payments through Internet Banking --> Payments");
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Record Payment details --> Abstract class CanaraBank");
	}
public static void main(String[] args) {
		Amazon obj1 = new Amazon();
		obj1.cashOnDelivery();
		obj1.upiPayments();
		obj1.cardPayments();
		obj1.internetBanking();
		obj1.recordPaymentDetails();
}

}
