package observeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    List<JournalSubscription> journalSubscriptionList = new ArrayList<>();


    public void addToList (JournalSubscription journalSubscription){
        journalSubscriptionList.add(journalSubscription);
    }

    public void sendNotificationAllSubscriber(){
        for(JournalSubscription subscriber:journalSubscriptionList){
            subscriber.sendNotification();
        }
    }
}
