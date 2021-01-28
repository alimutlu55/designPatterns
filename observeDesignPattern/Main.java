package observeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        HistorySubscription historySubscription = new HistorySubscription(dealer);
        EntertainmentSubscription entertainmentSubscription = new EntertainmentSubscription(dealer);
        SportSubscription sportSubscription = new SportSubscription(dealer);

        dealer.sendNotificationAllSubscriber();
    }
}
