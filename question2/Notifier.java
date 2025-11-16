package question2;

public interface Notifier {
    public void send(String message);

    //Creating two implementation as EmailNotifier and SMSNotifier
    public class EmailNotifier implements Notifier{
        @Override
        public void send(String message){
            System.out.println("Sending Email: " +message);
        }
    }

    public class SMSNotifier implements Notifier{
        @Override
        public void send(String message){
            System.out.println("Sending SMS: " +message);
        }
    }
}
