package observeDesignPattern;

public class HistorySubscription extends JournalSubscription{

    public HistorySubscription(Dealer dealer) {
        this.dealer = dealer;
        dealer.addToList(this);
        System.out.println("HistorySubscription subscripe is ok.");
    }

    @Override
    public void sendNotification() {
        System.out.println("Your history journal is ready.You can have it!");
    }
}
