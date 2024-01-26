package week3.day1;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("sendRequest with one argument: " +endpoint);

	}
	
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("sendRequest with three arguments: " +endpoint +", " +requestBody +", " +requestStatus);
		
	}
	
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("http1");
		api.sendRequest("http2", "credentials", true);
		
	}
}
