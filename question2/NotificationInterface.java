package question2;

public class NotificationInterface {
    public static void main(String[] args){

        String message="System update available!";
        //Injecting each implementation separately

       //Creating Email notifier object
        Notifier.EmailNotifier emailNotifier=new Notifier.EmailNotifier();

        //Creating SMS notifier object
        Notifier.SMSNotifier smsNotifier=new Notifier.SMSNotifier();

        //Creating an AlertService Object for EmailNotifier
        AlertService emailAlertService=new AlertService(emailNotifier);

        //Creating an AlertService Object for SMSNotifier
        AlertService smsAlertService=new AlertService(smsNotifier);

        //calling alertUser() method
        emailAlertService.alertUser(message);
        smsAlertService.alertUser(message);
    }
}
