package week3.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("ExecuteUpdate");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		
	}

	
}
