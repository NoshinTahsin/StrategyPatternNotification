package notificationStrategy;

public class Sms implements Strategy {
	@Override
	public void doPrint( ) {
		 System.out.println("SMS sent!");
	}
	
}
