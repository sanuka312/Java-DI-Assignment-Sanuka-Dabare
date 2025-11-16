package question2;

public class AlertService {
    private final Notifier notifier;

    //injects notifier via a constructor
    public AlertService(Notifier notifier){
        this.notifier=notifier;
    }

    public void alertUser(String message){
        notifier.send(message);
    }
}
