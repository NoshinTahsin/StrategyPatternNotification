package notificationStrategy;

public class Main {

	public static void main(String[] args) {
		Context context = new Context(new Email());		
		context.executeStrategy( );

        context = new Context(new Sms());		
        context.executeStrategy( );
        
        context=new Context(new NoNotification());
        context.executeStrategy();
   }

}
