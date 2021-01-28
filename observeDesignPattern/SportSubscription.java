package observeDesignPattern;

public class SportSubscription extends JournalSubscription {

    public SportSubscription(Dealer dealer) {
        this.dealer = dealer;
        dealer.addToList(this);
        System.out.println("SportSubscription subscripe is ok.");
    }

    @Override
    public void sendNotification() {
        System.out.println("Your sport journal is ready. You can have it.");
    }

}
