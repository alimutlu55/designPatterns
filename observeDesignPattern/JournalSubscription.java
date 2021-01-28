package observeDesignPattern;

public abstract class JournalSubscription {
    Dealer dealer;
    abstract void sendNotification();
}
