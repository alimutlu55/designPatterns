package observeDesignPattern;

public class EntertainmentSubscription extends JournalSubscription{

    public EntertainmentSubscription(Dealer dealer) {
        this.dealer = dealer;
        dealer.addToList(this);
        System.out.println("Entertainment subscripe is ok.");
    }

    @Override
    public void sendNotification() {
        System.out.println("Your entertainment subscription is ready. You can have it!");
    }
}
