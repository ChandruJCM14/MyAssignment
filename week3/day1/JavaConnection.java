package week3.day1;

public class JavaConnection extends DataBridge{

	@Override
	public void connect() {
		System.out.println("Application is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Application is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Application is Executed");
		
	}
	public static void main(String[] args) {
		
	
	JavaConnection jc = new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
	jc.executeQuery();
	}
}
